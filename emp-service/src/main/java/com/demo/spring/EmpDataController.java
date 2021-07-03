package com.demo.spring;

import com.demo.spring.entity.Emp;
import com.demo.spring.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("emp")
public class EmpDataController {

    @Value("${app.name}")
    String appName;

    @Autowired
    private EmpRepository repo;

    //GET http://localhost:8080/add?x=20&y=30
    @RequestMapping(path="/add",method = RequestMethod.GET,produces = "text/plain")
    public String addInts(@RequestParam("x") int a, @RequestParam("y") int b){

        return "The Sum = "+(a+b);
    }

//@RequestMapping(path="find/{empid}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
@GetMapping(path="find/{empid}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
public Emp findEmp(@PathVariable("empid") int id,@RequestHeader(required = false,name="name") String headerValue) {
        System.out.println("The header : "+headerValue);
    System.out.println("The App Name : "+appName);
    Optional<Emp> empOp=repo.findById(id);
    if(empOp.isPresent()){
        return empOp.get();
    }else{
        throw new RuntimeException("Emp Not Found..");
    }

}

@PostMapping(path="save",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.TEXT_PLAIN_VALUE)
public String saveEmp(@RequestBody Emp e){
        if(repo.existsById(e.getEmpId())){
            return "Emp Exists";
        }else {
            repo.save(e);
            return "Emp saved";
        }

}
    @PutMapping(path="update",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.TEXT_PLAIN_VALUE)
    public String updateEmp(Emp e){
        if(repo.existsById(e.getEmpId())){
            repo.save(e);
            return "Emp Updated";
        }else {

            return "Emp Not Found";
        }
    }
    @DeleteMapping(path="delete",produces = MediaType.TEXT_PLAIN_VALUE)
    public String deleteEmp(@RequestParam("empid") int id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return "Emp Deleted";
        }else {

            return "Emp Not Found";
        }
    }

    @GetMapping( produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Emp> listAllEmps(){
        return repo.findAll();
    }

    @GetMapping( path="range",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Emp> listRange(@RequestParam("value1") int id1, @RequestParam("value2")int id2){
        return repo.findRange(id1,id2);

    }

}