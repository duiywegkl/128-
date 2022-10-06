package com.wsf.ssm.houd1.driver_workorder.controller;

import com.wsf.ssm.houd1.driver_workorder.model.DriverWorkorder;
import com.wsf.ssm.houd1.driver_workorder.model.DriverWorkorderExample;
import com.wsf.ssm.houd1.driver_workorder.service.DriverWorkorderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//添加注解
@Controller
public class DriverWorkorderController {

    private DriverWorkorderService workorderService;

    //通过构�?�器注入service
    public DriverWorkorderController(DriverWorkorderService workorderService){
        this.workorderService=workorderService;
    }

    //查询数据
    @GetMapping("/driver_workorder")
    @ResponseBody
    public List<DriverWorkorder> selectWorkorder(){
        //1 构�?�查询条�?
        //1.1 创建查询条件�?
        DriverWorkorderExample example = new DriverWorkorderExample();
        //1.2 创建条件构�?�器
        DriverWorkorderExample.Criteria criteria = example.createCriteria();
        //1.3 通过criteria设置条件
        //...

        //2 根据条件查询
        List<DriverWorkorder> list = workorderService.selectByExample(example);

        return list;
    }
    //添加数据
    @PostMapping("/driver_workorder")
    @ResponseBody
    public DriverWorkorder insertUser(@RequestBody DriverWorkorder workorder){
        //准备数据
        //...

        workorderService.insertSelective(workorder);

        return workorder;
    }
    //修改数据
    @PutMapping("/driver_workorder")
    @ResponseBody
    public DriverWorkorder updateUser(@RequestBody DriverWorkorder workorder){
        //准备数据
        //...

        workorderService.updateByPrimaryKeySelective(workorder);
        //只返回修改的字段数据
        return workorder;
        //或�??,通过主键,从数据库查询完整的数�?,然后返回
        //return workorderService.selectByPrimaryKey(workorder.getWorkorderId);

    }
    //删除数据
    @DeleteMapping("/driver_workorder/{id}")
    @ResponseBody
    public String delUser(@PathVariable("id") Integer workorderId){

        workorderService.deleteByPrimaryKey(workorderId);

        //返回状�?�码
        return "200";
    }
}
