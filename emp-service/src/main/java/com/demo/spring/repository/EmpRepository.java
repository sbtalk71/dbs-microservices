package com.demo.spring.repository;

import com.demo.spring.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpRepository extends JpaRepository<Emp,Integer> {

    @Query("select e from Emp as e where e.empId between ?1 and ?2")
    public List<Emp> findRange(int x,int y);
}
