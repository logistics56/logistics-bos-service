package com.logistics.module.bos.dao;

import java.util.List;

import com.logistics.module.bos.model.TTakeTime;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月24日 上午9:35:00
* 
*/
public interface TakeTimeDao {
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
    List<TTakeTime> queryByPage(int pageNum, int pageSize);
    
    int insertSelective(TTakeTime record);
    
    int updateByPrimaryKey(TTakeTime record);
    
    int queryMaxId();
    
    TTakeTime selectByPrimaryKey(Integer cId);
    
    List<TTakeTime> queryAll();
}
