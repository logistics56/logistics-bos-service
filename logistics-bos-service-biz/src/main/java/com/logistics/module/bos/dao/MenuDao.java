package com.logistics.module.bos.dao;

import java.util.List;

import com.logistics.module.bos.model.TMenu;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 下午5:18:12
* 
*/
public interface MenuDao {
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
    List<TMenu> queryByPage(int pageNum, int pageSize);
    
    int insertSelective(TMenu record);
    
    int queryMaxId();
    
    List<TMenu> queryAll();
    
    int deleteSelect(int id);
}
