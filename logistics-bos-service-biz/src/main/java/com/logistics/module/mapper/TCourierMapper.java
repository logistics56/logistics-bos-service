package com.logistics.module.mapper;

import com.logistics.module.model.TCourier;
import com.logistics.module.model.TCourierExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCourierMapper {
    int countByExample(TCourierExample example);

    int insert(TCourier record);

    int insertSelective(TCourier record);

    List<TCourier> selectByExample(TCourierExample example);

    TCourier selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TCourier record, @Param("example") TCourierExample example);

    int updateByExample(@Param("record") TCourier record, @Param("example") TCourierExample example);

    int updateByPrimaryKeySelective(TCourier record);

    int updateByPrimaryKey(TCourier record);
    
    int queryTotal();
    
    List<TCourier> queryByPage(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    
    int queryMaxId();
    
    TCourier queryByNum(@Param("num") String num);
    
    int deleteData(@Param("id") int id);
}