package com.wsf.ssm.houd1.route.service.impl;

import com.wsf.ssm.houd1.summarize.model.overview;
import org.springframework.stereotype.Service;
import com.wsf.ssm.houd1.route.model.Route;
import com.wsf.ssm.houd1.route.model.RouteExample;
import java.lang.String;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.wsf.ssm.houd1.route.mapper.RouteMapper;
import com.wsf.ssm.houd1.route.service.RouteService;

@Service
public class RouteServiceImpl implements RouteService{

    private RouteMapper mapper;

    //通过构�?�器注入mapper
    public RouteServiceImpl(RouteMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public long countByExample(RouteExample example) {
        return mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(RouteExample example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer routeId) {
        return mapper.deleteByPrimaryKey(routeId);
    }

    @Override
    public int insert(Route record) {
        return mapper.insert(record);
    }

    @Override
    public int insertSelective(Route record) {
        return mapper.insertSelective(record);
    }

    @Override
    public List<Route> selectByExample(RouteExample example) {
//        List<Route> rts = mapper.selectByExample(example);
        List<Route> rts = mapper.selectByExampleWithBLOBs(example);
        Iterator it =  rts.iterator();
        while (it.hasNext()){
            Object element = it.next();
            int index = rts.indexOf(element);
            Route rt = (Route)element;

            rt.setId(rt.getR_id());

            rts.set(index,rt);
        }

        return rts;
    }

    @Override
    public Route selectByPrimaryKey(Integer routeId) {
        return mapper.selectByPrimaryKey(routeId);
    }

    @Override
    public int updateByExampleSelective(Route record,RouteExample example) {
        return mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Route record,RouteExample example) {
        return mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Route record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Route record) {
        return mapper.updateByPrimaryKey(record);
    }

}
