package com.logistics.module.bos.dao;

import java.util.List;

import com.logistics.module.bos.model.TInOutStorageInfo;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月14日 下午9:42:30
* 
*/
public interface InOutStorageInfoDao {
    
    List<TInOutStorageInfo> queryByTransitInfoId(int transitInfoId);
    
    int insertSelective(TInOutStorageInfo record);

}
