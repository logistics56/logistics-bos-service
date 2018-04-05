package com.logistics.module.bos.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.module.bos.dao.UserDao;
import com.logistics.module.bos.model.TUser;
import com.logistics.module.dto.UserDTO;
import com.logistics.module.service.UserService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午10:37:14
* 
*/
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public UserDTO selectByPrimaryKey(Integer cId) {
		TUser user = userDao.selectByPrimaryKey(cId);
		if(user == null){
			return null;
		}
		UserDTO dto = new UserDTO();
		BeanUtils.copyProperties(user, dto);
		return dto;
	}

}
