package com.logistics.module.bos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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

	@Override
	public int updatePWD(int userNum, String password) {
		return userDao.updatePWD(userNum, password);
	}

	@Override
	public int queryTotal() {
		return userDao.queryTotal();
	}

	@Override
	public List<UserDTO> queryByPage(int pageNum, int pageSize) {
		List<TUser> results = userDao.queryByPage(pageNum, pageSize);
		List<UserDTO> convert = convertPoToDto(results);
		return convert;
	}

	@Override
	public int insertSelective(UserDTO record) {
		TUser user = new TUser();
		BeanUtils.copyProperties(record, user);
		return userDao.insertSelective(user);
	}

	@Override
	public int deleteSelect(int id) {
		return userDao.deleteSelect(id);
	}
	
	private List<UserDTO> convertPoToDto(List<TUser> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		List<UserDTO> targetList = new ArrayList<UserDTO>();
		for (TUser po : list) {
			UserDTO dto = new UserDTO();
			BeanUtils.copyProperties(po, dto);
			targetList.add(dto);
		}
		return targetList;
	}

	@Override
	public int queryTotalByIdorName(Integer cId, String cUsername) {
		return userDao.queryTotalByIdorName(cId, cUsername);
	}

	@Override
	public List<UserDTO> queryByIdorName(Integer cId, String cUsername, int pageNum, int pageSize) {
		List<TUser> results = userDao.queryByIdorName(cId, cUsername, pageNum, pageSize);
		List<UserDTO> convert = convertPoToDto(results);
		return convert;
	}

	@Override
	public int updateByPrimaryKeySelective(UserDTO record) {
		TUser user = new TUser();
		BeanUtils.copyProperties(record, user);
		return userDao.updateByPrimaryKeySelective(user);
	}

}
