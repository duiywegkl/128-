package com.wsf.ssm.houd1.user_workorder.service;

import com.wsf.ssm.houd1.user_workorder.model.UserWorkorder;
import com.wsf.ssm.houd1.user_workorder.model.UserWorkorderExample;

import java.util.List;


public interface UserWorkorderService {
    //根据条件汇�?�记录数
    long countByExample(UserWorkorderExample example);
    //根据条件删除
    int deleteByExample(UserWorkorderExample example);
    //根据主键删除
    int deleteByPrimaryKey(Integer workorderId);
    //全字段插�?
    int insert(UserWorkorder record);
    //有�?�择的插�?
    int insertSelective(UserWorkorder record);
    //根据条件查询
    List<UserWorkorder> selectByExample(UserWorkorderExample example);
    //根据主键查询
    UserWorkorder selectByPrimaryKey(Integer workorderId);
    //根据条件有�?�择的更�?
    int updateByExampleSelective(UserWorkorder record,UserWorkorderExample example);
    //根据条件全字段更�?
    int updateByExample(UserWorkorder record,UserWorkorderExample example);
    //根据主键有�?�择的更�?
    int updateByPrimaryKeySelective(UserWorkorder record);
    //根据主键全字段的更新
    int updateByPrimaryKey(UserWorkorder record);

}