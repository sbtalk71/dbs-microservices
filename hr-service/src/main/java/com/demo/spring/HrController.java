package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("hr")
public class HrController {

    @Autowired
    RestTemplate rt;

    @GetMapping(path="emp",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getEmpDetails(@RequestParam("id") int id){

        HttpHeaders headers=new HttpHeaders();
        headers.set("Accept",MediaType.APPLICATION_JSON_VALUE);

        HttpEntity reqData=new HttpEntity(headers);

       return rt.exchange("http://localhost:8080/emp/find/"+id, HttpMethod.GET,reqData,String.class);
    }
}
