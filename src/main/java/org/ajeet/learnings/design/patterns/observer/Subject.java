package org.ajeet.learnings.design.patterns.observer;

import java.util.HashSet;
import java.util.Set;

public class Subject implements Observable<String> {
    private final Set<Observer<String>> observers = new HashSet<>();
    private String state;

    public Subject(String state) {
        this.state = state;
    }

    @Override
    public boolean addObserver(Observer<String> observer) {
        return observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer<String> observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(state));
    }

    public void updateState(String state){
        this.state = state;
        notifyObservers();
    }
}
