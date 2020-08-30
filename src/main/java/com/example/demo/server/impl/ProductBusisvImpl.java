package com.example.demo.server.impl;

import com.example.demo.dao.Interface.ProduceMapper;
import com.example.demo.dao.bo.Produce;
import com.example.demo.dao.bo.ProduceExample;
import com.example.demo.dao.bo.UserExample;
import com.example.demo.server.Interface.ProductBusisv;
import com.example.demo.vo.PageObject;
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
    public PageObject findproduct(String productname, Integer current) {
        //获取总数
        Integer PageSize=5;


        ProduceExample userExample=new ProduceExample();
       ProduceExample.Criteria criteria=userExample.createCriteria();
       criteria.andSkuNameLike("%"+productname+"%");
        List<Produce> records=produceMapper.selectByExample(userExample);

        //3.查询当前页记录
        Page<Produce> pagehelpeer= PageHelper.startPage(current,PageSize);

        return new PageObject(records,(int)pagehelpeer.getTotal(),pagehelpeer.getPages(),current);
    }
}
