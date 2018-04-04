package com.logistics.module.service;

import com.logistics.module.dto.WorkBillDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月4日 下午1:07:32
* 
*/
public interface WorkBillService {
	
	int insertSelective(WorkBillDTO workBill);
}
