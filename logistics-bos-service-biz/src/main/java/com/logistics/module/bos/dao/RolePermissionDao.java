package com.logistics.module.bos.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.logistics.module.bos.model.TRolePermissionKey;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午11:16:03
* 
*/
public interface RolePermissionDao {
	
    List<TRolePermissionKey> selectByRoleId(int roleId);
    
    int insertSelective(TRolePermissionKey record);
    
    int deleteByRoleId(int roleId);
    
    int deleteByPermissionId(int permissionId);
}
