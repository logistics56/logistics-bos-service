package com.logistics.module.service;

import java.util.List;

import com.logistics.module.dto.CourierDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月17日 上午8:29:36
* 
*/
public interface CourierService {
	/**
	 * 查询收派标准的数据总个数
	 * @return
	 */
    int queryTotal();
    
    /**
     * 按页查询数据
     * @param pageNum   当前页起始位置
     * @param pageSize  每页数据量
     * @return
     */
    List<CourierDTO> queryByPage(int pageNum, int pageSize);
    
    int insertSelective(CourierDTO record);
    
    int updateByPrimaryKey(CourierDTO record);
    
    int queryMaxId();
    
    CourierDTO queryByNum(String num);
    
    int deleteData(String id);
    
    List<CourierDTO> queryByFixedAreaId(String fixedAreaId);
    
	int updateFixedAreaId(String fixedAreaId, int id, int takeTimeId);
	
    int queryTotalByFixedAreaId(String fixedAreaId);
    
    CourierDTO selectByPrimaryKey(Integer cId);
}
