package com.HiO.Backend.server.user.presentation;

import com.HiO.Backend.server.user.application.UserCRUDService;
import com.HiO.Backend.server.user.presentation.dto.UserCreateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@CrossOrigin({"http://localhost::8080"})
public class UserController {
    private final UserCRUDService userCRUDService;

    @PostMapping("/users")
    public ResponseEntity createUser(@RequestBody UserCreateRequestDto dto){
        return ResponseEntity.ok(userCRUDService.createUser(dto));
    }

}
