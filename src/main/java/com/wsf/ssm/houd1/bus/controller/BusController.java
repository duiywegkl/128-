package com.wsf.ssm.houd1.bus.controller;

import com.wsf.ssm.houd1.bus.model.Bus;
import com.wsf.ssm.houd1.bus.model.BusExample;
import com.wsf.ssm.houd1.bus.service.BusService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//添加注解
@Controller
public class BusController {

    private BusService busService;

    //通过构�?�器注入service
    public BusController(BusService busService){
        this.busService=busService;
    }

    //查询数据
    @GetMapping("/bus")
    @ResponseBody
    public List<Bus> selectBus(){
        //1 构�?�查询条�?
        //1.1 创建查询条件�?
        BusExample example = new BusExample();
        //1.2 创建条件构�?�器
        BusExample.Criteria criteria = example.createCriteria();
        //1.3 通过criteria设置条件
        //...

        //2 根据条件查询
        List<Bus> list = busService.selectByExample(example);

        return list;
    }
    //添加数据
    @PostMapping("/bus")
    @ResponseBody
    public Bus insertUser(@RequestBody Bus bus){
        //准备数据
        //...

        busService.insertSelective(bus);

        return bus;
    }
    //修改数据
    @PutMapping("/bus")
    @ResponseBody
    public Bus updateUser(@RequestBody Bus bus){
        //准备数据
        //...

        busService.updateByPrimaryKeySelective(bus);
        //只返回修改的字段数据
        return bus;
        //或�??,通过主键,从数据库查询完整的数�?,然后返回
        //return busService.selectByPrimaryKey(bus.getBusId);

    }
    //删除数据
    @DeleteMapping("/bus/{id}")
    @ResponseBody
    public String delUser(@PathVariable("id") Integer busId){

        busService.deleteByPrimaryKey(busId);

        //返回状�?�码
        return "200";
    }
}
