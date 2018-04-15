package com.logistics.module.bos.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.DeliveryInfoDao;
import com.logistics.module.bos.mapper.TDeliveryInfoMapper;
import com.logistics.module.bos.model.TDeliveryInfo;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月15日 上午10:42:32
* 
*/
@Component
public class DeliveryInfoDaoImpl implements DeliveryInfoDao {
	
	@Autowired
	TDeliveryInfoMapper tDeliveryInfoMapper;

	@Override
	public int insertSelective(TDeliveryInfo record) {
		tDeliveryInfoMapper.insertSelective(record);
		return record.getcId();
	}

	@Override
	public TDeliveryInfo selectByPrimaryKey(Integer cId) {
		return tDeliveryInfoMapper.selectByPrimaryKey(cId);
	}

}
