package com.logistics.module.service;

import java.util.List;

import com.logistics.module.dto.VehicleDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月24日 下午11:08:14
* 
*/
public interface VehicleService {
	
    int queryTotal();
    
    List<VehicleDTO> queryByPage(int pageNum, int pageSize);
    
    int queryMaxId();
    
   int insertSelective(VehicleDTO record);
    
    int updateByPrimaryKeySelective(VehicleDTO record);
    
    int deleteSelect(String id);
}
