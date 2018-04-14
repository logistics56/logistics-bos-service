package com.logistics.module.bos.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.module.bos.dao.TransitInfoDao;
import com.logistics.module.bos.model.TTransitInfo;
import com.logistics.module.dto.TransitInfoDTO;
import com.logistics.module.service.TransitInfoService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月14日 上午11:44:25
* 
*/
@Service("transitInfoService")
public class TransitInfoServiceImpl implements TransitInfoService {
	
	@Autowired
	TransitInfoDao transitInfoDao;

	@Override
	public int insertSelective(TransitInfoDTO record) {
		if(record == null){
			return 0;
		}
		TTransitInfo po = new TTransitInfo();
		BeanUtils.copyProperties(record, po);
		return transitInfoDao.insertSelective(po);
	}

	@Override
	public TransitInfoDTO queryByWayBillId(int wayBillId) {
		TTransitInfo po = transitInfoDao.queryByWayBillId(wayBillId);
		if(po == null){
			return null;
		}
		TransitInfoDTO dto = new TransitInfoDTO();
		BeanUtils.copyProperties(po, dto);
		return dto;
	}

}
