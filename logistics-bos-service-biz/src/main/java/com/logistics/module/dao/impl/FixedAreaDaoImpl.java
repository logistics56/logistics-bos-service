package com.logistics.module.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.dao.FixedAreaDao;
import com.logistics.module.mapper.TFixedAreaMapper;
import com.logistics.module.model.TFixedArea;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月21日 下午9:55:29
* 
*/
@Component
public class FixedAreaDaoImpl implements FixedAreaDao {
	
	@Autowired
	TFixedAreaMapper tFixedAreaMapper;

	@Override
	public int queryTotal() {
		return tFixedAreaMapper.queryTotal();
	}

	@Override
	public List<TFixedArea> queryByPage(int pageNum, int pageSize) {
		return tFixedAreaMapper.queryByPage(pageNum, pageSize);
	}

	@Override
	public int insertSelective(TFixedArea record) {
		return tFixedAreaMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(TFixedArea record) {
		return tFixedAreaMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<TFixedArea> queryMaxId() {
		return tFixedAreaMapper.queryMaxId();
	}

	@Override
	public List<TFixedArea> queryByKeyword(String keyword, int pageNum, int pageSize) {
		return tFixedAreaMapper.queryByKeyword(keyword, pageNum, pageSize);
	}

	@Override
	public int deleteSelect(String id) {
		return tFixedAreaMapper.deleteSelect(id);
	}

	@Override
	public int queryTotalByKeyword(String keyword) {
		return tFixedAreaMapper.queryTotalByKeyword(keyword);
	}

	@Override
	public TFixedArea selectByPrimaryKey(String cId) {
		return tFixedAreaMapper.selectByPrimaryKey(cId);
	}

}
