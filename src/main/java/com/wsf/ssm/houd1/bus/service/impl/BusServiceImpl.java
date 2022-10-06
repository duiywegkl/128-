package com.wsf.ssm.houd1.bus.service.impl;

import com.wsf.ssm.houd1.route.model.Route;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.stereotype.Service;
import com.wsf.ssm.houd1.bus.model.Bus;
import com.wsf.ssm.houd1.bus.model.BusExample;
import java.lang.String;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.wsf.ssm.houd1.bus.mapper.BusMapper;
import com.wsf.ssm.houd1.bus.service.BusService;

@Service
public class BusServiceImpl implements BusService{

    private BusMapper mapper;

    //通过构�?�器注入mapper
    public BusServiceImpl(BusMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public long countByExample(BusExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(BusExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer busId) {
        QueryRunner qr = new QueryRunner();
        Integer resultNum = 0;
        try {
            // 解除外键关联
            qr.update("SET foreign_key_checks = 0");
            // 删除
            resultNum = mapper.deleteByPrimaryKey(busId);
            // 重新关联外键
            qr.update("SET foreign_key_checks = 1");
        }catch (Exception e){
            e.printStackTrace();
        }
        return resultNum;
    }

    @Override
    public int insert(Bus record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Bus record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Bus> selectByExample(BusExample example) {
        List<Bus> bs = mapper.selectByExampleWithBLOBs(example);

        Iterator it =  bs.iterator();
        while (it.hasNext()){
            Object element = it.next();
            int index = bs.indexOf(element);
            Bus b = (Bus)element;

            b.setId(b.getB_id());

            bs.set(index,b);
        }


        return bs;
    }

    @Override
    public Bus selectByPrimaryKey(Integer busId) {
        return mapper.selectByPrimaryKey(busId);
    }

    @Override
    public int updateByExampleSelective(Bus record,BusExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Bus record,BusExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Bus record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Bus record) {
        return mapper.updateByPrimaryKey(record);
    }

}
