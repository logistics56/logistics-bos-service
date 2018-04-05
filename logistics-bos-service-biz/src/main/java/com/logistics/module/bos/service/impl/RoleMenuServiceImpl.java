package com.logistics.module.bos.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.module.bos.dao.RoleMenuDao;
import com.logistics.module.bos.model.TRoleMenuKey;
import com.logistics.module.dto.RoleMenuDTO;
import com.logistics.module.service.RoleMenuService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 下午8:16:55
* 
*/
@Service("roleMenuService")
public class RoleMenuServiceImpl implements RoleMenuService {
	
	@Autowired
	RoleMenuDao roleMenuDao;

	@Override
	public int insertSelective(RoleMenuDTO record) {
		if(record == null){
			return 0;
		}
		TRoleMenuKey roleMenu = new TRoleMenuKey();
		BeanUtils.copyProperties(record, roleMenu);
		return roleMenuDao.insertSelective(roleMenu);
	}

	@Override
	public int deleteByRoleId(int roleId) {
		return roleMenuDao.deleteByRoleId(roleId);
	}

	@Override
	public int deleteByMenuId(int menuId) {
		return roleMenuDao.deleteByMenuId(menuId);
	}

}
