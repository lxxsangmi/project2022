package com.leesm.project2022.test;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class Test {

    @GetMapping("list")
    public String list() {
        return "admin/index";
    }


}
