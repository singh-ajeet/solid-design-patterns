package org.ajeet.learnings.design.patterns.abstractfactory;

public class OracleDataSourceFactory extends AbstractDataSourceFactory{

    public OracleDataSourceFactory(String configPath) {
        super(configPath);
    }

    @Override
    public DataSource createDataSource() {
        return new OracleDataSource();
    }
}
