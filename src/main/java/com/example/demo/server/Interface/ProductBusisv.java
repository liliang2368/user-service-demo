package com.example.demo.server.Interface;

import com.example.demo.vo.PageObject;

public interface ProductBusisv {
     //当前页码数传进来
     PageObject findproduct(String productname, Integer current);
}
