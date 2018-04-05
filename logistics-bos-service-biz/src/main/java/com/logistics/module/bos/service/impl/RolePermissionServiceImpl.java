package com.logistics.module.bos.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.module.bos.dao.RolePermissionDao;
import com.logistics.module.bos.model.TRolePermissionKey;
import com.logistics.module.dto.RolePermissionDTO;
import com.logistics.module.service.RolePermissionService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 下午7:59:58
* 
*/
@Service("rolePermissionService")
public class RolePermissionServiceImpl implements RolePermissionService {
	
	@Autowired
	RolePermissionDao RolePermissionDao;

	@Override
	public int insertSelective(RolePermissionDTO record) {
		if(record == null){
			return 0;
		}
		TRolePermissionKey rolePermission = new TRolePermissionKey();
		BeanUtils.copyProperties(record, rolePermission);
		return RolePermissionDao.insertSelective(rolePermission);
	}

	@Override
	public int deleteByRoleId(int roleId) {
		return RolePermissionDao.deleteByRoleId(roleId);
	}

	@Override
	public int deleteByPermissionId(int permissionId) {
		return RolePermissionDao.deleteByPermissionId(permissionId);
	}

}
