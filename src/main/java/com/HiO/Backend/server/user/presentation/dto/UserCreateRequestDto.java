package com.HiO.Backend.server.user.presentation.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UserCreateRequestDto {
    private String name;
    private String email;
    private String pw;

    public UserCreateRequestDto(final String name, final String email, final String pw) {
        this.name = name;
        this.email = email;
        this.pw = pw;
    }
}
