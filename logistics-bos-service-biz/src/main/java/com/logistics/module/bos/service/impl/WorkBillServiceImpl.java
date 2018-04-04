package com.logistics.module.bos.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logistics.module.bos.dao.WorkBillDao;
import com.logistics.module.bos.model.TWorkBill;
import com.logistics.module.dto.WorkBillDTO;
import com.logistics.module.service.WorkBillService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月4日 下午1:08:34
* 
*/
@Service("workBillService")
public class WorkBillServiceImpl implements WorkBillService {
	
	@Autowired
	WorkBillDao workBillDao;

	@Override
	public int insertSelective(WorkBillDTO workBill) {
		if(workBill == null){
			return 0;
		}
		TWorkBill po = new TWorkBill();
		BeanUtils.copyProperties(workBill, po);
		return workBillDao.insertSelective(po);
	}

}
