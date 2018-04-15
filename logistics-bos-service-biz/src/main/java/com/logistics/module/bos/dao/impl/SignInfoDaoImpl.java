package com.logistics.module.bos.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.SignInfoDao;
import com.logistics.module.bos.mapper.TSignInfoMapper;
import com.logistics.module.bos.model.TSignInfo;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月15日 上午11:35:18
* 
*/
@Component
public class SignInfoDaoImpl implements SignInfoDao {
	
	@Autowired
	TSignInfoMapper tSignInfoMapper;

	@Override
	public int insertSelective(TSignInfo record) {
		tSignInfoMapper.insertSelective(record);
		return record.getcId();
	}

	@Override
	public TSignInfo selectByPrimaryKey(Integer cId) {
		return tSignInfoMapper.selectByPrimaryKey(cId);
	}

}
