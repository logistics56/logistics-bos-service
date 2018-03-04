package com.logistics.module.mapper;

import com.logistics.module.model.TPromotion;
import com.logistics.module.model.TPromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPromotionMapper {
    int countByExample(TPromotionExample example);

    int insert(TPromotion record);

    int insertSelective(TPromotion record);

    List<TPromotion> selectByExample(TPromotionExample example);

    TPromotion selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TPromotion record, @Param("example") TPromotionExample example);

    int updateByExample(@Param("record") TPromotion record, @Param("example") TPromotionExample example);

    int updateByPrimaryKeySelective(TPromotion record);

    int updateByPrimaryKey(TPromotion record);
}