package com.logistics.module.bos.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.RoleMenuDao;
import com.logistics.module.bos.mapper.TRoleMenuMapper;
import com.logistics.module.bos.model.TRoleMenuKey;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 下午8:12:55
* 
*/
@Component
public class RoleMenuDaoImpl implements RoleMenuDao {
	
	@Autowired
	TRoleMenuMapper tRoleMenuMapper;

	@Override
	public int insertSelective(TRoleMenuKey record) {
		return tRoleMenuMapper.insertSelective(record);
	}

	@Override
	public int deleteByRoleId(int roleId) {
		return tRoleMenuMapper.deleteByRoleId(roleId);
	}

	@Override
	public int deleteByMenuId(int menuId) {
		return tRoleMenuMapper.deleteByMenuId(menuId);
	}

	@Override
	public List<TRoleMenuKey> selectByRoleId(int roleId) {
		return tRoleMenuMapper.selectByRoleId(roleId);
	}

}
