package com.logistics.module.mapper;

import com.logistics.module.model.TSubArchive;
import com.logistics.module.model.TSubArchiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSubArchiveMapper {
    int countByExample(TSubArchiveExample example);

    int insert(TSubArchive record);

    int insertSelective(TSubArchive record);

    List<TSubArchive> selectByExample(TSubArchiveExample example);

    TSubArchive selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TSubArchive record, @Param("example") TSubArchiveExample example);

    int updateByExample(@Param("record") TSubArchive record, @Param("example") TSubArchiveExample example);

    int updateByPrimaryKeySelective(TSubArchive record);

    int updateByPrimaryKey(TSubArchive record);
}