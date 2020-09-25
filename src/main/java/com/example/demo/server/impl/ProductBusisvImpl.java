package com.example.demo.server.impl;

import com.example.demo.dao.Interface.ProduceMapper;
import com.example.demo.dao.bo.Produce;
import com.example.demo.dao.bo.ProduceExample;
import com.example.demo.server.Interface.ProductBusisv;
import com.example.demo.vo.PageObject;
import com.example.demo.web.api.request.ProductRequest;
import com.example.demo.web.exception.ServiceException;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductBusisvImpl implements ProductBusisv {
    @Autowired
    private ProduceMapper produceMapper;
    @Autowired
   // private Produce1Mapper produce1Mapper;

    @Override
    public PageObject findproduct(ProductRequest productRequest) {

        //参数校验
        if (productRequest.getCurrent() == null || productRequest.getCurrent() == 0) {
            throw new ServiceException("输入的当前页码值不能为空请重新输入");
        }
        int PageSize=5;
        ProduceExample produceexample=new ProduceExample();
        ProduceExample.Criteria criteria = produceexample.createCriteria();
        criteria.andSkunameLike("%" + productRequest.getProductname() + "%");
        List<Produce> records = produceMapper.selectByExample(produceexample);
        //   List<Produce> records=produceMapper.FindProduct(productRequest.getProductname(),(productRequest.getCurrent()-1)*PageSize,PageSize);
        Page<Object> Pagehelpeer = PageHelper.startPage(productRequest.getCurrent(), PageSize);
        return new PageObject(records,(int)Pagehelpeer.getTotal(),PageSize,productRequest.getCurrent());
//        if (productRequest.getProductname() != null) {
//            //获取总数
//            Integer PageSize = 5;
//            ProduceExample userExample = new ProduceExample();
//            ProduceExample.Criteria criteria = userExample.createCriteria();
//            criteria.andSkuNameLike("%" + productRequest.getProductname() + "%");
//            List<Produce> records = produceMapper.selectByExample(userExample);
//            //3.查询当前页记录
//            Page<Produce> pagehelpeer = PageHelper.startPage(productRequest.getCurrent(), PageSize);
//            return new PageObject(records, (int) pagehelpeer.getTotal(), PageSize, productRequest.getCurrent());
//        }
//        Integer PageSize=5;
//        ProduceExample userExample=new ProduceExample();
//        ProduceExample.Criteria criteria = userExample.createCriteria();
//    List<Produce> records=produceMapper.selectByExample(userExample);
        //查询当前页记录
  //   Page<Produce> pagehelpeer=PageHelper.startPage(productRequest.getCurrent(),PageSize);
  //   return new PageObject(records,(int)pagehelpeer.getTotal(),PageSize,productRequest.getCurrent());
    }


}
