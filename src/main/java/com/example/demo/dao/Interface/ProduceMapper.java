package com.example.demo.dao.Interface;

import com.example.demo.dao.bo.Produce;
import com.example.demo.dao.bo.ProduceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProduceMapper {
    long countByExample(ProduceExample example);

    int deleteByExample(ProduceExample example);

    int deleteByPrimaryKey(Integer productId);

    int insert(Produce record);

    int insertSelective(Produce record);

    List<Produce> selectByExample(ProduceExample example);

    Produce selectByPrimaryKey(Integer productId);

    int updateByExampleSelective(@Param("record") Produce record, @Param("example") ProduceExample example);

    int updateByExample(@Param("record") Produce record, @Param("example") ProduceExample example);

    int updateByPrimaryKeySelective(Produce record);

    int updateByPrimaryKey(Produce record);
}