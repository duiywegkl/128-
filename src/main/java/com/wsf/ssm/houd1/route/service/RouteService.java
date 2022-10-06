package com.wsf.ssm.houd1.route.service;

import com.wsf.ssm.houd1.route.model.Route;
import com.wsf.ssm.houd1.route.model.RouteExample;
import java.lang.String;
import java.util.List;


public interface RouteService{
    //根据条件汇�?�记录数
    long countByExample(RouteExample example);
    //根据条件删除
    int deleteByExample(RouteExample example);
    //根据主键删除
    int deleteByPrimaryKey(Integer routeId);
    //全字段插�?
    int insert(Route record);
    //有�?�择的插�?
    int insertSelective(Route record);
    //根据条件查询
    List<Route> selectByExample(RouteExample example);
    //根据主键查询
    Route selectByPrimaryKey(Integer routeId);
    //根据条件有�?�择的更�?
    int updateByExampleSelective(Route record,RouteExample example);
    //根据条件全字段更�?
    int updateByExample(Route record,RouteExample example);
    //根据主键有�?�择的更�?
    int updateByPrimaryKeySelective(Route record);
    //根据主键全字段的更新
    int updateByPrimaryKey(Route record);

}