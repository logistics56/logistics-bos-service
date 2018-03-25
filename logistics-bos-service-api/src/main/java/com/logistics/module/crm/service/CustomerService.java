package com.logistics.module.crm.service;

import java.util.List;

import com.logistics.module.crm.dto.CustomerDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月22日 下午11:16:23
* 
*/
public interface CustomerService {
	
	CustomerDTO selectByPrimaryKey(Integer cId);
	
	List<CustomerDTO> queryByFixedAreaId(String fixedAreaId);
	
	int updateFixedAreaId(String fixesAreaId, int id);
	
	int queryTotalByFixedAreaId(String fixesAreaId);
	
	List<CustomerDTO> queryByTelephone(String telephone);
	
	int insertSelective(CustomerDTO record);
}
