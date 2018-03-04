package com.logistics.module.mapper;

import com.logistics.module.model.TInOutStorageInfo;
import com.logistics.module.model.TInOutStorageInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TInOutStorageInfoMapper {
    int countByExample(TInOutStorageInfoExample example);

    int insert(TInOutStorageInfo record);

    int insertSelective(TInOutStorageInfo record);

    List<TInOutStorageInfo> selectByExample(TInOutStorageInfoExample example);

    TInOutStorageInfo selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TInOutStorageInfo record, @Param("example") TInOutStorageInfoExample example);

    int updateByExample(@Param("record") TInOutStorageInfo record, @Param("example") TInOutStorageInfoExample example);

    int updateByPrimaryKeySelective(TInOutStorageInfo record);

    int updateByPrimaryKey(TInOutStorageInfo record);
}