package com.wsf.ssm.houd1.summarize.controller;

import com.wsf.ssm.houd1.summarize.model.summarize;
import com.wsf.ssm.houd1.summarize.service.sumService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class summarizeController {

    private sumService sumService;

    //通过构�器注入service
    public summarizeController(sumService sumService){
        this.sumService=sumService;
    }

    //查询数据
    @GetMapping("/summarize")
    @ResponseBody
    public summarize selectsummarize(){
        summarize summarize = sumService.selectsummarize();

        return summarize;
    }
}
