package com.logistics.module.bos.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.module.bos.dao.WayBillDao;
import com.logistics.module.bos.model.TWayBill;
import com.logistics.module.dto.WayBillDTO;
import com.logistics.module.service.WayBillService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月7日 下午8:19:31
* 
*/
@Service("wayBillService")
public class WayBillServiceImpl implements WayBillService {
	
	@Autowired
	WayBillDao wayBillDao;

	@Override
	public int insertSelective(WayBillDTO record) {
		if(record == null){
			return 0;
		}
		TWayBill wayBill = new TWayBill();
		BeanUtils.copyProperties(record, wayBill);
		return wayBillDao.insertSelective(wayBill);
	}

}
