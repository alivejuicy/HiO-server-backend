package com.HiO.Backend.server.user.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Embeddable
public class UserEmail {
    @Column(name = "user_email", length = 20)
    private String userEmail;

    public UserEmail(final String userEmail) {
        this.userEmail = userEmail;
    }
    private void checkEmailLength(final String userEmail) {
        if (userEmail.length() < 1 || userEmail.length() > 20) {
            throw new IllegalArgumentException("에러!");
        }
    }
}
