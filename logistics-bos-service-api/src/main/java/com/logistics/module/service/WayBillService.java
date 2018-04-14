package com.logistics.module.service;

import java.util.List;

import com.logistics.module.dto.WayBillDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月7日 下午8:18:41
* 
*/
public interface WayBillService {
	
	int insertSelective(WayBillDTO record);
	
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
    List<WayBillDTO> queryByPage(String orderNum, String sendAddress, String recAddress, String sendProNum, Integer signStatus, int pageNum, int pageSize);
    
    WayBillDTO queryByOrderId(int orderId);
    
    int updateSignStatus(int id, int signStatus);

}
