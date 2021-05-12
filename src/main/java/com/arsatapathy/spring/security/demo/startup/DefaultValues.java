package com.arsatapathy.spring.security.demo.startup;

import com.arsatapathy.spring.security.demo.model.User;
import com.arsatapathy.spring.security.demo.service.UserService;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DefaultValues implements SmartInitializingSingleton {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void afterSingletonsInstantiated() {

        User ashish = new User(
                "ASHISH_ID",
                "ashish",
                passwordEncoder.encode("ashish"))
                .addAuthority("ASHISH_AUTH1", "ADMIN");

        User snigdha = new User(
                "SNIGDHA_ID",
                "snigdha",
                passwordEncoder.encode("snigdha"))
                .addAuthority("SNIGDHA_AUTH1", "READ")
                .addAuthority("SNIGDHA_AUTH2", "WRITE");

        User chinmay = new User(
                "CHINMAY_ID",
                "chinmay",
                passwordEncoder.encode("chinmay"))
                .addAuthority("CHINMAY_AUTH1", "READ");

        userService.addUser(ashish);
        userService.addUser(snigdha);
        userService.addUser(chinmay);

    }
}
