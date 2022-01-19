package org.ajeet.learnings.design.patterns.factory;

public class UnsupportedDatasourceException extends RuntimeException {
    public UnsupportedDatasourceException(String msg) {
        super(msg);
    }
}
