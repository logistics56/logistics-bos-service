package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TSubArchive;
import com.logistics.module.bos.model.TSubArchiveExample;
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