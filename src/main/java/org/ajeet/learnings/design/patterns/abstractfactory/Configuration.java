package org.ajeet.learnings.design.patterns.abstractfactory;

public class Configuration {
    private final String jdbcUrl;
    private final String user;
    private final String password;
    private final String driver;

    public Configuration(String jdbcUrl, String user, String password, String driver) {
        this.jdbcUrl = jdbcUrl;
        this.user = user;
        this.password = password;
        this.driver = driver;
    }

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getDriver() {
        return driver;
    }
}
