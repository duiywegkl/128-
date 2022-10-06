package com.wsf.ssm.houd1.user_workorder.service.impl;

import com.wsf.ssm.houd1.user_workorder.mapper.UserWorkorderMapper;
import com.wsf.ssm.houd1.user_workorder.model.UserWorkorder;
import com.wsf.ssm.houd1.user_workorder.model.UserWorkorderExample;
import com.wsf.ssm.houd1.user_workorder.service.UserWorkorderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserWorkorderServiceImpl implements UserWorkorderService {

    private UserWorkorderMapper mapper;

    //通过构�?�器注入mapper
    public UserWorkorderServiceImpl(UserWorkorderMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public long countByExample(UserWorkorderExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserWorkorderExample example) {
        return mapper.deleteByExample(example);
    }

    //注意：id的参数类�? 要修改成自己数据库的主键类型（一般为Integer或String�?
    @Override
    public int deleteByPrimaryKey(Integer w_id) {
        return mapper.deleteByPrimaryKey(w_id);
    }

    @Override
    public int insert(UserWorkorder record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(UserWorkorder record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<UserWorkorder> selectByExample(UserWorkorderExample example) {
        return mapper.selectByExample(example);
    }

    //注意：id的参数类�? 要修改成自己数据库的主键类型（一般为Integer或String�?
    @Override
    public UserWorkorder selectByPrimaryKey(Integer w_id) {
        return mapper.selectByPrimaryKey(w_id);
    }

    @Override
    public int updateByExampleSelective(UserWorkorder record,UserWorkorderExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(UserWorkorder record,UserWorkorderExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(UserWorkorder record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserWorkorder record) {
        return mapper.updateByPrimaryKey(record);
    }

}