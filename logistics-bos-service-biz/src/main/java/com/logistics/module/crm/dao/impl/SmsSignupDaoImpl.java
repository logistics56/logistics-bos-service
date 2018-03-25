package com.logistics.module.crm.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.crm.dao.SmsSignupDao;
import com.logistics.module.crm.mapper.TSmsSignupMapper;
import com.logistics.module.crm.model.TSmsSignup;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月25日 下午5:33:37
* 
*/
@Component
public class SmsSignupDaoImpl implements SmsSignupDao {
	
	@Autowired
	TSmsSignupMapper tSmsSignupMapper;

	@Override
	public int insertSelective(TSmsSignup record) {
		return tSmsSignupMapper.insertSelective(record);
	}

	@Override
	public List<TSmsSignup> queryByTime(Date startTime, Date endTime, String telephone, int source) {
		return tSmsSignupMapper.queryByTime(startTime, endTime, telephone, source);
	}

}
