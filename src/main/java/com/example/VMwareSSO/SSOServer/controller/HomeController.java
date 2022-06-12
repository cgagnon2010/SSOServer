package com.example.VMwareSSO.SSOServer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

    @GetMapping("/home")
    public ModelAndView homePageDemo() {
        ModelAndView modelAndView = new ModelAndView("home");

        modelAndView.addObject("message", "Hello VMware! This is a simple SSO Page");

        return modelAndView;
    }

}
