package com.logistics.module.bos.dao;

import java.util.List;

import com.logistics.module.bos.model.TTransitInfo;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月14日 上午11:39:47
* 
*/
public interface TransitInfoDao {
	
	int insertSelective(TTransitInfo record);
	
	TTransitInfo queryByWayBillId(int wayBillId);
	
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
    List<TTransitInfo> queryByPage(int pageNum, int pageSize);

}
