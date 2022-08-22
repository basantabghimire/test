package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired

    private TestRepository testRepository;

    public Test testSave(Test test) {
        return testRepository.save(test);
    }

    public List<Test> findtest() {
        return testRepository.findAll();
    }
}
