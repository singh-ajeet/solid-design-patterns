package org.ajeet.learnings.design.patterns.factory;

import java.sql.ResultSet;

public class SqlServerDataSource implements DataSource {
    @Override
    public ResultSet execute(String sql) {
        return null;
    }
}
