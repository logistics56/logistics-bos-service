package com.logistics.module.bos.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.InOutStorageInfoDao;
import com.logistics.module.bos.mapper.TInOutStorageInfoMapper;
import com.logistics.module.bos.model.TInOutStorageInfo;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月14日 下午9:44:10
* 
*/
@Component
public class InOutStorageInfoDaoImpl implements InOutStorageInfoDao {
	
	@Autowired
	TInOutStorageInfoMapper tInOutStorageInfoMapper;

	@Override
	public List<TInOutStorageInfo> queryByTransitInfoId(int transitInfoId) {
		return tInOutStorageInfoMapper.queryByTransitInfoId(transitInfoId);
	}

}
