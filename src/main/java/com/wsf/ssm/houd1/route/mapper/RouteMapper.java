package com.wsf.ssm.houd1.route.mapper;

import com.wsf.ssm.houd1.route.model.Route;
import com.wsf.ssm.houd1.route.model.RouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RouteMapper {
    long countByExample(RouteExample example);

    int deleteByExample(RouteExample example);

    int deleteByPrimaryKey(Integer rId);

    int insert(Route record);

    int insertSelective(Route record);

    List<Route> selectByExampleWithBLOBs(RouteExample example);

    List<Route> selectByExample(RouteExample example);

    Route selectByPrimaryKey(Integer rId);

    int updateByExampleSelective(@Param("record") Route record, @Param("example") RouteExample example);

    int updateByExampleWithBLOBs(@Param("record") Route record, @Param("example") RouteExample example);

    int updateByExample(@Param("record") Route record, @Param("example") RouteExample example);

    int updateByPrimaryKeySelective(Route record);

    int updateByPrimaryKeyWithBLOBs(Route record);

    int updateByPrimaryKey(Route record);
}