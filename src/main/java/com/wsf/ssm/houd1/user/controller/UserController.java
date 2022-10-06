package com.wsf.ssm.houd1.user.controller;


import com.wsf.ssm.houd1.user.model.User;
import com.wsf.ssm.houd1.user.model.UserExample;
import com.wsf.ssm.houd1.user.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//添加注解
@Controller
public class UserController {

    private UserService userService;

    //通过构�?�器注入service
    public UserController(UserService userService){
        this.userService=userService;
    }

    //查询数据
    @GetMapping("/user_manage")
    @ResponseBody
    public List<User> selectUser(){
        //1 构�?�查询条�?
        //1.1 创建查询条件�?
        UserExample example = new UserExample();
        //1.2 创建条件构�?�器
        UserExample.Criteria criteria = example.createCriteria();
        //1.3 通过criteria设置条件
        //...

        //2 根据条件查询
        List<User> list = userService.selectByExample(example);

        return list;
    }
    //添加数据
    @PostMapping("/user_manage")
    @ResponseBody
    public User insertUser(@RequestBody User user){
        //准备数据
        //...

        userService.insertSelective(user);

        return user;
    }
    //修改数据
    @PutMapping("/user_manage")
    @ResponseBody
    public User updateUser(@RequestBody User user){
        //准备数据
        //...

        userService.updateByPrimaryKeySelective(user);
        //只返回修改的字段数据
        return user;
        //或�??,通过主键,从数据库查询完整的数�?,然后返回
        //return userService.selectByPrimaryKey(user.getUserId);

    }
    //删除数据
    @DeleteMapping("/user_manage/{id}")
    @ResponseBody
    public String delUser(@PathVariable("id") Integer userId){

        userService.deleteByPrimaryKey(userId);

        //返回状�?�码
        return "200";
    }
}
