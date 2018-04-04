package com.logistics.module.bos.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.WorkBillDao;
import com.logistics.module.bos.mapper.TWorkBillMapper;
import com.logistics.module.bos.model.TWorkBill;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月4日 下午1:04:51
* 
*/
@Component
public class WorkBillDaoImpl implements WorkBillDao {
	
	@Autowired
	TWorkBillMapper tWorkBillMapper;

	@Override
	public int insertSelective(TWorkBill record) {
		return tWorkBillMapper.insertSelective(record);
	}

}
