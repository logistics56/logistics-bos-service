package com.logistics.module.mapper;

import com.logistics.module.model.TArchive;
import com.logistics.module.model.TArchiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TArchiveMapper {
    int countByExample(TArchiveExample example);

    int insert(TArchive record);

    int insertSelective(TArchive record);

    List<TArchive> selectByExample(TArchiveExample example);

    TArchive selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TArchive record, @Param("example") TArchiveExample example);

    int updateByExample(@Param("record") TArchive record, @Param("example") TArchiveExample example);

    int updateByPrimaryKeySelective(TArchive record);

    int updateByPrimaryKey(TArchive record);
}