package com.wsf.ssm.houd1.classes_manage.service.impl;


import com.wsf.ssm.houd1.classes_manage.mapper.classesManageMapper;
import com.wsf.ssm.houd1.classes_manage.model.classesManage;
import com.wsf.ssm.houd1.classes_manage.service.cMService;
import com.wsf.ssm.houd1.route.model.Route;
import com.wsf.ssm.util.IdUtil;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class cMServiceImpl implements cMService {

    private classesManageMapper mapper;

    //通过构器注入mapper
    public cMServiceImpl(classesManageMapper mapper) {
        this.mapper = mapper;
    }


    @Override
    public List<classesManage> selectclasMan() {
        List<classesManage> clms = mapper.selectClassm1();

        Iterator it =  clms.iterator();
        while (it.hasNext()){
            Object element = it.next();
            int index = clms.indexOf(element);
            classesManage clm = (classesManage)element;

            Random r = new Random();
            clm.setId(IdUtil.nextId());

            classesManage clm2 = mapper.selectClassm2(clm.getC_id());
            clm.setU_name(clm2.getU_name());
            clm.setU_phone(clm2.getU_phone());
            clm.setU_id(clm2.getU_id());

            clms.set(index,clm);
        }

        return clms;
    }
}
