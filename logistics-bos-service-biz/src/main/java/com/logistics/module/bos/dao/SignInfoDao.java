package com.logistics.module.bos.dao;

import com.logistics.module.bos.model.TSignInfo;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月15日 上午11:34:44
* 
*/
public interface SignInfoDao {
	
	int insertSelective(TSignInfo record);
	
	TSignInfo selectByPrimaryKey(Integer cId);

}
