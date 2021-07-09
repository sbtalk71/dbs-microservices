package com.demo.spring;

import com.demo.spring.entity.Emp;
import com.demo.spring.entity.EmpWrapper;
import com.demo.spring.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("emp")
public class EmpDataController {

    @Value("${app.name}")
    String appName;

   // @Autowired
    private EmpRepository repo;

    //public EmpDataController(){}
    public EmpDataController(EmpRepository repo){
        this.repo=repo;
    }


    //GET http://localhost:8080/add?x=20&y=30
    @RequestMapping(path="/add",method = RequestMethod.GET,produces = "text/plain")
    public String addInts(@RequestParam("x") int a, @RequestParam("y") int b){

        return "The Sum = "+(a+b);
    }

//@RequestMapping(path="find/{empid}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
@GetMapping(path="find/{empid}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
public ResponseEntity findEmp(@PathVariable("empid") int id,@RequestHeader(required = false,name="name") String headerValue) {
        System.out.println("The header : "+headerValue);
    System.out.println("The App Name : "+appName);
    Optional<Emp> empOp=repo.findById(id);
    if(empOp.isPresent()){
        return ResponseEntity.ok(empOp.get());
    }else{
        //return ResponseEntity.ok("Emp Not Found..");
        //throw new EmpNotFoundException("Emp Not found with id "+id);
        return ResponseEntity.status(404).body("Emp Not Found");
    }

}

@PostMapping(path="save",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.TEXT_PLAIN_VALUE)
public ResponseEntity<String> saveEmp(@RequestBody Emp e){
        if(repo.existsById(e.getEmpId())){
            return ResponseEntity.ok("Emp Exists");
        }else {
            repo.save(e);
            return ResponseEntity.ok("Emp saved");
        }

}
    @PutMapping(path="update",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> updateEmp(Emp e){
        if(repo.existsById(e.getEmpId())){
            repo.save(e);
            return ResponseEntity.ok("Emp Updated");
        }else {

            return ResponseEntity.ok("Emp Not Found");
        }
    }
    @DeleteMapping(path="delete",produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> deleteEmp(@RequestParam("empid") int id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return ResponseEntity.ok("Emp Deleted");
        }else {

            return ResponseEntity.ok("Emp Not Found");
        }
    }

    @GetMapping( produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<EmpWrapper> listAllEmps(){
        EmpWrapper emps=new EmpWrapper();
        List<Emp> empList=repo.findAll();
        emps.setEmps(empList);
        return ResponseEntity.ok(emps);
    }

    @GetMapping( path="range",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    public List<Emp> listRange(@RequestParam("value1") int id1, @RequestParam("value2")int id2){
        return repo.findRange(id1,id2);

    }

    @ExceptionHandler(EmpNotFoundException.class)
    public ResponseEntity<String> handleAllExceptions(EmpNotFoundException ex){
        return ResponseEntity.ok(ex.getMessage());
    }
}