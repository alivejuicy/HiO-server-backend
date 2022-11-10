package com.HiO.Backend.server.user.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Embeddable
public class UserPw {
    @Column(name = "user_pw")
    private String userPw;

    public UserPw(final String userPw) {
        this.userPw = userPw;
    }
}
