package com.example.demo.server.impl;


import com.example.demo.dao.Interface.CartMapper;
import com.example.demo.dao.bo.Cart;
import com.example.demo.dao.bo.CartExample;
import com.example.demo.server.Interface.CartBusisv;
import com.example.demo.web.api.request.CartRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartBusisvImpl implements CartBusisv {
    @Autowired
    private CartMapper cartMapper;
    @Override
    public List<Cart> findcartbyid(Integer userId) {
        CartExample example=new CartExample();
        CartExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        //查到对应的购物车整合到list集合
    List<Cart> carts= cartMapper.selectByExample(example);
        return carts;
    }

    @Override
    public boolean insertcart(CartRequest cartRequest) {
        //插入到购物车中 当新增商品的时候 要先判断是更新商品还是插入商品
       int insert=0;
        CartExample example=new CartExample();
        CartExample.Criteria criteria=example.createCriteria();
        criteria.andUserIdEqualTo(cartRequest.getUserId());
        criteria.andProduceIdEqualTo(cartRequest.getProductId());
        List<Cart> carts = cartMapper.selectByExample(example);
        if(carts==null)
        {
            //则购物车新增
            Cart record=new Cart();
            record.setNum(cartRequest.getNum());
            record.setProduceId(cartRequest.getProductId());
            record.setUserId(cartRequest.getUserId());
            //当前时间怎么设置
             insert = cartMapper.insert(record);
        }
        //有的话则购物车更新
        CartExample examples=new CartExample();
        CartExample.Criteria criteria1 = examples.createCriteria();
        criteria1.andUserIdEqualTo(cartRequest.getUserId());
        Cart record=new Cart();
        //只需要更新数量即可
         record.setNum(cartRequest.getNum());
        insert = cartMapper.updateByExample(record, examples);
       if(insert>0)
        return false;
       else
           return true;
    }
}
