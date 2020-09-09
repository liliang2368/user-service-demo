package com.example.demo.server.impl;

import com.example.demo.dao.Interface.ProduceMapper;
import com.example.demo.dao.bo.Produce;
import com.example.demo.dao.bo.ProduceExample;
import com.example.demo.dao.bo.UserExample;
import com.example.demo.server.Interface.ProductBusisv;
import com.example.demo.vo.PageObject;
import com.example.demo.web.api.vo.ProductRequest;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductBusisvImpl implements ProductBusisv {
    @Autowired
    private ProduceMapper produceMapper;
    @Override
    public PageObject findproduct(ProductRequest productRequest) {
        //获取总数
        Integer PageSize=5;


        ProduceExample userExample=new ProduceExample();
       ProduceExample.Criteria criteria=userExample.createCriteria();
       criteria.andSkuNameLike("%"+productRequest.getProductname()+"%");
        List<Produce> records=produceMapper.selectByExample(userExample);

        //3.查询当前页记录
        Page<Produce> pagehelpeer= PageHelper.startPage(productRequest.getCurrent(),PageSize);

        return new PageObject(records,(int)pagehelpeer.getTotal(),PageSize,productRequest.getCurrent());
    }
}
