package com.logistics.module.bos.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.VehicleDao;
import com.logistics.module.bos.mapper.TVehicleMapper;
import com.logistics.module.bos.model.TVehicle;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月24日 下午11:04:46
* 
*/
@Component
public class VehicleDaoImpl implements VehicleDao {
	
	@Autowired
	TVehicleMapper tVehicleMapper;

	@Override
	public int queryTotal() {
		return tVehicleMapper.queryTotal();
	}

	@Override
	public List<TVehicle> queryByPage(int pageNum, int pageSize) {
		return tVehicleMapper.queryByPage(pageNum, pageSize);
	}

	@Override
	public int queryMaxId() {
		return tVehicleMapper.queryMaxId();
	}

	@Override
	public int insertSelective(TVehicle record) {
		return tVehicleMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(TVehicle record) {
		return tVehicleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int deleteSelect(String id) {
		return tVehicleMapper.deleteSelect(id);
	}

}
