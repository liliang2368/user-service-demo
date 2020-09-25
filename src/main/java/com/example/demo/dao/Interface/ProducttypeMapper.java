package com.example.demo.dao.Interface;

import com.example.demo.dao.bo.Producttype;
import com.example.demo.dao.bo.ProducttypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProducttypeMapper {
    long countByExample(ProducttypeExample example);

    int deleteByExample(ProducttypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(Producttype record);

    int insertSelective(Producttype record);

    List<Producttype> selectByExample(ProducttypeExample example);

    Producttype selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") Producttype record, @Param("example") ProducttypeExample example);

    int updateByExample(@Param("record") Producttype record, @Param("example") ProducttypeExample example);

    int updateByPrimaryKeySelective(Producttype record);

    int updateByPrimaryKey(Producttype record);
}