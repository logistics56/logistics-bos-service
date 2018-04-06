package com.logistics.module.bos.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.UserRoleDao;
import com.logistics.module.bos.mapper.TUserRoleMapper;
import com.logistics.module.bos.model.TUserRoleKey;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午10:55:05
* 
*/
@Component
public class UserRoleDaoImpl implements UserRoleDao {
	
	@Autowired
	TUserRoleMapper tUserRoleMapper;

	@Override
	public List<TUserRoleKey> selectByUserId(int userId) {
		return tUserRoleMapper.selectByUserId(userId);
	}

	@Override
	public int insertSelective(TUserRoleKey record) {
		return tUserRoleMapper.insertSelective(record);
	}

	@Override
	public int deleteByRoleId(int roleId) {
		return tUserRoleMapper.deleteByRoleId(roleId);
	}

	@Override
	public int deleteByUserId(int userId) {
		return tUserRoleMapper.deleteByUserId(userId);
	}

}
