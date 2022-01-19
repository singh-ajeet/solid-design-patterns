package org.ajeet.learnings.design.patterns.observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject("Intialized");
        subject.addObserver(new Observer<String>() {
            @Override
            public void update(String msg) {
                System.out.println("Observer 1 observed -> "  + msg);
            }
        });

        subject.addObserver(new Observer<String>() {
            @Override
            public void update(String msg) {
                System.out.println("Observer 2 observed -> "  + msg);
            }
        });

        subject.updateState("update 1");
        subject.updateState("update 2");
        subject.updateState("update 3");
    }
}
