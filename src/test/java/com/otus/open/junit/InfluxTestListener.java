package com.otus.open.junit;

import com.otus.open.influx.InfluxResultWriter;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

public class InfluxTestListener extends RunListener {

    private final InfluxResultWriter influxWriter;

    public InfluxTestListener(InfluxResultWriter writer) {
        super();
        this.influxWriter = writer;
    }

    @Override
    public void testRunFinished(Result result) {
        influxWriter.writeStats(result);
    }
}


//    @Override
//    public void testRunStarted(Description description) throws Exception {
//        System.out.println("testRunStarted " + description.getDisplayName());
//    }
//
//    @Override
//    public void testStarted(Description description) throws Exception {
//        System.out.println("testStarted " + description.getDisplayName());
//    }
//
//    @Override
//    public void testFinished(Description description) throws Exception {
//        System.out.println("testFinished "  + description.getDisplayName());
//    }
//
//    @Override
//    public void testFailure(Failure failure) throws Exception {
//        System.out.println("testFailure " + failure.getException());
//    }

