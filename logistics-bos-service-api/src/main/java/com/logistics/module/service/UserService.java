package com.logistics.module.service;

import java.util.List;

import com.logistics.module.dto.UserDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月5日 上午10:31:30
* 
*/
public interface UserService {
	
	UserDTO selectByPrimaryKey(Integer cId);
	
	int updatePWD(int userNum, String password);
	
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
    List<UserDTO> queryByPage(int pageNum, int pageSize);
    
    int insertSelective(UserDTO record);
    
    int deleteSelect(int id);
    
    int queryTotalByIdorName(Integer cId, String cUsername);
    
    List<UserDTO> queryByIdorName(Integer cId, String cUsername, int pageNum, int pageSize);
    
    int updateByPrimaryKeySelective(UserDTO record);
}
