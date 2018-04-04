package com.logistics.module.bos.dao;

import com.logistics.module.bos.model.TOrder;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月4日 上午11:33:29
* 
*/
public interface OrderDao {
	
	int insertSelective(TOrder record);
	
	TOrder queryByOrderNum(String orderNum);

}
