package com.logistics.module.bos.dao;

import java.util.List;

import com.logistics.module.bos.model.TArea;
import com.logistics.module.bos.model.TFixedArea;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年3月21日 下午9:53:35
* 
*/
public interface FixedAreaDao {
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
    List<TFixedArea> queryByPage(int pageNum, int pageSize);
    
    int insertSelective(TFixedArea record);
    
    int updateByPrimaryKeySelective(TFixedArea record);
    
    List<TFixedArea> queryMaxId();
    
    List<TFixedArea> queryByKeyword(String keyword, int pageNum, int pageSize);
    
    int deleteSelect(String id);
    
    int queryTotalByKeyword(String keyword);
    
    TFixedArea selectByPrimaryKey(String cId);
}
