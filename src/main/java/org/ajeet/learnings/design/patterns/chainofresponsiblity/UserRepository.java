package org.ajeet.learnings.design.patterns.chainofresponsiblity;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<String, Account> users = new HashMap<>();

    public boolean hasAccount(String username){
        return users.containsKey(username);
    }

    public void registerUser(String userName, Account account) {
        users.put(userName, account);
    }
}
