package com.logistics.module.test.service;

import com.logistics.module.test.dto.TestDTO;

public interface TestService {
	TestDTO selectByPrimaryKey(Integer id);
}
