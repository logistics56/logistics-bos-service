package com.logistics.module.bos.dao.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/**
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018-03-10
* 
*/
import org.springframework.stereotype.Component;

import com.logistics.module.bos.dao.StandardDao;
import com.logistics.module.bos.mapper.TStandardMapper;
import com.logistics.module.bos.model.TStandard;

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

	@Override
	public int insertSelective(TStandard record) {
		return standardMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKey(TStandard record) {
		return standardMapper.updateByPrimaryKey(record);
	}

	@Override
	public int queryMaxId() {
		return standardMapper.queryMaxId();
	}

	@Override
	public TStandard selectByPrimaryKey(Integer cId) {
		return standardMapper.selectByPrimaryKey(cId);
	}

	@Override
	public List<TStandard> queryAll() {
		return standardMapper.queryAll();
	}

}
