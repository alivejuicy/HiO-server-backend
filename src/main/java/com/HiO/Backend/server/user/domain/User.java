package com.HiO.Backend.server.user.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Table(name = "USER")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no")
    private Long userNo;

    @Embedded
    private UserName userName;

    @Embedded
    private UserEmail userEmail;

    @Embedded
    private UserPw userPw;

    public User(final String name, final String email, final String password) {
        this.userName = new UserName(name);
        //this.userEmail = new UserEmail(email);
        //this.userPw = new UserPw(password);
    }

    public String getName() {
        return userName.getUserName();
    }
}
