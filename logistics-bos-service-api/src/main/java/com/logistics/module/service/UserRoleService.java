package com.logistics.module.service;

import com.logistics.module.dto.UserRoleDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月6日 下午3:47:08
* 
*/
public interface UserRoleService {
	
	int insertSelective(UserRoleDTO record);
	
    int deleteByRoleId(int roleId);
    
    int deleteByUserId(int userId);
}
