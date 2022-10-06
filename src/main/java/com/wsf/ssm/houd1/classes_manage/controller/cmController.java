package com.wsf.ssm.houd1.classes_manage.controller;


import com.wsf.ssm.houd1.bus.service.BusService;
import com.wsf.ssm.houd1.classes_manage.model.classesManage;
import com.wsf.ssm.houd1.classes_manage.service.cMService;
import com.wsf.ssm.houd1.summarize.model.summarize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

//添加注解
@Controller
public class cmController {

    private cMService cMService;

    //通过构�?�器注入service
    public cmController(cMService cMService){
        this.cMService=cMService;
    }

    //查询数据
    @GetMapping("/classes_manage")
    @ResponseBody
    public List<classesManage> selectclasMan(){
        List<classesManage> clms = cMService.selectclasMan();

        return clms;
    }

}
