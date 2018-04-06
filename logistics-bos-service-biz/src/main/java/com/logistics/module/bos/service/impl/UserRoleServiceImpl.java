package com.logistics.module.bos.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.module.bos.dao.UserRoleDao;
import com.logistics.module.bos.model.TUserRoleKey;
import com.logistics.module.dto.UserRoleDTO;
import com.logistics.module.service.UserRoleService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月6日 下午3:49:15
* 
*/
@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService {
	
	@Autowired
	UserRoleDao userRoleDao;

	@Override
	public int insertSelective(UserRoleDTO record) {
		if(record == null){
			return 0;
		}
		TUserRoleKey user = new TUserRoleKey();
		BeanUtils.copyProperties(record, user);
		return userRoleDao.insertSelective(user);
	}

	@Override
	public int deleteByRoleId(int roleId) {
		return userRoleDao.deleteByRoleId(roleId);
	}

	@Override
	public int deleteByUserId(int userId) {
		return userRoleDao.deleteByUserId(userId);
	}

}
