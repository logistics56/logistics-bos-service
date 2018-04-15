package com.logistics.module.service;

import java.util.List;

import com.logistics.module.dto.TransitInfoDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月14日 上午11:43:39
* 
*/
public interface TransitInfoService {
	
	int insertSelective(TransitInfoDTO record);
	
	TransitInfoDTO queryByWayBillId(int wayBillId);
	
	/**
	 * 查询收派标准的数据总个数
	 * @return
	 */
    int queryTotal(int transitInfoId);
    
    /**
     * 按页查询数据
     * @param pageNum   当前页起始位置
     * @param pageSize  每页数据量
     * @return
     */
    List<TransitInfoDTO> queryByPage(int transitInfoId, int pageNum, int pageSize);
    
    int updateByPrimaryKeySelective(TransitInfoDTO record);
    
    TransitInfoDTO selectByPrimaryKey(Integer cId);

}
