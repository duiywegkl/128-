package com.wsf.ssm.houd1.user_workorder.controller;


import com.wsf.ssm.houd1.user_workorder.model.UserWorkorder;
import com.wsf.ssm.houd1.user_workorder.model.UserWorkorderExample;
import com.wsf.ssm.houd1.user_workorder.service.UserWorkorderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//添加注解
@Controller
public class UserWorkorderController {

    private UserWorkorderService workorderService;

    //通过构�?�器注入service
    public UserWorkorderController(UserWorkorderService workorderService){
        this.workorderService=workorderService;
    }

    //查询数据
    @GetMapping("/user_workorder")
    @ResponseBody
    public List<UserWorkorder> selectWorkorder(){
        //1 构�?�查询条�?
        //1.1 创建查询条件�?
        UserWorkorderExample example = new UserWorkorderExample();
        //1.2 创建条件构�?�器
        UserWorkorderExample.Criteria criteria = example.createCriteria();
        //1.3 通过criteria设置条件
        //...

        //2 根据条件查询
        List<UserWorkorder> list = workorderService.selectByExample(example);

        return list;
    }
    //添加数据
    @PostMapping("/user_workorder")
    @ResponseBody
    public UserWorkorder insertUser(@RequestBody UserWorkorder workorder){
        //准备数据
        //...

        workorderService.insertSelective(workorder);

        return workorder;
    }
    //修改数据
    @PutMapping("/user_workorder")
    @ResponseBody
    public UserWorkorder updateUser(@RequestBody UserWorkorder workorder){
        //准备数据
        //...

        workorderService.updateByPrimaryKeySelective(workorder);
        //只返回修改的字段数据
        return workorder;
        //或�??,通过主键,从数据库查询完整的数�?,然后返回
        //return workorderService.selectByPrimaryKey(workorder.getWorkorderId);

    }
    //删除数据
    @DeleteMapping("/user_workorder/{id}")
    @ResponseBody
    public String delUser(@PathVariable("id") Integer workorderId){

        workorderService.deleteByPrimaryKey(workorderId);

        //返回状�?�码
        return "200";
    }
}
