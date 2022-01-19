package org.ajeet.learnings.design.patterns.chainofresponsiblity;

import java.util.HashMap;
import java.util.Map;

public class OAuthRepository {
    private final Map<String, Account> users = new HashMap<>();

    public boolean isAutherized(String username){
        return users.containsKey(username);
    }

    public void autherizeUser(String userName, Account account) {
        users.put(userName, account);
    }
}
