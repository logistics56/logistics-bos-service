package com.logistics.module.dao;

import java.util.List;

import com.logistics.module.model.TCourier;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月17日 上午8:23:45
* 
*/
public interface CourierDao {
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
    List<TCourier> queryByPage(int pageNum, int pageSize);
    
    int insertSelective(TCourier record);
    
    int updateByPrimaryKey(TCourier record);
    
    int queryMaxId();
    
    TCourier queryByNum(String num);
    
    int deleteData(int id);
}
