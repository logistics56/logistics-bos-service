package com.logistics.module.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.logistics.module.dao.FixedAreaDao;
import com.logistics.module.dto.FixedAreaDTO;
import com.logistics.module.model.TFixedArea;
import com.logistics.module.service.FixedAreaService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月21日 下午10:01:41
* 
*/
@Service("fixedAreaService")
public class FixedAreaServiceImpl implements FixedAreaService {
	
	@Autowired
	FixedAreaDao fixedAreaDao;

	@Override
	public int queryTotal() {
		return fixedAreaDao.queryTotal();
	}

	@Override
	public List<FixedAreaDTO> queryByPage(int pageNum, int pageSize) {
		List<TFixedArea> results = fixedAreaDao.queryByPage(pageNum, pageSize);
		List<FixedAreaDTO> convert = convertPoToDto(results);
		return convert;
	}
	private List<FixedAreaDTO> convertPoToDto(List<TFixedArea> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		List<FixedAreaDTO> targetList = new ArrayList<FixedAreaDTO>();
		for (TFixedArea po : list) {
			FixedAreaDTO dto = new FixedAreaDTO();
			BeanUtils.copyProperties(po, dto);
			targetList.add(dto);
		}
		return targetList;
	}
	@Override
	public int insertSelective(FixedAreaDTO record) {
		TFixedArea area = new TFixedArea();
		BeanUtils.copyProperties(record, area);
		return fixedAreaDao.insertSelective(area);
	}

	@Override
	public int updateByPrimaryKeySelective(FixedAreaDTO record) {
		TFixedArea area = new TFixedArea();
		BeanUtils.copyProperties(record, area);
		return fixedAreaDao.updateByPrimaryKeySelective(area);
	}

	@Override
	public List<FixedAreaDTO> queryMaxId() {
		List<TFixedArea> results = fixedAreaDao.queryMaxId();
		List<FixedAreaDTO> convert = convertPoToDto(results);
		return convert;
	}

	@Override
	public List<FixedAreaDTO> queryByKeyword(String keyword, int pageNum, int pageSize) {
		List<TFixedArea> results = fixedAreaDao.queryByKeyword(keyword, pageNum, pageSize);
		List<FixedAreaDTO> convert = convertPoToDto(results);
		return convert;
	}

	@Override
	public int deleteSelect(String id) {
		return fixedAreaDao.deleteSelect(id);
	}

	@Override
	public int queryTotalByKeyword(String keyword) {
		return fixedAreaDao.queryTotalByKeyword(keyword);
	}

	@Override
	public FixedAreaDTO selectByPrimaryKey(String cId) {
		TFixedArea tFixedArea = fixedAreaDao.selectByPrimaryKey(cId);
		if(tFixedArea == null){
			return null;
		}
		FixedAreaDTO dto = new FixedAreaDTO();
		BeanUtils.copyProperties(tFixedArea, dto);
		return dto;
	}

}
