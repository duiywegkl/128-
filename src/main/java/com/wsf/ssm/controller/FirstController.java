package com.wsf.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

    @RequestMapping("/appindex")
    public ModelAndView start(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("html/login/appindex");
        return mv;
    }
}
