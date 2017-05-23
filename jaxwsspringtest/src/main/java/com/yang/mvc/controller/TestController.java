package com.yang.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ASUS on 2017/5/22.
 */
@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("tojsppage")
    public String toJSPPage(HttpServletRequest request){
        request.setAttribute("flag","NE");
        return "springMVCTest";
    }
}
