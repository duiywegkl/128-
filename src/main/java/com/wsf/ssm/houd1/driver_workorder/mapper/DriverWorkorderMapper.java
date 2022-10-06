package com.wsf.ssm.houd1.driver_workorder.mapper;

import java.util.List;

import com.wsf.ssm.houd1.driver_workorder.model.DriverWorkorder;
import com.wsf.ssm.houd1.driver_workorder.model.DriverWorkorderExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DriverWorkorderMapper {
    long countByExample(DriverWorkorderExample example);

    int deleteByExample(DriverWorkorderExample example);

    int deleteByPrimaryKey(Integer w_id);

    int insert(DriverWorkorder record);

    int insertSelective(DriverWorkorder record);

    List<DriverWorkorder> selectByExample(DriverWorkorderExample example);

    DriverWorkorder selectByPrimaryKey(Integer w_id);

    int updateByExampleSelective(@Param("record") DriverWorkorder record, @Param("example") DriverWorkorderExample example);

    int updateByExample(@Param("record") DriverWorkorder record, @Param("example") DriverWorkorderExample example);

    int updateByPrimaryKeySelective(DriverWorkorder record);

    int updateByPrimaryKey(DriverWorkorder record);
}