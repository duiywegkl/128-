package com.wsf.ssm.houd1.bus.mapper;

import com.wsf.ssm.houd1.bus.model.Bus;
import com.wsf.ssm.houd1.bus.model.BusExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BusMapper {
    long countByExample(BusExample example);

    int deleteByExample(BusExample example);

    int deleteByPrimaryKey(Integer bId);

    int insert(Bus record);

    int insertSelective(Bus record);

    List<Bus> selectByExampleWithBLOBs(BusExample example);

    List<Bus> selectByExample(BusExample example);

    Bus selectByPrimaryKey(Integer bId);

    int updateByExampleSelective(@Param("record") Bus record, @Param("example") BusExample example);

    int updateByExampleWithBLOBs(@Param("record") Bus record, @Param("example") BusExample example);

    int updateByExample(@Param("record") Bus record, @Param("example") BusExample example);

    int updateByPrimaryKeySelective(Bus record);

    int updateByPrimaryKeyWithBLOBs(Bus record);

    int updateByPrimaryKey(Bus record);
}