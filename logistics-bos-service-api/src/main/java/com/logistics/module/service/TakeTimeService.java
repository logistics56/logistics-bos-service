package com.logistics.module.service;

import java.util.List;

import com.logistics.module.dto.TakeTimeDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月24日 上午9:39:17
* 
*/
public interface TakeTimeService {
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
    List<TakeTimeDTO> queryByPage(int pageNum, int pageSize);
    
    int insertSelective(TakeTimeDTO record);
    
    int updateByPrimaryKey(TakeTimeDTO record);
    
    int queryMaxId();
    
    TakeTimeDTO selectByPrimaryKey(Integer cId);
    
    public List<TakeTimeDTO> queryAll();
}
