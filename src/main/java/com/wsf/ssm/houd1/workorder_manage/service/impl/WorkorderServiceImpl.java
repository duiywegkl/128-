package com.wsf.ssm.houd1.workorder_manage.service.impl;

import com.wsf.ssm.houd1.workorder_manage.mapper.WorkorderMapper;
import com.wsf.ssm.houd1.workorder_manage.model.Workorder;
import com.wsf.ssm.houd1.workorder_manage.model.WorkorderExample;
import com.wsf.ssm.houd1.workorder_manage.service.WorkorderService;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class WorkorderServiceImpl implements WorkorderService {

    private WorkorderMapper mapper;

    //通过构�?�器注入mapper
    public WorkorderServiceImpl(WorkorderMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public long countByExample(WorkorderExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(WorkorderExample example) {
        return mapper.deleteByExample(example);
    }

    //注意：id的参数类�? 要修改成自己数据库的主键类型（一般为Integer或String�?
    @Override
    public int deleteByPrimaryKey(Integer w_id) {
        return mapper.deleteByPrimaryKey(w_id);
    }

    @Override
    public int insert(Workorder record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Workorder record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Workorder> selectByExample(WorkorderExample example) {
        return mapper.selectByExample(example);
    }

    //注意：id的参数类�? 要修改成自己数据库的主键类型（一般为Integer或String�?
    @Override
    public Workorder selectByPrimaryKey(Integer w_id) {
        return mapper.selectByPrimaryKey(w_id);
    }

    @Override
    public int updateByExampleSelective(Workorder record,WorkorderExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Workorder record,WorkorderExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Workorder record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Workorder record) {
        return mapper.updateByPrimaryKey(record);
    }

}