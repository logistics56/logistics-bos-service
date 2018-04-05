package com.logistics.module.bos.dao;

import com.logistics.module.bos.model.TUser;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午10:28:20
* 
*/
public interface UserDao {

	TUser selectByPrimaryKey(Integer cId);
	
	int updatePWD(int userNum, String password);
}
