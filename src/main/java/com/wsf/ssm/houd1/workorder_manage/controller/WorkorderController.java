package com.wsf.ssm.houd1.workorder_manage.controller;

import com.wsf.ssm.houd1.workorder_manage.model.Workorder;
import com.wsf.ssm.houd1.workorder_manage.model.WorkorderExample;
import com.wsf.ssm.houd1.workorder_manage.service.WorkorderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//添加注解
@Controller
public class WorkorderController {

    private WorkorderService workorderService;

    //通过构�?�器注入service
    public WorkorderController(WorkorderService workorderService){
        this.workorderService=workorderService;
    }

    //查询数据
    @GetMapping("/workorder_manage")
    @ResponseBody
    public List<Workorder> selectWorkorder(){
        //1 构�?�查询条�?
        //1.1 创建查询条件�?
        WorkorderExample example = new WorkorderExample();
        //1.2 创建条件构�?�器
        WorkorderExample.Criteria criteria = example.createCriteria();
        //1.3 通过criteria设置条件
        //...

        //2 根据条件查询
        List<Workorder> list = workorderService.selectByExample(example);

        return list;
    }
    //添加数据
    @PostMapping("/workorder_manage")
    @ResponseBody
    public Workorder insertUser(@RequestBody Workorder workorder){
        //准备数据
        //...

        workorderService.insertSelective(workorder);

        return workorder;
    }
    //修改数据
    @PutMapping("/workorder_manage")
    @ResponseBody
    public Workorder updateUser(@RequestBody Workorder workorder){
        //准备数据
        //...

        workorderService.updateByPrimaryKeySelective(workorder);
        //只返回修改的字段数据
        return workorder;
        //或�??,通过主键,从数据库查询完整的数�?,然后返回
        //return workorderService.selectByPrimaryKey(workorder.getWorkorderId);

    }
    //删除数据
    @DeleteMapping("/workorder_manage/{id}")
    @ResponseBody
    public String delUser(@PathVariable("id") Integer workorderId){

        workorderService.deleteByPrimaryKey(workorderId);

        //返回状�?�码
        return "200";
    }
}
