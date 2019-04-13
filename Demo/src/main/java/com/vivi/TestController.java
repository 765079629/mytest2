package com.vivi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/a")
public class TestController {

    @Autowired
    private TaskJob taskJob;

    @RequestMapping("/b")
    public void test1(){
        System.out.println("开始计时");
        taskJob.job1();
    }
}
