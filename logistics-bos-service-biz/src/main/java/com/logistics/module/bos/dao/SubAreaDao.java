package com.logistics.module.bos.dao;

import java.util.List;

import com.logistics.module.bos.model.TSubArea;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月24日 下午12:42:27
* 
*/
public interface SubAreaDao {
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
    List<TSubArea> queryByPage(int pageNum, int pageSize);
    
    int insertSelective(TSubArea record);
    
    int updateByPrimaryKeySelective(TSubArea record);
    
    List<TSubArea> queryMaxId();
    
    List<TSubArea> queryByKeyword(String keyword, int pageNum, int pageSize);
    
    int deleteSelect(String id);
    
    int queryTotalByKeyword(String keyword);
    
    List<TSubArea> queryByFixedAreaId( String fixedAreaId);
    
    int queryTotalByFixedAreaId( String fixedAreaId);
    
    List<TSubArea> queryAll();
}
