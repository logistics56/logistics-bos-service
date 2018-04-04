package com.logistics.module.service;

import java.util.List;

import com.logistics.module.dto.AreaDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月18日 上午10:55:09
* 
*/
public interface AreaService {
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
    List<AreaDTO> queryByPage(int pageNum, int pageSize);
    
    int insertSelective(AreaDTO record);
    
    int updateByPrimaryKeySelective(AreaDTO record);
    
    List<AreaDTO> queryMaxId();
    
    List<AreaDTO> queryByKeyword(String keyword, int pageNum, int pageSize);
    
    int deleteSelect(String id);
    
    int queryTotalByKeyword(String keyword);
    
    AreaDTO selectByPrimaryKey(String cId);
    
    List<AreaDTO> queryAll();
    
    List<AreaDTO> queryByPCD(String province, String city, String district);
}
