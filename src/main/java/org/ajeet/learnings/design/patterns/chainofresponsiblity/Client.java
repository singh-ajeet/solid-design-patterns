package org.ajeet.learnings.design.patterns.chainofresponsiblity;

public class Client {

    public static void main(String[] args) {
        Account account = new Account("", "");

        UserRepository userRepository = new UserRepository();
        userRepository.registerUser("Ajeet", account);

        OAuthRepository oAuthRepository = new OAuthRepository();
        oAuthRepository.autherizeUser("Ajeet", account);

        ChainCommand chainCommand = new AuthenticationCommand(
                new AutharizationCommand(null, oAuthRepository),
                userRepository);

        chainCommand.process(new Request("Ajeet", "Singh"));
    }
}
