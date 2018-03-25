package com.logistics.module.crm.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.logistics.module.crm.dao.SmsSignupDao;
import com.logistics.module.crm.dto.SmsSignupDTO;
import com.logistics.module.crm.model.TSmsSignup;
import com.logistics.module.crm.service.SmsSignupService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月25日 下午5:37:57
* 
*/
@Service("smsSignupService")
public class SmsSignupServiceImpl implements SmsSignupService {
	
	@Autowired
	SmsSignupDao smsSignupDao;

	@Override
	public int insertSelective(SmsSignupDTO record) {
		if(record == null){
			return 0;
		}
		TSmsSignup po = new TSmsSignup();
		BeanUtils.copyProperties(record, po);
		return smsSignupDao.insertSelective(po);
	}

	@Override
	public List<SmsSignupDTO> queryByTime(Date startTime, Date endTime, String telephone,int source) {
		List<TSmsSignup> pos = smsSignupDao.queryByTime(startTime, endTime, telephone, source);
		List<SmsSignupDTO> dtos = poToDto(pos);
		return dtos;
	}

	private List<SmsSignupDTO> poToDto(List<TSmsSignup> pos){
		if(CollectionUtils.isEmpty(pos)){
			return null;
		}
		List<SmsSignupDTO> result = new ArrayList<>();
		for (TSmsSignup po : pos) {
			SmsSignupDTO dto = new SmsSignupDTO();
			BeanUtils.copyProperties(po, dto);
			result.add(dto);
		}
		return result;
	}
}
