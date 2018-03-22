package com.logistics.module.bos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.logistics.module.bos.dao.AreaDao;
import com.logistics.module.dto.AreaDTO;
import com.logistics.module.bos.model.TArea;
import com.logistics.module.service.AreaService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月18日 上午10:56:15
* 
*/
@Service("areaService")
public class AreaServiceImpl implements AreaService {
	
	@Autowired
	AreaDao areaDao;

	@Override
	public int queryTotal() {
		return areaDao.queryTotal();
	}

	@Override
	public List<AreaDTO> queryByPage(int pageNum, int pageSize) {
		List<TArea> results = areaDao.queryByPage(pageNum, pageSize);
		List<AreaDTO> convert = convertPoToDto(results);
		return convert;
	}
	private List<AreaDTO> convertPoToDto(List<TArea> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		List<AreaDTO> targetList = new ArrayList<AreaDTO>();
		for (TArea po : list) {
			AreaDTO dto = new AreaDTO();
			BeanUtils.copyProperties(po, dto);
			targetList.add(dto);
		}
		return targetList;
	}
	@Override
	public int insertSelective(AreaDTO record) {
		TArea area = new TArea();
		BeanUtils.copyProperties(record, area);
		return areaDao.insertSelective(area);
	}

	@Override
	public int updateByPrimaryKeySelective(AreaDTO record) {
		TArea area = new TArea();
		BeanUtils.copyProperties(record, area);
		return areaDao.updateByPrimaryKeySelective(area);
	}

	@Override
	public List<AreaDTO> queryMaxId() {
		List<TArea> results = areaDao.queryMaxId();
		List<AreaDTO> convert = convertPoToDto(results);
		return convert;
	}

	@Override
	public List<AreaDTO> queryByKeyword(String keyword, int pageNum, int pageSize) {
		List<TArea> results = areaDao.queryByKeyword(keyword, pageNum, pageSize);
		List<AreaDTO> convert = convertPoToDto(results);
		return convert;
	}

	@Override
	public int deleteSelect(String id) {
		return areaDao.deleteSelect(id);
	}

	@Override
	public int queryTotalByKeyword(String keyword) {
		return areaDao.queryTotalByKeyword(keyword);
	}

}
