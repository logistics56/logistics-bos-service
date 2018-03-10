package com.logistics.module.test.dao;
/**
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018-03-10
* 
*/
import com.logistics.module.test.model.Test;

public interface TestDao {
	
	Test selectByPrimaryKey(Integer id);
}
