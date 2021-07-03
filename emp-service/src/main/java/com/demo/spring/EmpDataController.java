package com.demo.spring;

import com.demo.spring.entity.Emp;
import com.demo.spring.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
public class EmpDataController {

    @Autowired
    private EmpRepository repo;

    //GET http://localhost:8080/add?x=20&y=30
    @RequestMapping(path="/add",method = RequestMethod.GET,produces = "text/plain")
    public String addInts(@RequestParam("x") int a, @RequestParam("y") int b){
        return "The Sum = "+(a+b);
    }

//@RequestMapping(path="find/{empid}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
@GetMapping(path="find/{empid}",produces = MediaType.APPLICATION_JSON_VALUE)
public Emp findEmp(@PathVariable("empid") int id) {
    Optional<Emp> empOp=repo.findById(id);
    if(empOp.isPresent()){
        return empOp.get();
    }else{
        throw new RuntimeException("Emp Not Found..");
    }

}

public String saveEmp(Emp e){
        return "";
}

    public String updateEmp(Emp e){
        return "";
    }

    public String deleteEmp(int id){
        return "";
    }


    public List<Emp> listAllEmps(){
        return null;
    }
}