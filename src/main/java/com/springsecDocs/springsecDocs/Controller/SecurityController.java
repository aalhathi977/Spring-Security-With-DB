package com.springsecDocs.springsecDocs.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @GetMapping(value = "/index")
    public String getIndexPage(){
        return "index";
    }
}
