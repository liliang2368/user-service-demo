package com.example.demo.server.Interface;

import com.example.demo.dao.bo.Cart;
import com.example.demo.web.api.request.CartRequest;

import java.util.List;

public interface CartBusisv {
    List<Cart>findcartbyid(Integer userId);

    boolean insertcart(CartRequest cartRequest);
}
