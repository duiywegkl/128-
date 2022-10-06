package com.wsf.ssm.houd1.summarize.service.impl;

import com.wsf.ssm.houd1.summarize.mapper.SummarizeMapper;
import com.wsf.ssm.houd1.summarize.model.overview;
import com.wsf.ssm.houd1.summarize.model.summarize;
import com.wsf.ssm.houd1.summarize.service.sumService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class sumServiceImpl implements sumService {

    private SummarizeMapper mapper;

    //通过构器注入mapper
    public sumServiceImpl(SummarizeMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public summarize selectsummarize() {
        summarize su = new summarize();


        List<Integer> su1 = mapper.selectroute_stats1();
        List<Integer> su2 = mapper.selectroute_stats2();
        Integer[][] rs = {su1.toArray(new Integer[su1.size()]), su2.toArray(new Integer[su2.size()])};
        su.setRoute_stats(rs);

        // 登车、未登车
        Integer[] us = {mapper.selectusage_stats1(),mapper.selectusage_stats2()};
        su.setUsage_stats(us);

        //overview
        List<overview> ovv = new ArrayList<>();
        ovv = mapper.selectoverrides();

        Iterator it =  ovv.iterator();
        while (it.hasNext()){
            Object element = it.next();
            int index = ovv.indexOf(element);
            overview ov = (overview)element;
            overview oc = mapper.selectoverride(ov.getC_id());

            Random r = new Random();
            ov.setId(new Integer(r.nextInt(999999999)));


            ov.setU_name(oc.getU_name());
            ov.setU_phone(oc.getU_phone());
            ov.setCun_id(mapper.selectcun_id(ov.getC_id()));
//            System.out.println("---------------"+ov.getC_id());
//            System.out.println(mapper.selectcun_id(ov.getC_id()).toString());
            ov.setBus_load(ov.getCun_id()+"/"+ov.getB_seats());
            ovv.set(index,ov);
        }
        su.setOverview(ovv);
        return su;
    }
}
