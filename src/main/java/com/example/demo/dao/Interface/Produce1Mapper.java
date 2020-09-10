package com.example.demo.dao.Interface;

import com.example.demo.dao.bo.Produce;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface Produce1Mapper {
    List<Produce> FindProduct(String sku_name,Integer startindex,Integer pageSize);
    void findMenusByids(Integer...ids);
}
