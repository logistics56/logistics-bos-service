package com.logistics.module.service;

import java.util.List;

import com.logistics.module.dto.FixedAreaDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月21日 下午9:58:32
* 
*/
public interface FixedAreaService {
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
    List<FixedAreaDTO> queryByPage(int pageNum, int pageSize);
    
    int insertSelective(FixedAreaDTO record);
    
    int updateByPrimaryKeySelective(FixedAreaDTO record);
    
    List<FixedAreaDTO> queryMaxId();
    
    List<FixedAreaDTO> queryByKeyword(String keyword, int pageNum, int pageSize);
    
    int deleteSelect(String id);
    
    int queryTotalByKeyword(String keyword);
    
    FixedAreaDTO selectByPrimaryKey(String cId);
    
    List<FixedAreaDTO> queryAll();
}
