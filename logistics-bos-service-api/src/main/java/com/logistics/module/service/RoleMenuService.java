package com.logistics.module.service;

import com.logistics.module.dto.RoleMenuDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 下午8:15:34
* 
*/
public interface RoleMenuService {
	
    int insertSelective(RoleMenuDTO record);
    
    int deleteByRoleId(int roleId);
    
    int deleteByMenuId(int menuId);
}
