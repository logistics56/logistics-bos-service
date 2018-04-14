package com.logistics.module.bos.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.TransitInfoDao;
import com.logistics.module.bos.mapper.TTransitInfoMapper;
import com.logistics.module.bos.model.TTransitInfo;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月14日 上午11:40:30
* 
*/
@Component
public class TransitInfoDaoImpl implements TransitInfoDao {
	
	@Autowired
	TTransitInfoMapper tTransitInfoMapper;

	@Override
	public int insertSelective(TTransitInfo record) {
		return tTransitInfoMapper.insertSelective(record);
	}

	@Override
	public TTransitInfo queryByWayBillId(int wayBillId) {
		return tTransitInfoMapper.queryByWayBillId(wayBillId);
	}

}