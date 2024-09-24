package io.suppbuddy.suppbuddy_20.service;

import io.suppbuddy.suppbuddy_20.model.Role;
import io.suppbuddy.suppbuddy_20.model.User;
import io.suppbuddy.suppbuddy_20.repository.RoleRepository;
import io.suppbuddy.suppbuddy_20.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserServiceImpl {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setEnabled(true);
        Role userRole = roleRepository.findByName("USER");
        user.setRoles(Collections.singleton(userRole)); // Assign default role USER
        userRepository.save(user);
    }

    // Fetch user by username
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}

