package com.logistics.module.service;

import java.util.List;

import com.logistics.module.dto.RoleDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午11:00:36
* 
*/
public interface RoleService {
	
	List<RoleDTO> findByUserId(int userId);
	
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
    List<RoleDTO> queryByPage(int pageNum, int pageSize);
    
    int insertSelective(RoleDTO record);
    
    int queryMaxId();
    
    List<RoleDTO> queryAll();
    
    int deleteSelect(int id);
}
