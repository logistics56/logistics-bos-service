package com.logistics.module.bos.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.logistics.module.bos.model.TArea;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月18日 上午10:47:15
* 
*/
public interface AreaDao {
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
    List<TArea> queryByPage(int pageNum, int pageSize);
    
    int insertSelective(TArea record);
    
    int updateByPrimaryKeySelective(TArea record);
    
    List<TArea> queryMaxId();
    
    List<TArea> queryByKeyword(String keyword, int pageNum, int pageSize);
    
    int deleteSelect(String id);
    
    int queryTotalByKeyword(String keyword);
    
    TArea selectByPrimaryKey(String cId);
    
    List<TArea> queryAll();
    
    List<TArea> queryByPCD(String province, String city, String district);
}
