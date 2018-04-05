package com.logistics.module.bos.dao;

import java.util.List;

import com.logistics.module.bos.model.TPermission;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午11:18:30
* 
*/
public interface PermissionDao {
	
	TPermission selectByPrimaryKey(Integer cId);
	
	List<TPermission> queryAll();
	
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
    List<TPermission> queryByPage(int pageNum, int pageSize);
    
    int insertSelective(TPermission record);
    
    int queryMaxId();
    
    int deleteSelect(int id);

}
