package com.logistics.module.bos.dao.impl;

import java.util.List;

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

	@Override
	public int queryTotal() {
		return tUserMapper.queryTotal();
	}

	@Override
	public List<TUser> queryByPage(int pageNum, int pageSize) {
		return tUserMapper.queryByPage(pageNum, pageSize);
	}

	@Override
	public int insertSelective(TUser record) {
		tUserMapper.insertSelective(record);
		return record.getcId();
	}

	@Override
	public int deleteSelect(int id) {
		return tUserMapper.deleteSelect(id);
	}

	@Override
	public int queryTotalByIdorName(Integer cId, String cUsername) {
		return tUserMapper.queryTotalByIdorName(cId, cUsername);
	}

	@Override
	public List<TUser> queryByIdorName(Integer cId, String cUsername, int pageNum, int pageSize) {
		return tUserMapper.queryByIdorName(cId, cUsername, pageNum, pageSize);
	}

}
