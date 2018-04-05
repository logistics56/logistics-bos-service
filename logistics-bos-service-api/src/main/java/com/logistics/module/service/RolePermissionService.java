package com.logistics.module.service;

import com.logistics.module.dto.RolePermissionDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 下午7:58:52
* 
*/
public interface RolePermissionService {
	
    int insertSelective(RolePermissionDTO record);
    
    int deleteByRoleId(int roleId);
    
    int deleteByPermissionId(int permissionId);

}
