package com.springbootproject.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

    @GetMapping("hw")
    public String HelloWorld(){
        return "Hello World!!";
    }


}
