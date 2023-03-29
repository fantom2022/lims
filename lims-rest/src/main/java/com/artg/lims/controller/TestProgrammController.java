package com.artg.lims.controller;

import com.artg.lims.entities.TestProgram;
import com.artg.lims.repository.TestProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tests")
@EnableAutoConfiguration
public class TestProgrammController {

    @Autowired
    private TestProgramRepository testProgramRepository;

    @GetMapping("/")
    public String test() {
        return "Hello,World!";
    }

    @GetMapping("all")
    @ResponseBody
    public List<TestProgram> getAllTests() {
        return testProgramRepository.findAll();
    }

    @PostMapping("add")
    public void addNewTest(@RequestBody TestProgram program) throws Exception {
        this.testProgramRepository.save(program);
    }


}
