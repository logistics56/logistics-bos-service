package com.logistics.module.bos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.logistics.module.bos.dao.VehicleDao;
import com.logistics.module.bos.model.TVehicle;
import com.logistics.module.dto.VehicleDTO;
import com.logistics.module.service.VehicleService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月24日 下午11:09:09
* 
*/
@Service("vehicleService")
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	VehicleDao vehicleDao;

	@Override
	public int queryTotal() {
		return vehicleDao.queryTotal();
	}

	@Override
	public List<VehicleDTO> queryByPage(int pageNum, int pageSize) {
		List<TVehicle> results = vehicleDao.queryByPage(pageNum, pageSize);
		List<VehicleDTO> convert = convertPoToDto(results);
		return convert;
	}
	
	private List<VehicleDTO> convertPoToDto(List<TVehicle> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		List<VehicleDTO> targetList = new ArrayList<VehicleDTO>();
		for (TVehicle po : list) {
			VehicleDTO dto = new VehicleDTO();
			BeanUtils.copyProperties(po, dto);
			targetList.add(dto);
		}
		return targetList;
	}

	@Override
	public int queryMaxId() {
		return vehicleDao.queryMaxId();
	}

	@Override
	public int insertSelective(VehicleDTO record) {
		TVehicle tVehicle = new TVehicle();
		BeanUtils.copyProperties(record, tVehicle);
		return vehicleDao.insertSelective(tVehicle);
	}

	@Override
	public int updateByPrimaryKeySelective(VehicleDTO record) {
		TVehicle tVehicle = new TVehicle();
		BeanUtils.copyProperties(record, tVehicle);
		return vehicleDao.updateByPrimaryKeySelective(tVehicle);
	}

	@Override
	public int deleteSelect(String id) {
		return vehicleDao.deleteSelect(id);
	}

}
