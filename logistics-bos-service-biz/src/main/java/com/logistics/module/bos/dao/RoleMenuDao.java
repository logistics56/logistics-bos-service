package com.logistics.module.bos.dao;

import com.logistics.module.bos.model.TRoleMenuKey;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 下午8:11:35
* 
*/
public interface RoleMenuDao {
	
    int insertSelective(TRoleMenuKey record);
    
    int deleteByRoleId(int roleId);
    
    int deleteByMenuId(int menuId);
}
