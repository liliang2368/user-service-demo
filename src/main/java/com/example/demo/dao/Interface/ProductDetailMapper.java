package com.example.demo.dao.Interface;

import com.example.demo.dao.bo.ProductDetail;
import com.example.demo.dao.bo.ProductDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductDetailMapper {
    long countByExample(ProductDetailExample example);

    int deleteByExample(ProductDetailExample example);

    int deleteByPrimaryKey(Integer productId);

    int insert(ProductDetail record);

    int insertSelective(ProductDetail record);

    List<ProductDetail> selectByExample(ProductDetailExample example);

    ProductDetail selectByPrimaryKey(Integer productId);

    int updateByExampleSelective(@Param("record") ProductDetail record, @Param("example") ProductDetailExample example);

    int updateByExample(@Param("record") ProductDetail record, @Param("example") ProductDetailExample example);

    int updateByPrimaryKeySelective(ProductDetail record);

    int updateByPrimaryKey(ProductDetail record);
}