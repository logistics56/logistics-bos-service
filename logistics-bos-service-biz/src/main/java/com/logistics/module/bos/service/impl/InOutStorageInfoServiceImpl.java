package com.logistics.module.bos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.logistics.module.bos.dao.InOutStorageInfoDao;
import com.logistics.module.bos.model.TInOutStorageInfo;
import com.logistics.module.dto.InOutStorageInfoDTO;
import com.logistics.module.service.InOutStorageInfoService;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月14日 下午9:49:05
* 
*/
@Service("inOutStorageInfoService")
public class InOutStorageInfoServiceImpl implements InOutStorageInfoService {
	
	@Autowired
	InOutStorageInfoDao inOutStorageInfoDao;

	@Override
	public List<InOutStorageInfoDTO> queryByTransitInfoId(int transitInfoId) {
		List<TInOutStorageInfo> results = inOutStorageInfoDao.queryByTransitInfoId(transitInfoId);
		List<InOutStorageInfoDTO> convert = convertPoToDto(results);
		return convert;
	}
	
	private List<InOutStorageInfoDTO> convertPoToDto(List<TInOutStorageInfo> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		List<InOutStorageInfoDTO> targetList = new ArrayList<InOutStorageInfoDTO>();
		for (TInOutStorageInfo po : list) {
			InOutStorageInfoDTO dto = new InOutStorageInfoDTO();
			BeanUtils.copyProperties(po, dto);
			targetList.add(dto);
		}
		return targetList;
	}

	@Override
	public int insertSelective(InOutStorageInfoDTO record) {
		if(record == null){
			return 0;
		}
		TInOutStorageInfo po = new TInOutStorageInfo();
		BeanUtils.copyProperties(record, po);
		return inOutStorageInfoDao.insertSelective(po);
	}
}
