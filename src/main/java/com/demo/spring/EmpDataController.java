package com.demo.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpDataController {

    //GET http://localhost:8080/add?x=20&y=30
    @RequestMapping(path="/add",method = RequestMethod.GET,produces = "text/plain")
    public String addInts(@RequestParam("x") int a, @RequestParam("y") int b){
        return "The Sum = "+(a+b);
    }
}
