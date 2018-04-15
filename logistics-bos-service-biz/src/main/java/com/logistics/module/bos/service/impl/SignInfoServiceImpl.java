package com.logistics.module.bos.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.module.bos.dao.SignInfoDao;
import com.logistics.module.bos.model.TSignInfo;
import com.logistics.module.dto.SignInfoDTO;
import com.logistics.module.service.SignInfoService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月15日 上午11:38:12
* 
*/
@Service("signInfoService")
public class SignInfoServiceImpl implements SignInfoService {
	
	@Autowired
	SignInfoDao SignInfoDao;

	@Override
	public int insertSelective(SignInfoDTO record) {
		if(record == null){
			return 0;
		}
		TSignInfo po = new TSignInfo();
		BeanUtils.copyProperties(record, po);
		return SignInfoDao.insertSelective(po);
	}

	@Override
	public SignInfoDTO selectByPrimaryKey(Integer cId) {
		TSignInfo po = SignInfoDao.selectByPrimaryKey(cId);
		if(po == null){
			return null;
		}
		SignInfoDTO dto = new SignInfoDTO();
		BeanUtils.copyProperties(po, dto);
		return dto;
	}

}
