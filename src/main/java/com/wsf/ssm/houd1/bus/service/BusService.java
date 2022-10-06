package com.wsf.ssm.houd1.bus.service;

import com.wsf.ssm.houd1.bus.model.Bus;
import com.wsf.ssm.houd1.bus.model.BusExample;
import java.lang.String;
import java.util.List;


public interface BusService{
    //根据条件汇�记录数
    long countByExample(BusExample example);
    //根据条件删除
    int deleteByExample(BusExample example);
    //根据主键删除
    int deleteByPrimaryKey(Integer busId);
    //全字段插�?
    int insert(Bus record);
    //有�?�择的插�?
    int insertSelective(Bus record);
    //根据条件查询
    List<Bus> selectByExample(BusExample example);
    //根据主键查询
    Bus selectByPrimaryKey(Integer busId);
    //根据条件有�?�择的更�?
    int updateByExampleSelective(Bus record,BusExample example);
    //根据条件全字段更�?
    int updateByExample(Bus record,BusExample example);
    //根据主键有�?�择的更�?
    int updateByPrimaryKeySelective(Bus record);
    //根据主键全字段的更新
    int updateByPrimaryKey(Bus record);

}