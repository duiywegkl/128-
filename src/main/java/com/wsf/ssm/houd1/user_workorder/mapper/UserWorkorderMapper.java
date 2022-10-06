package com.wsf.ssm.houd1.user_workorder.mapper;

import com.wsf.ssm.houd1.user_workorder.model.UserWorkorder;
import com.wsf.ssm.houd1.user_workorder.model.UserWorkorderExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserWorkorderMapper {
    long countByExample(UserWorkorderExample example);

    int deleteByExample(UserWorkorderExample example);

    int deleteByPrimaryKey(Integer w_id);

    int insert(UserWorkorder record);

    int insertSelective(UserWorkorder record);

    List<UserWorkorder> selectByExample(UserWorkorderExample example);

    UserWorkorder selectByPrimaryKey(Integer w_id);

    int updateByExampleSelective(@Param("record") UserWorkorder record, @Param("example") UserWorkorderExample example);

    int updateByExample(@Param("record") UserWorkorder record, @Param("example") UserWorkorderExample example);

    int updateByPrimaryKeySelective(UserWorkorder record);

    int updateByPrimaryKey(UserWorkorder record);
}