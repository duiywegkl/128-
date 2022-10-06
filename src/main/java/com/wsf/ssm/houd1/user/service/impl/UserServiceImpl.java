package com.wsf.ssm.houd1.user.service.impl;

import com.wsf.ssm.houd1.user.mapper.UserMapper;
import com.wsf.ssm.houd1.user.model.User;
import com.wsf.ssm.houd1.user.model.UserExample;
import com.wsf.ssm.houd1.user.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private UserMapper mapper;

    //通过构�?�器注入mapper
    public UserServiceImpl(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public long countByExample(UserExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer userId) {
        return mapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int insert(User record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<User> selectByExample(UserExample example) {
        return mapper.selectByExample(example);
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
        return mapper.selectByPrimaryKey(userId);
    }

    @Override
    public int updateByExampleSelective(User record,UserExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(User record,UserExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return mapper.updateByPrimaryKey(record);
    }

}
