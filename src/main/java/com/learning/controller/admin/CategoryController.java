package com.learning.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

    @RequestMapping("/admin/category")
    public String category() {
        return "admin/category/index";
    }
}
