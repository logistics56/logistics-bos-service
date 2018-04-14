package com.logistics.module.bos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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

	@Override
	public int queryTotal(String orderNum, String sendAddress, String recAddress, String sendProNum, Integer signStatus) {
		return wayBillDao.queryTotal(orderNum, sendAddress, recAddress, sendProNum, signStatus);
	}

	@Override
	public List<WayBillDTO> queryByPage(String orderNum, String sendAddress, String recAddress, String sendProNum, Integer signStatus, int pageNum, int pageSize) {
		List<TWayBill> results = wayBillDao.queryByPage(orderNum, sendAddress, recAddress, sendProNum, signStatus, pageNum, pageSize);
		List<WayBillDTO> convert = convertPoToDto(results);
		return convert;
	}
	
	private List<WayBillDTO> convertPoToDto(List<TWayBill> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		List<WayBillDTO> targetList = new ArrayList<WayBillDTO>();
		for (TWayBill po : list) {
			WayBillDTO dto = new WayBillDTO();
			BeanUtils.copyProperties(po, dto);
			targetList.add(dto);
		}
		return targetList;
	}

	@Override
	public WayBillDTO queryByOrderId(int orderId) {
		TWayBill po = wayBillDao.queryByOrderId(orderId);
		if(po == null){
			return null;
		}
		WayBillDTO dto = new WayBillDTO();
		BeanUtils.copyProperties(po, dto);
		return dto;
	}

	@Override
	public int updateSignStatus(int id, int signStatus) {
		return wayBillDao.updateSignStatus(id, signStatus);
	}

}
