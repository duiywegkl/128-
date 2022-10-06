package com.wsf.ssm.houd1.classes_manage.mapper;


import com.wsf.ssm.houd1.classes_manage.model.classesManage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface classesManageMapper {

    //c_id,c_time,r_list
    List<classesManage> selectClassm1();
    //u_name,u_phone
    classesManage selectClassm2(@Param("c_id") Integer c_id);

}
