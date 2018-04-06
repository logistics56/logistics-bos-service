package com.logistics.module.bos.dao;

import java.util.List;

import com.logistics.module.bos.model.TUserRoleKey;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午10:54:24
* 
*/
public interface UserRoleDao {
	
	List<TUserRoleKey> selectByUserId(int userId);
	
	int insertSelective(TUserRoleKey record);
	
    int deleteByRoleId(int roleId);
    
    int deleteByUserId(int userId);

}
