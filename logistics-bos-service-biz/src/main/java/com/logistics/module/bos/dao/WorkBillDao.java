package com.logistics.module.bos.dao;

import java.util.Date;
import java.util.List;

import com.logistics.module.bos.model.TWorkBill;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月4日 下午1:04:11
* 
*/
public interface WorkBillDao {
	
	int insertSelective(TWorkBill record);
	
    int queryNoReceiveTotal(Date date);
    
    List<TWorkBill> queryNoReceiveByPage(int pageNum, int pageSize, Date date);
    
    int queryNoReceiveTotalByCourierId(int courierId, Date date);
    
    List<TWorkBill> queryNoReceiveByPageByCourierId(int courierId, int pageNum, int pageSize, Date date);
    
    int updateState(int id);
    
    TWorkBill queryByOrderId(int orderId);
    
	/**
	 * 查询收派标准的数据总个数
	 * @return
	 */
    int queryTotal(int id);
    
    /**
     * 按页查询数据
     * @param pageNum   当前页起始位置
     * @param pageSize  每页数据量
     * @return
     */
    List<TWorkBill> queryByPage(int id, int pageNum, int pageSize);
    
    TWorkBill selectByPrimaryKey(Integer cId);
    
    int updateCourierId(int courierId, int id);

}
