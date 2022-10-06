package com.wsf.ssm.houd1.summarize.mapper;

import com.wsf.ssm.houd1.summarize.model.overview;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SummarizeMapper {
    //早班
    List<Integer> selectroute_stats1();
    //晚班
    List<Integer> selectroute_stats2();
    //登车
    Integer selectusage_stats1();
    //未登车
    Integer selectusage_stats2();
    //c_id c_time b_code r_list b_seats
    List<overview> selectoverrides();
    //根据c_id 找 u_name u_phone
    overview selectoverride(@Param("c_id") Integer c_id);
    //根据c_id找cun_id
    Integer selectcun_id(@Param("c_id") Integer c_id);
}
