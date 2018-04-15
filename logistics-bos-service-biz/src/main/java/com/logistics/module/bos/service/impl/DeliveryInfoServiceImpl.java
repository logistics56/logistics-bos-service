package com.logistics.module.bos.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.module.bos.dao.DeliveryInfoDao;
import com.logistics.module.bos.model.TDeliveryInfo;
import com.logistics.module.dto.DeliveryInfoDTO;
import com.logistics.module.service.DeliveryInfoService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月15日 上午10:45:55
* 
*/
@Service("deliveryInfoService")
public class DeliveryInfoServiceImpl implements DeliveryInfoService {
	
	@Autowired
	DeliveryInfoDao deliveryInfoDao;

	@Override
	public int insertSelective(DeliveryInfoDTO record) {
		if(record == null){
			return 0;
		}
		TDeliveryInfo po = new TDeliveryInfo();
		BeanUtils.copyProperties(record, po);
		return deliveryInfoDao.insertSelective(po);
	}

	@Override
	public DeliveryInfoDTO selectByPrimaryKey(Integer cId) {
		TDeliveryInfo po = deliveryInfoDao.selectByPrimaryKey(cId);
		if(po == null){
			return null;
		}
		DeliveryInfoDTO dto = new DeliveryInfoDTO();
		BeanUtils.copyProperties(po, dto);
		return dto;
	}

}
