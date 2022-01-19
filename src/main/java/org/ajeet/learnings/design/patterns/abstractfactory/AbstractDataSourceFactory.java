package org.ajeet.learnings.design.patterns.abstractfactory;


public abstract class AbstractDataSourceFactory implements DataSourceFactory {
    private final String configPath;
    protected final Configuration configuration;

    public AbstractDataSourceFactory(String configPath) {
        this.configPath = configPath;
        this.configuration = loadConfiguration(configPath);
    }

    protected Configuration loadConfiguration(String configPath){
        return new Configuration("", "", "", "");
    }

    /**
     * Create an instance of DataSource by using Configuration
     *
     * @return
     */
    public abstract DataSource createDataSource();

}
