package com.geneiryodan.progresstracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/myview")
    public String myView() {
        return "myview"; // This should match the name of your JSP file (without the extension)
    }
}

