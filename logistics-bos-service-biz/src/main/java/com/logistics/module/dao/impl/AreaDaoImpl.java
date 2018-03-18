package com.logistics.module.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.dao.AreaDao;
import com.logistics.module.mapper.TAreaMapper;
import com.logistics.module.model.TArea;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月18日 上午10:50:04
* 
*/
@Component
public class AreaDaoImpl implements AreaDao {

	@Autowired
	TAreaMapper tAreaMapper;
	
	@Override
	public int queryTotal() {
		return tAreaMapper.queryTotal();
	}

	@Override
	public List<TArea> queryByPage(int pageNum, int pageSize) {
		return tAreaMapper.queryByPage(pageNum, pageSize);
	}

	@Override
	public int insertSelective(TArea record) {
		return tAreaMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(TArea record) {
		return tAreaMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<TArea> queryMaxId() {
		return tAreaMapper.queryMaxId();
	}

	@Override
	public List<TArea> queryByKeyword(String keyword, int pageNum, int pageSize) {
		return tAreaMapper.queryByKeyword(keyword, pageNum, pageSize);
	}

	@Override
	public int deleteSelect(String id) {
		return tAreaMapper.deleteSelect(id);
	}

	@Override
	public int queryTotalByKeyword(String keyword) {
		return tAreaMapper.queryTotalByKeyword(keyword);
	}

}
