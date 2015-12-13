package com.staff.efficiency.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "/")
public class MainPageController {
    private static final String MAIN_PAGE = "index";

    @RequestMapping(value = {"/", "index", "home"})
    public String mainPage() {
        return MAIN_PAGE;
    }
}
