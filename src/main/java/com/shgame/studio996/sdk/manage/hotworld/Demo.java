package com.shgame.studio996.sdk.manage.hotworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
