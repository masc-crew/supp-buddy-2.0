package io.suppbuddy.suppbuddy_20.service;

import io.suppbuddy.suppbuddy_20.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);}
