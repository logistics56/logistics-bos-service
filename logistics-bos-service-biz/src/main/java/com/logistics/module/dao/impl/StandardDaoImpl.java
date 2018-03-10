package com.logistics.module.dao.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/**
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018-03-10
* 
*/
import org.springframework.stereotype.Component;

import com.logistics.module.dao.StandardDao;
import com.logistics.module.mapper.TStandardMapper;
import com.logistics.module.model.TStandard;

@Component
public class StandardDaoImpl implements StandardDao {
	
	@Autowired
	private TStandardMapper standardMapper;
	
	@Override
	public int queryTotal() {
		return standardMapper.queryTotal();
	}

	@Override
	public List<TStandard> queryByPage(int pageNum, int pageSize) {
		return standardMapper.queryByPage(pageNum, pageSize);
	}

}
