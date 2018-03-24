package com.logistics.module.bos.dao;

import java.util.List;

import com.logistics.module.bos.model.TVehicle;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月24日 下午11:02:43
* 
*/
public interface VehicleDao {
	
    int queryTotal();
    
    List<TVehicle> queryByPage(int pageNum, int pageSize);
    
    int queryMaxId();
    
   int insertSelective(TVehicle record);
    
    int updateByPrimaryKeySelective(TVehicle record);
    
    int deleteSelect(String id);
}
