package org.ajeet.learnings.design.patterns.abstractfactory;

import java.sql.ResultSet;

public class OracleDataSource implements DataSource{
    @Override
    public ResultSet execute(String sql) {
        return null;
    }
}
