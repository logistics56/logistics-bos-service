package com.logistics.module.service;

import com.logistics.module.dto.SignInfoDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月15日 上午11:37:22
* 
*/
public interface SignInfoService {
	
	int insertSelective(SignInfoDTO record);
	
	SignInfoDTO selectByPrimaryKey(Integer cId);

}
