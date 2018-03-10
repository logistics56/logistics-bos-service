package com.logistics.module.dao;

import java.util.List;

import com.logistics.module.model.TStandard;
/**
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018-03-10
* 
*/
public interface StandardDao {
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
    List<TStandard> queryByPage(int pageNum, int pageSize);
}