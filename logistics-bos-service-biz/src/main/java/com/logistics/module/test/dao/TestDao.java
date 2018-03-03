package com.logistics.module.test.dao;

import com.logistics.module.test.model.Test;

public interface TestDao {
	
	Test selectByPrimaryKey(Integer id);
}
