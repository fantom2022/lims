package com.artg.lims.controller;

import com.artg.lims.entities.TestProgramm;
import com.artg.lims.repository.TestProgrammRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.util.Streamable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("tests")
@EnableAutoConfiguration
public class TestProgrammController {

    @Autowired
    private TestProgrammRepository testProgrammRepository;

    @GetMapping("test")
    public String test() {
        return "Hello,World!";
    }

    @GetMapping("all")
    @ResponseBody
    public List<TestProgramm> getAllTests() {
        return testProgrammRepository.findAll();
    }

    @PostMapping("add")
    public void addNewTest(@RequestBody TestProgramm programm) throws Exception {
        this.testProgrammRepository.save(programm);
    }


}
