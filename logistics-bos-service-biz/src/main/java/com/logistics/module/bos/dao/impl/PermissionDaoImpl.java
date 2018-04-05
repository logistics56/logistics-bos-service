package com.logistics.module.bos.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.PermissionDao;
import com.logistics.module.bos.mapper.TPermissionMapper;
import com.logistics.module.bos.model.TPermission;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午11:19:00
* 
*/
@Component
public class PermissionDaoImpl implements PermissionDao {
	
	@Autowired
	TPermissionMapper tPermissionMapper;

	@Override
	public TPermission selectByPrimaryKey(Integer cId) {
		return tPermissionMapper.selectByPrimaryKey(cId);
	}

	@Override
	public List<TPermission> queryAll() {
		return tPermissionMapper.queryAll();
	}

	@Override
	public int queryTotal() {
		return tPermissionMapper.queryTotal();
	}

	@Override
	public List<TPermission> queryByPage(int pageNum, int pageSize) {
		return tPermissionMapper.queryByPage(pageNum, pageSize);
	}

	@Override
	public int insertSelective(TPermission record) {
		return tPermissionMapper.insertSelective(record);
	}

	@Override
	public int queryMaxId() {
		return tPermissionMapper.queryMaxId();
	}

	@Override
	public int deleteSelect(int id) {
		return tPermissionMapper.deleteSelect(id);
	}

}
