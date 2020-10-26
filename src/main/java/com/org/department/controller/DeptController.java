package com.org.department.controller;

import com.org.department.model.Department;
import com.org.department.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    DeptRepository deptRepository;
    @PostMapping("/create")
    public void create(@RequestBody Department d){
        deptRepository.save(d);
    }
    @GetMapping("/getting")
    public List<Department> get(){
        return deptRepository.findAll();
    }
    @PutMapping("/update")
    public void update(@RequestBody Department d1)
    {
        deptRepository.save(d1);
    }


}
