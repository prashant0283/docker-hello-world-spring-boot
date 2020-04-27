package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloController {
    
     @Value("${greeter.message}")
    private String greeterMessageFormat; 
    
    @RequestMapping("/")
    public String index() {
        return greeterMessageFormat;
    }
    
}
