package com.example.demo.dao.Interface;

import com.example.demo.dao.bo.Productdetail;
import com.example.demo.dao.bo.ProductdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductdetailMapper {
    long countByExample(ProductdetailExample example);

    int deleteByExample(ProductdetailExample example);

    int insert(Productdetail record);

    int insertSelective(Productdetail record);

    List<Productdetail> selectByExample(ProductdetailExample example);

    int updateByExampleSelective(@Param("record") Productdetail record, @Param("example") ProductdetailExample example);

    int updateByExample(@Param("record") Productdetail record, @Param("example") ProductdetailExample example);
}