package com.wsf.ssm.houd1.workorder_manage.mapper;


import com.wsf.ssm.houd1.workorder_manage.model.Workorder;
import com.wsf.ssm.houd1.workorder_manage.model.WorkorderExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WorkorderMapper {
    long countByExample(WorkorderExample example);

    int deleteByExample(WorkorderExample example);

    int deleteByPrimaryKey(Integer w_id);

    int insert(Workorder record);

    int insertSelective(Workorder record);

    List<Workorder> selectByExample(WorkorderExample example);

    Workorder selectByPrimaryKey(Integer w_id);

    int updateByExampleSelective(@Param("record") Workorder record, @Param("example") WorkorderExample example);

    int updateByExample(@Param("record") Workorder record, @Param("example") WorkorderExample example);

    int updateByPrimaryKeySelective(Workorder record);

    int updateByPrimaryKey(Workorder record);
}