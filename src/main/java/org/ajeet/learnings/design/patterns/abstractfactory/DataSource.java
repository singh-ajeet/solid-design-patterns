package org.ajeet.learnings.design.patterns.abstractfactory;

import java.sql.ResultSet;

public interface DataSource {
    public ResultSet execute(String sql);
}
