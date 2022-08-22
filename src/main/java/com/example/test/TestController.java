package com.example.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping
    public Test saveTest(@RequestBody Test test){
        return testService.testSave(test);
    }

    @GetMapping
    public List<Test> getTest(){
        return testService.findtest();
    }
}

