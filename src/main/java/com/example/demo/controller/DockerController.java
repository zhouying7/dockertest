package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouying3
 */
@RestController
public class DockerController {

    @RequestMapping(value = "/say",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
