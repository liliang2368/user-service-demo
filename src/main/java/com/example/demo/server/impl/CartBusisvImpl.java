package com.example.demo.server.impl;


import com.example.demo.dao.Interface.CartMapper;
import com.example.demo.dao.bo.Cart;
import com.example.demo.dao.bo.CartExample;
import com.example.demo.server.Interface.CartBusisv;
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
}
