package com.logistics.module.service;

import java.util.Date;
import java.util.List;

import com.logistics.module.dto.WorkBillDTO;

/**
*
* @author 李振        E-mail:lizhn95@163.com
* @version 创建时间：2018年4月4日 下午1:07:32
* 
*/
public interface WorkBillService {
	
	int insertSelective(WorkBillDTO workBill);
	
    int queryNoReceiveTotal(Date date);
    
    List<WorkBillDTO> queryNoReceiveByPage(int pageNum, int pageSize, Date date);
    
    int queryNoReceiveTotalByCourierId(int courierId, Date date);
    
    List<WorkBillDTO> queryNoReceiveByPageByCourierId(int courierId, int pageNum, int pageSize, Date date);
}
