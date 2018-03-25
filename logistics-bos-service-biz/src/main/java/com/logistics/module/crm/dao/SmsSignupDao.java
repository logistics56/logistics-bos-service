package com.logistics.module.crm.dao;

import java.util.Date;
import java.util.List;

import com.logistics.module.crm.model.TSmsSignup;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月25日 下午5:32:43
* 
*/
public interface SmsSignupDao {
	
	int insertSelective(TSmsSignup record);
	
	List<TSmsSignup> queryByTime(Date startTime, Date endTime, String telephone, int source);
}
