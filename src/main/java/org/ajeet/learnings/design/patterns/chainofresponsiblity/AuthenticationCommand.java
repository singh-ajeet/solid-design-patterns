package org.ajeet.learnings.design.patterns.chainofresponsiblity;

public class AuthenticationCommand extends ChainCommand {
    private final UserRepository userRepository;

    public AuthenticationCommand(ChainCommand next, UserRepository userRepository) {
        super(next);
        this.userRepository = userRepository;
    }

    @Override
    protected void processThisCommand(Request request) {
       if(userRepository.hasAccount(request.getUserName()))
           System.out.println(request.getUserName() + " is an authenticated user.");
       else
           throw new RuntimeException("This is not a valid user.");
    }
}
