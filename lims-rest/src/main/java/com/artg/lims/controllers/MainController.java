package com.artg.lims.controllers;

import com.artg.lims.entities.TestProgramm;
import com.artg.lims.repositories.TestProgrammRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    TestProgrammRepository testProgrammRepository;

    @GetMapping("all")
    public List<TestProgramm> getAllTest(){
        return testProgrammRepository.findAll();
    }
}
