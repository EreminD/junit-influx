package com.otus.open.junit;

import com.otus.open.influx.InfluxClient;
import com.otus.open.influx.InfluxConfig;
import com.otus.open.influx.InfluxResultWriter;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class InfluxListenerRunner extends BlockJUnit4ClassRunner {
    private final static String host = System.getProperty("influx.host", "http://ip172-18-0-18-bnmtr28t969000baoklg-8086.direct.labs.play-with-docker.com");
    private final static String user = System.getProperty("influx.user", "root");
    private final static String pass = System.getProperty("influx.pass", "root");
    private final static String db = System.getProperty("influx.db", "otusDb");
    private final static String measurement = System.getProperty("influx.measurement", "STATS");
    private final static String envTag = System.getProperty("influx.envtag", "env2");
    private final InfluxTestListener listener;

    public InfluxListenerRunner(Class<?> klass) throws InitializationError {
        super(klass);
        InfluxConfig config = new InfluxConfig(host, user, pass, db, measurement, envTag);
        InfluxClient client = new InfluxClient(config);
        InfluxResultWriter writer = new InfluxResultWriter(client, config);
        this.listener = new InfluxTestListener(writer);
    }

    @Override
    public void run(RunNotifier notifier) {
        notifier.addListener(listener);
        notifier.fireTestRunStarted(Description.TEST_MECHANISM);
        super.run(notifier);
    }
}
