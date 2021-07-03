package com.demo.rest.clients;

import com.demo.rest.entity.Emp;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class RestClient2 {
    public static void main(String[] args) {

        RestTemplate rt = new RestTemplate();

     // ResponseEntity<String> response= rt.getForEntity("http://localhost:8080/app/emp/find/104",String.class);
      //System.out.println(response.getBody());

        HttpHeaders headers=new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_XML_VALUE);

        HttpEntity request = new HttpEntity(headers);

       ResponseEntity<Emp> response1= rt.exchange("http://localhost:8080/app/emp/find/104", HttpMethod.GET,request, Emp.class);
       System.out.println(response1.getBody());
    }
}
