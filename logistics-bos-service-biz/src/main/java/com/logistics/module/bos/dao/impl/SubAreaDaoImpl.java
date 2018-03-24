package com.logistics.module.bos.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.SubAreaDao;
import com.logistics.module.bos.mapper.TSubAreaMapper;
import com.logistics.module.bos.model.TSubArea;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月24日 下午12:43:28
* 
*/
@Component
public class SubAreaDaoImpl implements SubAreaDao {
	
	@Autowired
	TSubAreaMapper tSubAreaMapper;

	@Override
	public int queryTotal() {
		return tSubAreaMapper.queryTotal();
	}

	@Override
	public List<TSubArea> queryByPage(int pageNum, int pageSize) {
		return tSubAreaMapper.queryByPage(pageNum, pageSize);
	}

	@Override
	public int insertSelective(TSubArea record) {
		return tSubAreaMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(TSubArea record) {
		return tSubAreaMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<TSubArea> queryMaxId() {
		return tSubAreaMapper.queryMaxId();
	}

	@Override
	public List<TSubArea> queryByKeyword(String keyword, int pageNum, int pageSize) {
		return tSubAreaMapper.queryByKeyword(keyword, pageNum, pageSize);
	}

	@Override
	public int deleteSelect(String id) {
		return tSubAreaMapper.deleteSelect(id);
	}

	@Override
	public int queryTotalByKeyword(String keyword) {
		return tSubAreaMapper.queryTotalByKeyword(keyword);
	}

	@Override
	public List<TSubArea> queryByFixedAreaId(String fixedAreaId) {
		return tSubAreaMapper.queryByFixedAreaId(fixedAreaId);
	}

	@Override
	public int queryTotalByFixedAreaId(String fixedAreaId) {
		return tSubAreaMapper.queryTotalByFixedAreaId(fixedAreaId);
	}

}
