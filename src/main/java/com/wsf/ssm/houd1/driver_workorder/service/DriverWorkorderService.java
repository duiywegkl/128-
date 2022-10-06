package com.wsf.ssm.houd1.driver_workorder.service;

import com.wsf.ssm.houd1.driver_workorder.model.DriverWorkorder;
import com.wsf.ssm.houd1.driver_workorder.model.DriverWorkorderExample;

import java.util.List;


public interface DriverWorkorderService {
    //根据条件汇�?�记录数
    long countByExample(DriverWorkorderExample example);
    //根据条件删除
    int deleteByExample(DriverWorkorderExample example);
    //根据主键删除
    int deleteByPrimaryKey(Integer workorderId);
    //全字段插�?
    int insert(DriverWorkorder record);
    //有�?�择的插�?
    int insertSelective(DriverWorkorder record);
    //根据条件查询
    List<DriverWorkorder> selectByExample(DriverWorkorderExample example);
    //根据主键查询
    DriverWorkorder selectByPrimaryKey(Integer workorderId);
    //根据条件有�?�择的更�?
    int updateByExampleSelective(DriverWorkorder record,DriverWorkorderExample example);
    //根据条件全字段更�?
    int updateByExample(DriverWorkorder record,DriverWorkorderExample example);
    //根据主键有�?�择的更�?
    int updateByPrimaryKeySelective(DriverWorkorder record);
    //根据主键全字段的更新
    int updateByPrimaryKey(DriverWorkorder record);

}