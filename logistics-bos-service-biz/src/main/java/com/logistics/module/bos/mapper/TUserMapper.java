package com.logistics.module.bos.mapper;

import com.logistics.module.bos.model.TUser;
import com.logistics.module.bos.model.TUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {
    int countByExample(TUserExample example);

    int insert(TUser record);

    int insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    TUser selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);
    
    int updatePWD(@Param("userNum") int userNum, @Param("password") String password);
    
    int queryTotal();
    
    List<TUser> queryByPage(@Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
    
    int deleteSelect(@Param("id") int id);
    
    int queryTotalByIdorName(@Param("cId") Integer cId, @Param("cUsername") String cUsername);
    
    List<TUser> queryByIdorName(@Param("cId") Integer cId, @Param("cUsername") String cUsername, @Param("pageNum") int pageNum, @Param("pageSize") int pageSize);
}