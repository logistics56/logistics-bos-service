package com.logistics.module.bos.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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

	@Override
	public int queryNoReceiveTotal(Date date) {
		return workBillDao.queryNoReceiveTotal(date);
	}

	@Override
	public List<WorkBillDTO> queryNoReceiveByPage(int pageNum, int pageSize, Date date) {
		List<TWorkBill> results = workBillDao.queryNoReceiveByPage(pageNum, pageSize, date);
		List<WorkBillDTO> convert = convertPoToDto(results);
		return convert;
	}

	@Override
	public int queryNoReceiveTotalByCourierId(int courierId, Date date) {
		return workBillDao.queryNoReceiveTotalByCourierId(courierId, date);
	}

	@Override
	public List<WorkBillDTO> queryNoReceiveByPageByCourierId(int courierId, int pageNum, int pageSize, Date date) {
		List<TWorkBill> results = workBillDao.queryNoReceiveByPageByCourierId(courierId, pageNum, pageSize, date);
		List<WorkBillDTO> convert = convertPoToDto(results);
		return convert;
	}
	
	private List<WorkBillDTO> convertPoToDto(List<TWorkBill> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		List<WorkBillDTO> targetList = new ArrayList<WorkBillDTO>();
		for (TWorkBill po : list) {
			WorkBillDTO dto = new WorkBillDTO();
			BeanUtils.copyProperties(po, dto);
			targetList.add(dto);
		}
		return targetList;
	}

	@Override
	public int updateState(int id) {
		return workBillDao.updateState(id);
	}

	@Override
	public WorkBillDTO queryByOrderId(int orderId) {
		TWorkBill workBill = workBillDao.queryByOrderId(orderId);
		if(workBill == null){
			return null;
		}
		WorkBillDTO dto = new WorkBillDTO();
		BeanUtils.copyProperties(workBill, dto);
		return dto;
	}

	@Override
	public int queryTotal(int id) {
		return workBillDao.queryTotal(id);
	}

	@Override
	public List<WorkBillDTO> queryByPage(int id, int pageNum, int pageSize) {
		List<TWorkBill> results = workBillDao.queryByPage(id, pageNum, pageSize);
		List<WorkBillDTO> convert = convertPoToDto(results);
		return convert;
	}

	@Override
	public WorkBillDTO selectByPrimaryKey(Integer cId) {
		TWorkBill workBill = workBillDao.selectByPrimaryKey(cId);
		if(workBill == null){
			return null;
		}
		WorkBillDTO dto = new WorkBillDTO();
		BeanUtils.copyProperties(workBill, dto);
		return dto;
	}

	@Override
	public int updateCourierId(int courierId, int id) {
		return workBillDao.updateCourierId(courierId, id);
	}

}
