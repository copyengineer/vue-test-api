package com.xjb.vueapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 辛集斌
 * @create 2022/2/6
 */
@RestController
public class TestApiForVue {

    @GetMapping("/getOneString")
    public String getOneString(){
        return "hello world";
    }
}
