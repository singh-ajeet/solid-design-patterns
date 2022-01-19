package org.ajeet.learnings.design.patterns.factory;

import java.sql.ResultSet;

public interface DataSource {
    public ResultSet execute(String sql);
}
