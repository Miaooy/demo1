package com.miaooy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author MIAOOY2
 */
@Controller
public class TestController {
    @RequestMapping(value = "test")
    @ResponseBody
    public String test() {
        return "你好 世界!";
    }
}
