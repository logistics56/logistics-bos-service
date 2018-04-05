package com.logistics.module.bos.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.RolePermissionDao;
import com.logistics.module.bos.mapper.TRolePermissionMapper;
import com.logistics.module.bos.model.TRolePermissionKey;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午11:16:51
* 
*/
@Component
public class RolePermissionDaoImpl implements RolePermissionDao {
	
	@Autowired
	TRolePermissionMapper tRolePermissionMapper;

	@Override
	public List<TRolePermissionKey> selectByRoleId(int roleId) {
		return tRolePermissionMapper.selectByRoleId(roleId);
	}

	@Override
	public int insertSelective(TRolePermissionKey record) {
		return tRolePermissionMapper.insertSelective(record);
	}

	@Override
	public int deleteByRoleId(int roleId) {
		return tRolePermissionMapper.deleteByRoleId(roleId);
	}

	@Override
	public int deleteByPermissionId(int permissionId) {
		return tRolePermissionMapper.deleteByPermissionId(permissionId);
	}

}
