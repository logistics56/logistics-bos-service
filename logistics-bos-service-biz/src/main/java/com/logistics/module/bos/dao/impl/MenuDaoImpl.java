package com.logistics.module.bos.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.MenuDao;
import com.logistics.module.bos.mapper.TMenuMapper;
import com.logistics.module.bos.model.TMenu;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 下午5:19:48
* 
*/
@Component
public class MenuDaoImpl implements MenuDao {
	
	@Autowired
	TMenuMapper tMenuMapper;

	@Override
	public int queryTotal() {
		return tMenuMapper.queryTotal();
	}

	@Override
	public List<TMenu> queryByPage(int pageNum, int pageSize) {
		return tMenuMapper.queryByPage(pageNum, pageSize);
	}

	@Override
	public int insertSelective(TMenu record) {
		return tMenuMapper.insertSelective(record);
	}

	@Override
	public int queryMaxId() {
		return tMenuMapper.queryMaxId();
	}

	@Override
	public List<TMenu> queryAll() {
		return tMenuMapper.queryAll();
	}

	@Override
	public int deleteSelect(int id) {
		return tMenuMapper.deleteSelect(id);
	}

}
