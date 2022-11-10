package com.HiO.Backend.server.user.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Embeddable
public class UserName {
    @Column(name = "user_name", length = 20)
    private String userName;

    public UserName(final String userName) {
        this.userName = userName;
    }

    private void checkNameLength(final String userName) {
        if (userName.length() < 1 || userName.length() > 20) {
            throw new IllegalArgumentException("에러!");
        }
    }
}
