package com.wsf.ssm.houd1.workorder_manage.service;


import com.wsf.ssm.houd1.workorder_manage.model.Workorder;
import com.wsf.ssm.houd1.workorder_manage.model.WorkorderExample;

import java.lang.String;
import java.util.List;


public interface WorkorderService{
    //根据条件汇�?�记录数
    long countByExample(WorkorderExample example);
    //根据条件删除
    int deleteByExample(WorkorderExample example);
    //根据主键删除
    int deleteByPrimaryKey(Integer workorderId);
    //全字段插�?
    int insert(Workorder record);
    //有�?�择的插�?
    int insertSelective(Workorder record);
    //根据条件查询
    List<Workorder> selectByExample(WorkorderExample example);
    //根据主键查询
    Workorder selectByPrimaryKey(Integer workorderId);
    //根据条件有�?�择的更�?
    int updateByExampleSelective(Workorder record,WorkorderExample example);
    //根据条件全字段更�?
    int updateByExample(Workorder record,WorkorderExample example);
    //根据主键有�?�择的更�?
    int updateByPrimaryKeySelective(Workorder record);
    //根据主键全字段的更新
    int updateByPrimaryKey(Workorder record);

}