package com.logistics.module.bos.dao;

import java.util.List;

import com.logistics.module.bos.model.TWayBill;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月7日 下午8:13:25
* 
*/
public interface WayBillDao {
	
	int insertSelective(TWayBill record);
	
	/**
	 * 查询收派标准的数据总个数
	 * @return
	 */
    int queryTotal(String orderNum, String sendAddress, String recAddress, String sendProNum, Integer signStatus);
    
    /**
     * 按页查询数据
     * @param pageNum   当前页起始位置
     * @param pageSize  每页数据量
     * @return
     */
    List<TWayBill> queryByPage(String orderNum, String sendAddress, String recAddress, String sendProNum, Integer signStatus, int pageNum, int pageSize);
    
    TWayBill queryByOrderId(int orderId);
    
    int updateSignStatus(int id, int signStatus);
    
    List<TWayBill> findWayBills(String orderNum, String sendAddress, String recAddress, String sendProNum, Integer signStatus);

}
