package io.spring.restfulspringmvc.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jack Tran
 */

@Controller
public class BaseController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
