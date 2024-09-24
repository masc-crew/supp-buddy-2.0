package io.suppbuddy.suppbuddy_20.service;

import io.suppbuddy.suppbuddy_20.model.Role;
import io.suppbuddy.suppbuddy_20.model.User;
import io.suppbuddy.suppbuddy_20.repository.RoleRepository;
import io.suppbuddy.suppbuddy_20.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public DataLoader(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        if (roleRepository.findByName("ADMIN") == null) {
            Role adminRole = new Role("ADMIN");
            Role userRole = new Role("USER");
            roleRepository.save(adminRole);
            roleRepository.save(userRole);
        }

        if (userRepository.findByUsername("admin") == null) {
            User admin = new User();
            admin.setFirstName("Admin");
            admin.setLastName("User");
            admin.setEmail("admin@example.com");
            admin.setUsername("admin");
            admin.setPassword(passwordEncoder.encode("adminpass"));
            admin.setEnabled(true);
            admin.setRoles(Set.of(roleRepository.findByName("ADMIN")));
            userRepository.save(admin);
        }
    }
}
