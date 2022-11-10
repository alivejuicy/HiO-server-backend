package com.HiO.Backend.server.user.application;

import com.HiO.Backend.server.common.dto.ResponseData;
import com.HiO.Backend.server.common.dto.ResponseDto;
import com.HiO.Backend.server.common.dto.ResponseDtoREST;
import com.HiO.Backend.server.user.domain.User;
import com.HiO.Backend.server.user.presentation.dto.UserCreateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserCRUDService {

    private static final String USER_LOGIN_SERVLET_PATH = "/api/v1/users/login";
    private static final String USER_SIGN_UP_SERVLET_PATH = "/api/v1/users";
    private static final String USER_SIGN_UP_SUCCEED_RESPONSE_MESSAGE = "회원 가입 성공";

    private final UserService userService;

    public ResponseDto createUser(final UserCreateRequestDto dto) {
        User savedUser = userService.createUser(dto.getName(), dto.getEmail(), dto.getPw());

        return ResponseDto.builder()
                .path(USER_SIGN_UP_SERVLET_PATH)
                .method(ResponseDtoREST.Method.POST)
                .message(USER_SIGN_UP_SUCCEED_RESPONSE_MESSAGE)
                .data(ResponseData.builder()
                        .insert("user", savedUser)
                        .build())
                .statusCode(ResponseDtoREST.Status.OK)
                .build();
    }

}
