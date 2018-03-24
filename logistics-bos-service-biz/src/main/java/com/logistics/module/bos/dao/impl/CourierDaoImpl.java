package com.logistics.module.bos.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.CourierDao;
import com.logistics.module.bos.mapper.TCourierMapper;
import com.logistics.module.bos.model.TCourier;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月17日 上午8:25:12
* 
*/

@Component
public class CourierDaoImpl implements CourierDao {

	@Autowired
	TCourierMapper tCourierMapper;
	
	@Override
	public int queryTotal() {
		return tCourierMapper.queryTotal();
	}

	@Override
	public List<TCourier> queryByPage(int pageNum, int pageSize) {
		return tCourierMapper.queryByPage(pageNum, pageSize);
	}

	@Override
	public int insertSelective(TCourier record) {
		return tCourierMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKey(TCourier record) {
		return tCourierMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int queryMaxId() {
		return tCourierMapper.queryMaxId();
	}

	@Override
	public TCourier queryByNum(String num) {
		return tCourierMapper.queryByNum(num);
	}

	@Override
	public int deleteData(int id) {
		return tCourierMapper.deleteData(id);
	}
	
	@Override
	public int updateFixedAreaId(String fixesAreaId, int id, int takeTimeId) {
		return tCourierMapper.updateFixedAreaId(fixesAreaId, id, takeTimeId);
	}

	@Override
	public List<TCourier> queryByFixedAreaId(String fixedAreaId) {
		return tCourierMapper.queryByFixedAreaId(fixedAreaId);
	}

	@Override
	public int queryTotalByFixedAreaId(String fixedAreaId) {
		return tCourierMapper.queryTotalByFixedAreaId(fixedAreaId);
	}

}
