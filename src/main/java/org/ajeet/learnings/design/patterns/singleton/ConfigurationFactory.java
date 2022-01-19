package org.ajeet.learnings.design.patterns.singleton;

public final class ConfigurationFactory {
    /**
     * This is thread safe
     *
     * @return
     */
    public static Configuration getInstance(){
        return ConfigurationInstanceHolder.CONFIGURATION;
    }

    private static class ConfigurationInstanceHolder {
        /*
        This instance will be initialized once client will call getInstance() method.
         */
        private static final Configuration CONFIGURATION = new Configuration();
    }
}
