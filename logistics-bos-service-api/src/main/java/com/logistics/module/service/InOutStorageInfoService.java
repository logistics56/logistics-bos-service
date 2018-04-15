package com.logistics.module.service;

import java.util.List;

import com.logistics.module.dto.InOutStorageInfoDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月14日 下午9:46:31
* 
*/
public interface InOutStorageInfoService {
	
    List<InOutStorageInfoDTO> queryByTransitInfoId(int transitInfoId);

}
