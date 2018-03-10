package com.logistics.module.service;

import java.util.List;

import com.logistics.module.dto.StandardDTO;

/**
* 
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月10日 上午11:17:08
*
*/
public interface StandardService {
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
    List<StandardDTO> queryByPage(int pageNum, int pageSize);
    
    int insertSelective(StandardDTO record);
    
    int updateByPrimaryKey(StandardDTO record);
    
    int queryMaxId();
}
