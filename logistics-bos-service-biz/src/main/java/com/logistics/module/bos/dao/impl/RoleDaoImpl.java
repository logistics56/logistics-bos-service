package com.logistics.module.bos.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.RoleDao;
import com.logistics.module.bos.mapper.TRoleMapper;
import com.logistics.module.bos.model.TRole;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午10:58:23
* 
*/
@Component
public class RoleDaoImpl implements RoleDao {
	
	@Autowired
	TRoleMapper tRoleMapper;

	@Override
	public TRole selectByPrimaryKey(Integer cId) {
		return tRoleMapper.selectByPrimaryKey(cId);
	}

	@Override
	public List<TRole> queryAll() {
		return tRoleMapper.queryAll();
	}

	@Override
	public int queryTotal() {
		return tRoleMapper.queryTotal();
	}

	@Override
	public List<TRole> queryByPage(int pageNum, int pageSize) {
		return tRoleMapper.queryByPage(pageNum, pageSize);
	}

	@Override
	public int insertSelective(TRole record) {
		return tRoleMapper.insertSelective(record);
	}

	@Override
	public int queryMaxId() {
		return tRoleMapper.queryMaxId();
	}

	@Override
	public int deleteSelect(int id) {
		return tRoleMapper.deleteSelect(id);
	}

}
