package org.ajeet.learnings.design.patterns.chainofresponsiblity;

public class AutharizationCommand extends ChainCommand {
    private final OAuthRepository oauthRepository;

    public AutharizationCommand(ChainCommand next, OAuthRepository oauthRepository) {
        super(next);
        this.oauthRepository = oauthRepository;
    }

    @Override
    protected void processThisCommand(Request request) {
       if(oauthRepository.isAutherized(request.getUserName()))
           System.out.println(request.getUserName() + " is an autherized user.");
       else
           throw new RuntimeException(request.getUserName() + " is not autherized for this operation.");
    }
}
