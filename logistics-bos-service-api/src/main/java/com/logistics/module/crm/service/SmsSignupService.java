package com.logistics.module.crm.service;

import java.util.Date;
import java.util.List;

import com.logistics.module.crm.dto.SmsSignupDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月25日 下午5:37:04
* 
*/
public interface SmsSignupService {
	
	int insertSelective(SmsSignupDTO record);
	
	List<SmsSignupDTO> queryByTime(Date startTime, Date endTime, String telephone, int source);
}
