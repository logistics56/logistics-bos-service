package com.logistics.module.crm.service;

import com.logistics.module.crm.dto.CustomerDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月22日 下午11:16:23
* 
*/
public interface CustomerService {
	CustomerDTO selectByPrimaryKey(Integer cId);
}
