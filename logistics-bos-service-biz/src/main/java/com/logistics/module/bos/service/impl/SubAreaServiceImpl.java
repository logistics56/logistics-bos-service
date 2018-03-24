package com.logistics.module.bos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.logistics.module.bos.dao.SubAreaDao;
import com.logistics.module.bos.model.TSubArea;
import com.logistics.module.dto.SubAreaDTO;
import com.logistics.module.service.SubAreaService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月24日 下午12:48:04
* 
*/
@Service("subAreaService")
public class SubAreaServiceImpl implements SubAreaService {
	
	@Autowired
	SubAreaDao subAreaDao;

	@Override
	public int queryTotal() {
		return subAreaDao.queryTotal();
	}

	@Override
	public List<SubAreaDTO> queryByPage(int pageNum, int pageSize) {
		List<TSubArea> results = subAreaDao.queryByPage(pageNum, pageSize);
		List<SubAreaDTO> convert = convertPoToDto(results);
		return convert;
	}
	private List<SubAreaDTO> convertPoToDto(List<TSubArea> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		List<SubAreaDTO> targetList = new ArrayList<SubAreaDTO>();
		for (TSubArea po : list) {
			SubAreaDTO dto = new SubAreaDTO();
			BeanUtils.copyProperties(po, dto);
			targetList.add(dto);
		}
		return targetList;
	}
	@Override
	public int insertSelective(SubAreaDTO record) {
		TSubArea area = new TSubArea();
		BeanUtils.copyProperties(record, area);
		return subAreaDao.insertSelective(area);
	}

	@Override
	public int updateByPrimaryKeySelective(SubAreaDTO record) {
		TSubArea area = new TSubArea();
		BeanUtils.copyProperties(record, area);
		return subAreaDao.updateByPrimaryKeySelective(area);
	}

	@Override
	public List<SubAreaDTO> queryMaxId() {
		List<TSubArea> results = subAreaDao.queryMaxId();
		List<SubAreaDTO> convert = convertPoToDto(results);
		return convert;
	}

	@Override
	public List<SubAreaDTO> queryByKeyword(String keyword, int pageNum, int pageSize) {
		List<TSubArea> results = subAreaDao.queryByKeyword(keyword, pageNum, pageSize);
		List<SubAreaDTO> convert = convertPoToDto(results);
		return convert;
	}

	@Override
	public int deleteSelect(String id) {
		return subAreaDao.deleteSelect(id);
	}

	@Override
	public int queryTotalByKeyword(String keyword) {
		return subAreaDao.queryTotalByKeyword(keyword);
	}

}
