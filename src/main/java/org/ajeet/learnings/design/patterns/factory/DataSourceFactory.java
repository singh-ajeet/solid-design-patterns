package org.ajeet.learnings.design.patterns.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class DataSourceFactory {
    private final Map<DatasourceType, DataSource> datasource =  new ConcurrentHashMap<>();

    public DataSource createDataSource(DatasourceType datasourceType){
        switch(datasourceType){
            case Oracle: return datasource.putIfAbsent(DatasourceType.Oracle, new OracleDataSource());
            case PostGre: return datasource.putIfAbsent(DatasourceType.PostGre, new PostgreDataSource());
            case SqlServer: return datasource.putIfAbsent(DatasourceType.SqlServer, new SqlServerDataSource());
            case MySql: return datasource.putIfAbsent(DatasourceType.MySql, new MysqlDataSource());

            default: throw new UnsupportedDatasourceException(String.format("DataSource type %s is not supported by application.", datasourceType));
        }
    }
}
