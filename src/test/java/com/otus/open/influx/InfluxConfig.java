package com.otus.open.influx;

public class InfluxConfig {
    private final String host;
    private final String user;
    private final String pass;
    private final String dbName;
    private final String measurement;
    private final String envTag;

    public InfluxConfig(String host, String user, String pass, String dbName, String measurement, String envTag) {
        this.host = host;
        this.user = user;
        this.pass = pass;
        this.dbName = dbName;
        this.measurement = measurement;
        this.envTag = envTag;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getDbName() {
        return dbName;
    }

    public String getMeasurement() {
        return measurement;
    }

    public String getEnvTag() {
        return envTag;
    }

    @Override
    public String toString() {
        return "InfluxConfig{" +
                "host='" + host + '\'' +
                ", user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                ", dbName='" + dbName + '\'' +
                ", measurement='" + measurement + '\'' +
                ", envTag='" + envTag + '\'' +
                '}';
    }
}
