package com.example.demo.web.controller.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wangjun
 * @date : 2022/3/25  16:12
 */
@RestController
public class MongoTestC {

    @Autowired
    private MongoTestDao mtdao;


    @GetMapping(value = "/test1")
    public void saveTest() throws Exception {
        MongoTest mgtest = new MongoTest();
        mgtest.setId(11);
        mgtest.setAge(33);
        mgtest.setName("ceshi");
        mtdao.saveTest(mgtest);
    }

    @GetMapping(value = "/test2")
    public MongoTest findTestByName() {
        MongoTest mgtest = mtdao.findTestByName("ceshi");
        System.out.println("mgtest is " + mgtest);
        return mgtest;
    }

    @GetMapping(value = "/test3")
    public void updateTest() {
        MongoTest mgtest = new MongoTest();
        mgtest.setId(11);
        mgtest.setAge(44);
        mgtest.setName("ceshi2");
        mtdao.updateTest(mgtest);
    }

    @GetMapping(value = "/test4")
    public void deleteTestById() {
        mtdao.deleteTestById(11);
    }


}
