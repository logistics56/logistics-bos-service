package com.logistics.module.test.dao.impl;
/**
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018-03-10
* 
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.test.dao.TestDao;
import com.logistics.module.test.mapper.TestMapper;
import com.logistics.module.test.model.Test;

@Component
public class TestDaoImpl implements TestDao {
	
	@Autowired
	private TestMapper testMapper;

	@Override
	public Test selectByPrimaryKey(Integer id) {
		Test te = testMapper.selectByPrimaryKey(id);
		return te;
	}

}
