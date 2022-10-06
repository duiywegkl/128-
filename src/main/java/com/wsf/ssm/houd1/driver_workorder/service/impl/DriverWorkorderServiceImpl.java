package com.wsf.ssm.houd1.driver_workorder.service.impl;


import com.wsf.ssm.houd1.driver_workorder.mapper.DriverWorkorderMapper;
import com.wsf.ssm.houd1.driver_workorder.model.DriverWorkorder;
import com.wsf.ssm.houd1.driver_workorder.model.DriverWorkorderExample;
import com.wsf.ssm.houd1.driver_workorder.service.DriverWorkorderService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DriverWorkorderServiceImpl implements DriverWorkorderService {

    private DriverWorkorderMapper mapper;

    //通过构�?�器注入mapper
    public DriverWorkorderServiceImpl(DriverWorkorderMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public long countByExample(DriverWorkorderExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DriverWorkorderExample example) {
        return mapper.deleteByExample(example);
    }

    //注意：id的参数类�? 要修改成自己数据库的主键类型（一般为Integer或String�?
    @Override
    public int deleteByPrimaryKey(Integer w_id) {
        return mapper.deleteByPrimaryKey(w_id);
    }

    @Override
    public int insert(DriverWorkorder record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(DriverWorkorder record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<DriverWorkorder> selectByExample(DriverWorkorderExample example) {
        return mapper.selectByExample(example);
    }

    //注意：id的参数类�? 要修改成自己数据库的主键类型（一般为Integer或String�?
    @Override
    public DriverWorkorder selectByPrimaryKey(Integer w_id) {
        return mapper.selectByPrimaryKey(w_id);
    }

    @Override
    public int updateByExampleSelective(DriverWorkorder record,DriverWorkorderExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(DriverWorkorder record,DriverWorkorderExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(DriverWorkorder record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DriverWorkorder record) {
        return mapper.updateByPrimaryKey(record);
    }

}