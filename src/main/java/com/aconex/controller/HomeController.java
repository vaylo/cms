package com.aconex.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vlo on 4/17/2016.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Aconex Home Page";
    }
}
