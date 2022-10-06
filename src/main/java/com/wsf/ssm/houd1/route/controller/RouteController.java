package com.wsf.ssm.houd1.route.controller;

import com.wsf.ssm.houd1.route.model.Route;
import com.wsf.ssm.houd1.route.model.RouteExample;
import com.wsf.ssm.houd1.route.service.RouteService;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//添加注解
@Controller
public class RouteController {

    private RouteService routeService;

    //通过构�?�器注入service
    public RouteController(RouteService routeService){
        this.routeService=routeService;
    }

    //查询数据
    @GetMapping("/route")
    @ResponseBody
    public List<Route> selectRoute(){
        //1 构�?�查询条�?
        //1.1 创建查询条件�?
        RouteExample example = new RouteExample();
        //1.2 创建条件构�?�器
        RouteExample.Criteria criteria = example.createCriteria();
        //1.3 通过criteria设置条件
        //...

        //2 根据条件查询
        List<Route> route = routeService.selectByExample(example);

        return route;
    }
    //添加数据
    @PostMapping("/route")
    @ResponseBody
    public Route insertUser(@RequestBody Route route){
        //准备数据
        //...

        routeService.insertSelective(route);

        return route;
    }
    //修改数据
    @PutMapping("/route")
    @ResponseBody
    public Route updateUser(@RequestBody Route route){
        //准备数据
        //...

        routeService.updateByPrimaryKeySelective(route);
        //只返回修改的字段数据
        return route;
        //或�??,通过主键,从数据库查询完整的数�?,然后返回
        //return routeService.selectByPrimaryKey(route.getRouteId);

    }
    //删除数据
    @DeleteMapping("/route/{id}")
    @ResponseBody
    public String delUser(@PathVariable("id") Integer routeId){
        QueryRunner qr = new QueryRunner();
        try {
            // 解除外键关联
            qr.update("SET foreign_key_checks = 0");
            // 删除
            routeService.deleteByPrimaryKey(routeId);
            // 重新关联外键
            qr.update("SET foreign_key_checks = 1");
        }catch (Exception e){
            e.printStackTrace();
        }

        //返回状�?�码
        return "200";
    }
}
