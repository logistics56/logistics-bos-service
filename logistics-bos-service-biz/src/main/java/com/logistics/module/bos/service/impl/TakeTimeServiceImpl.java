package com.logistics.module.bos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.logistics.module.bos.dao.TakeTimeDao;
import com.logistics.module.bos.model.TTakeTime;
import com.logistics.module.dto.TakeTimeDTO;
import com.logistics.module.service.TakeTimeService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月24日 上午9:41:35
* 
*/
@Service("takeTimeService")
public class TakeTimeServiceImpl implements TakeTimeService {
	
	@Autowired
	TakeTimeDao takeTimeDao;

	@Override
	public int queryTotal() {
		return takeTimeDao.queryTotal();
	}

	@Override
	public List<TakeTimeDTO> queryByPage(int pageNum, int pageSize) {
		List<TTakeTime> results = takeTimeDao.queryByPage(pageNum, pageSize);
		List<TakeTimeDTO> convert = convertPoToDto(results);
		return convert;
	}
	
	private List<TakeTimeDTO> convertPoToDto(List<TTakeTime> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		List<TakeTimeDTO> targetList = new ArrayList<TakeTimeDTO>();
		for (TTakeTime po : list) {
			TakeTimeDTO dto = new TakeTimeDTO();
			BeanUtils.copyProperties(po, dto);
			targetList.add(dto);
		}
		return targetList;
	}

	@Override
	public int insertSelective(TakeTimeDTO record) {
		TTakeTime standard = new TTakeTime();
		BeanUtils.copyProperties(record, standard);
		return takeTimeDao.insertSelective(standard);
	}

	@Override
	public int updateByPrimaryKey(TakeTimeDTO record) {
		TTakeTime standard = new TTakeTime();
		BeanUtils.copyProperties(record, standard);
		return takeTimeDao.updateByPrimaryKey(standard);
	}

	@Override
	public int queryMaxId() {
		return takeTimeDao.queryMaxId();
	}

	@Override
	public TakeTimeDTO selectByPrimaryKey(Integer cId) {
		TTakeTime result = takeTimeDao.selectByPrimaryKey(cId);
		if(result == null){
			return null;
		}
		TakeTimeDTO TakeTimeDTO = new TakeTimeDTO();
		BeanUtils.copyProperties(result, TakeTimeDTO);
		return TakeTimeDTO;
	}

	@Override
	public List<TakeTimeDTO> queryAll() {
		List<TTakeTime> results = takeTimeDao.queryAll();
		List<TakeTimeDTO> convert = convertPoToDto(results);
		return convert;
	}

}
