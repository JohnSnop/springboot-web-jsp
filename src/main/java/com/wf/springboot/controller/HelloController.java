package com.wf.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wf
 * @create 2020-08-17 23:57
 * @desc
 **/
@Controller
public class HelloController {

    @GetMapping("/abc")
    public String hello(Model model) {
        model.addAttribute("msg", "你好！");
        return "success";
    }
}
