package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TInOutStorageInfo;
import com.logistics.module.bos.model.TInOutStorageInfoExample;
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
    
    List<TInOutStorageInfo> queryByTransitInfoId(@Param("transitInfoId") int transitInfoId);
}