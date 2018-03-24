package com.logistics.module.service;

import java.util.List;

import com.logistics.module.dto.SubAreaDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月24日 下午12:46:57
* 
*/
public interface SubAreaService {
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
    List<SubAreaDTO> queryByPage(int pageNum, int pageSize);
    
    int insertSelective(SubAreaDTO record);
    
    int updateByPrimaryKeySelective(SubAreaDTO record);
    
    List<SubAreaDTO> queryMaxId();
    
    List<SubAreaDTO> queryByKeyword(String keyword, int pageNum, int pageSize);
    
    int deleteSelect(String id);
    
    int queryTotalByKeyword(String keyword);
}
