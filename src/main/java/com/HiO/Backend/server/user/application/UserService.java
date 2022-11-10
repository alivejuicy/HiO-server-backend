package com.HiO.Backend.server.user.application;

import com.HiO.Backend.server.user.domain.User;
import com.HiO.Backend.server.user.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findUserByNo(final Long userNo) {
        return userRepository.findById(userNo).orElseThrow();
    }

    User createUser(final String name, final String email, final String pw) {
        try {
            User user = new User(name, email, pw);
            return userRepository.save(user);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("에러!");
        }
    }

}
