package com.logistics.module.service;

import com.logistics.module.dto.UserDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午10:31:30
* 
*/
public interface UserService {
	
	UserDTO selectByPrimaryKey(Integer cId);
	
	int updatePWD(int userNum, String password);
}
