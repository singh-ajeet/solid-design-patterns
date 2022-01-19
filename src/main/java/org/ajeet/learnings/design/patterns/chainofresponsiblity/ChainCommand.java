package org.ajeet.learnings.design.patterns.chainofresponsiblity;

public abstract class ChainCommand {
    private final ChainCommand next;

    public ChainCommand(ChainCommand next) {
        this.next = next;
    }

    protected void process(Request request){
        processThisCommand(request);
        if(next != null)
            next.process(request);
    }

    protected abstract void processThisCommand(Request request);
}
