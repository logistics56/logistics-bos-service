package com.logistics.module.test.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.logistics.module.test.model.Test;
import com.logistics.module.test.model.TestExample;

public interface TestMapper {
    int countByExample(TestExample example);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExample(TestExample example);

    Test selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}