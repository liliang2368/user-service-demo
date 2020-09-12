package com.example.demo.server.Interface;

import com.example.demo.dao.bo.Cart;

import java.util.List;

public interface CartBusisv {
    List<Cart>findcartbyid(Integer userId);
}
