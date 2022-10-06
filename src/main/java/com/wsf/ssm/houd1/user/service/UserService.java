package com.wsf.ssm.houd1.user.service;


import com.wsf.ssm.houd1.user.model.User;
import com.wsf.ssm.houd1.user.model.UserExample;

import java.lang.String;
import java.util.List;


public interface UserService{
    //根据条件汇�?�记录数
    long countByExample(UserExample example);
    //根据条件删除
    int deleteByExample(UserExample example);
    //根据主键删除
    int deleteByPrimaryKey(Integer userId);
    //全字段插�?
    int insert(User record);
    //有�?�择的插�?
    int insertSelective(User record);
    //根据条件查询
    List<User> selectByExample(UserExample example);
    //根据主键查询
    User selectByPrimaryKey(Integer userId);
    //根据条件有�?�择的更�?
    int updateByExampleSelective(User record,UserExample example);
    //根据条件全字段更�?
    int updateByExample(User record,UserExample example);
    //根据主键有�?�择的更�?
    int updateByPrimaryKeySelective(User record);
    //根据主键全字段的更新
    int updateByPrimaryKey(User record);

}