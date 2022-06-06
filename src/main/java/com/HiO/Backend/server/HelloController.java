package com.HiO.Backend.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;

@RestController
public class HelloController {
    @GetMapping(value = "/hello")
    public List<String> Hello(){
        return Arrays.asList("서버 포트 8000", "리액트 포트 3000");
    }


}
