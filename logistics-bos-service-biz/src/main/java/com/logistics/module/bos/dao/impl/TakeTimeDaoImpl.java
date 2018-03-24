package com.logistics.module.bos.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.TakeTimeDao;
import com.logistics.module.bos.mapper.TTakeTimeMapper;
import com.logistics.module.bos.model.TTakeTime;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月24日 上午9:36:15
* 
*/
@Component
public class TakeTimeDaoImpl implements TakeTimeDao {
	
	@Autowired
	TTakeTimeMapper takeTimeMapper;

	@Override
	public int queryTotal() {
		return takeTimeMapper.queryTotal();
	}

	@Override
	public List<TTakeTime> queryByPage(int pageNum, int pageSize) {
		return takeTimeMapper.queryByPage(pageNum, pageSize);
	}

	@Override
	public int insertSelective(TTakeTime record) {
		return takeTimeMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKey(TTakeTime record) {
		return takeTimeMapper.updateByPrimaryKey(record);
	}

	@Override
	public int queryMaxId() {
		return takeTimeMapper.queryMaxId();
	}

	@Override
	public TTakeTime selectByPrimaryKey(Integer cId) {
		return takeTimeMapper.selectByPrimaryKey(cId);
	}

	@Override
	public List<TTakeTime> queryAll() {
		return takeTimeMapper.queryAll();
	}

}
