package com.logistics.module.bos.dao;

import java.util.List;

import com.logistics.module.bos.model.TPermission;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午11:18:30
* 
*/
public interface PermissionDao {
	
	TPermission selectByPrimaryKey(Integer cId);
	
	List<TPermission> queryAll();

}
