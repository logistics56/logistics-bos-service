package com.logistics.module.service;

import java.util.List;

import com.logistics.module.dto.PermissionDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午11:20:57
* 
*/
public interface PermissionService {
	
	List<PermissionDTO> findByUserId(int userId);

}
