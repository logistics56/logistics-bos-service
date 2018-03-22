package com.logistics.module.bos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.logistics.module.bos.dao.StandardDao;
import com.logistics.module.dto.StandardDTO;
import com.logistics.module.bos.model.TStandard;
import com.logistics.module.service.StandardService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月10日 上午11:20:28
* 
*/
@Service("standardService")
public class StandardServiceImpl implements StandardService {
	
	@Autowired
	StandardDao standardDao;

	@Override
	public int queryTotal() {
		return standardDao.queryTotal();
	}

	@Override
	public List<StandardDTO> queryByPage(int pageNum, int pageSize) {
		List<TStandard> results = standardDao.queryByPage(pageNum, pageSize);
		List<StandardDTO> convert = convertPoToDto(results);
		return convert;
	}
	
	private List<StandardDTO> convertPoToDto(List<TStandard> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		List<StandardDTO> targetList = new ArrayList<StandardDTO>();
		for (TStandard po : list) {
			StandardDTO dto = new StandardDTO();
			BeanUtils.copyProperties(po, dto);
			targetList.add(dto);
		}
		return targetList;
	}

	@Override
	public int insertSelective(StandardDTO record) {
		TStandard standard = new TStandard();
		BeanUtils.copyProperties(record, standard);
		return standardDao.insertSelective(standard);
	}

	@Override
	public int updateByPrimaryKey(StandardDTO record) {
		TStandard standard = new TStandard();
		BeanUtils.copyProperties(record, standard);
		return standardDao.updateByPrimaryKey(standard);
	}

	@Override
	public int queryMaxId() {
		return standardDao.queryMaxId();
	}

	@Override
	public StandardDTO selectByPrimaryKey(Integer cId) {
		TStandard result = standardDao.selectByPrimaryKey(cId);
		if(result == null){
			return null;
		}
		StandardDTO standardDTO = new StandardDTO();
		BeanUtils.copyProperties(result, standardDTO);
		return standardDTO;
	}

	@Override
	public List<StandardDTO> queryAll() {
		List<TStandard> results = standardDao.queryAll();
		List<StandardDTO> convert = convertPoToDto(results);
		return convert;
	}

}
