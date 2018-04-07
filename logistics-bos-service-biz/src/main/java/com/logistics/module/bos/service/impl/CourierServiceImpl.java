package com.logistics.module.bos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.logistics.module.bos.dao.CourierDao;
import com.logistics.module.dto.CourierDTO;
import com.logistics.module.bos.model.TCourier;
import com.logistics.module.service.CourierService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月17日 上午8:30:37
* 
*/
@Service("courierService")
public class CourierServiceImpl implements CourierService {
	
	@Autowired
	CourierDao courierDao;

	@Override
	public int queryTotal() {
		return courierDao.queryTotal();
	}

	@Override
	public List<CourierDTO> queryByPage(int pageNum, int pageSize) {
		List<TCourier> results = courierDao.queryByPage(pageNum, pageSize);
		List<CourierDTO> convert = convertPoToDto(results);
		return convert;
	}
	
	private List<CourierDTO> convertPoToDto(List<TCourier> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		List<CourierDTO> targetList = new ArrayList<CourierDTO>();
		for (TCourier po : list) {
			CourierDTO dto = new CourierDTO();
			BeanUtils.copyProperties(po, dto);
			targetList.add(dto);
		}
		return targetList;
	}

	@Override
	public int insertSelective(CourierDTO record) {
		TCourier courier = new TCourier();
		BeanUtils.copyProperties(record, courier);
		return courierDao.insertSelective(courier);
	}

	@Override
	public int updateByPrimaryKey(CourierDTO record) {
		TCourier courier = new TCourier();
		BeanUtils.copyProperties(record, courier);
		return courierDao.updateByPrimaryKey(courier);
	}

	@Override
	public int queryMaxId() {
		return courierDao.queryMaxId();
	}

	@Override
	public CourierDTO queryByNum(String num) {
		TCourier po = courierDao.queryByNum(num);
		if(po == null){
			return null;
		}
		CourierDTO dto = new CourierDTO();
		BeanUtils.copyProperties(po, dto);
		return dto;
	}

	@Override
	public int deleteData(String id) {
		return courierDao.deleteData(id);
	}

	@Override
	public int updateFixedAreaId(String fixedAreaId, int id, int takeTimeId) {
		return courierDao.updateFixedAreaId(fixedAreaId, id, takeTimeId);
	}

	@Override
	public List<CourierDTO> queryByFixedAreaId(String fixedAreaId) {
		List<TCourier> results = courierDao.queryByFixedAreaId(fixedAreaId);
		List<CourierDTO> convert = convertPoToDto(results);
		return convert;
	}

	@Override
	public int queryTotalByFixedAreaId(String fixedAreaId) {
		return courierDao.queryTotalByFixedAreaId(fixedAreaId);
	}

}
