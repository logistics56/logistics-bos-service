package com.logistics.module.bos.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.WayBillDao;
import com.logistics.module.bos.mapper.TWayBillMapper;
import com.logistics.module.bos.model.TWayBill;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月7日 下午8:13:51
* 
*/
@Component
public class WayBillDaoImpl implements WayBillDao {
	
	@Autowired
	TWayBillMapper tWayBillMapper;

	@Override
	public int insertSelective(TWayBill record) {
		return tWayBillMapper.insertSelective(record);
	}

}
