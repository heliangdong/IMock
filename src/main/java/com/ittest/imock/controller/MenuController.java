package com.ittest.imock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {
    private static final String MOCK_VIEW="imock/mock";

    @RequestMapping("/")
    public String index(){
         return "index";
    }


    @RequestMapping("/mock")
    public String mock(){
        return MOCK_VIEW;
    }

    @RequestMapping("/{page1}/{page2}/{page3}")
    public String pageshow(@PathVariable String page1,@PathVariable String page2,@PathVariable String page3){
        return page1+"/"+page2+"/"+page3;
    }
}
