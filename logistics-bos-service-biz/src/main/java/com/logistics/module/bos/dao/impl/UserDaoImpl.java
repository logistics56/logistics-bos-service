package com.logistics.module.bos.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.UserDao;
import com.logistics.module.bos.mapper.TUserMapper;
import com.logistics.module.bos.model.TUser;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午10:28:58
* 
*/
@Component
public class UserDaoImpl implements UserDao {
	
	@Autowired
	TUserMapper tUserMapper;

	@Override
	public TUser selectByPrimaryKey(Integer cId) {
		return tUserMapper.selectByPrimaryKey(cId);
	}

	@Override
	public int updatePWD(int userNum, String password) {
		return tUserMapper.updatePWD(userNum, password);
	}

}
