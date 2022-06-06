package com.HiO.Backend.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping(value = "/sample")
    public String Sample(){
        return "샘플입니다.";
    }
}
