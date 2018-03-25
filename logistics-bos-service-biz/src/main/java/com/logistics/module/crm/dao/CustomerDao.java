package com.logistics.module.crm.dao;

import java.util.List;

import com.logistics.module.crm.model.TCustomer;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月22日 下午11:11:51
* 
*/
public interface CustomerDao {
	
	TCustomer selectByPrimaryKey(Integer cId);
	
	List<TCustomer> queryByFixedAreaId(String fixedAreaId);
	
	int updateFixedAreaId(String fixedAreaId, int id);
	
	int queryTotalByFixedAreaId(String fixedAreaId);
	
	List<TCustomer> queryByTelephone(String telephone);
	
	int insertSelective(TCustomer record);

}
