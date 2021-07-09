package com.demo.spring;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "fallbackForGetEmpDetails")
    public ResponseEntity<String> getEmpDetails(@RequestParam("id") int id){

        HttpHeaders headers=new HttpHeaders();
        headers.set("Accept",MediaType.APPLICATION_JSON_VALUE);

        HttpEntity reqData=new HttpEntity(headers);

       return rt.exchange("http://emp-service/emp/find/"+id, HttpMethod.GET,reqData,String.class);
    }

    ResponseEntity<String> fallbackForGetEmpDetails(int id){
        return ResponseEntity.ok("Service Unavailable, Please try after sometime..");
    }
}
