package com.logistics.module.test.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.module.test.dao.TestDao;
import com.logistics.module.test.dto.TestDTO;
import com.logistics.module.test.model.Test;
import com.logistics.module.test.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {
	
	@Autowired
	TestDao testDao;

	@Override
	public TestDTO selectByPrimaryKey(Integer id) {
		Test te = testDao.selectByPrimaryKey(id);
		if(te==null){
			return null;
		}
		TestDTO teDto = new TestDTO();
		BeanUtils.copyProperties(te,teDto);
		return teDto;
	}

}
