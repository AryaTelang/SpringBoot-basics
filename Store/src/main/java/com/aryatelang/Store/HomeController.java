package com.aryatelang.Store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    //where you want to receive traffic, enter that url
    @Value("${spring.application.name}")
    private String appName;
    @RequestMapping("/")
    public String index(){
       // return "index.html";
        String viewName=getViewName();

        return viewName;
    }
    private String getViewName(){
        System.out.println("appname"+appName);
        return "index.html";
    }
}
