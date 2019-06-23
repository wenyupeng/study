package com.wen.encoder;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author: wen
 * @Date: 2019/6/19 0:20
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        System.out.println(rawPassword.toString());
        return rawPassword.toString();
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return true;
    }
}
