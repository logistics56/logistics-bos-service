package com.logistics.module.bos.dao;

import java.util.List;

import com.logistics.module.bos.model.TRole;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午10:57:43
* 
*/
public interface RoleDao {
	
	TRole selectByPrimaryKey(Integer cId);
	
	List<TRole> queryAll();

}