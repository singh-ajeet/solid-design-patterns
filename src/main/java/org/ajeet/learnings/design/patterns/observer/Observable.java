package org.ajeet.learnings.design.patterns.observer;

public interface Observable<T> {
    public boolean addObserver(Observer<T> observer);
    public boolean removeObserver(Observer<T> observer);
    public void notifyObservers();
}
