package com.example.demo.server.Interface;

import com.example.demo.dao.bo.Productdetail;
import com.example.demo.vo.PageObject;
import com.example.demo.web.api.request.ProductRequest;

import java.util.List;

public interface ProductBusisv {
     //当前页码数传进来
     PageObject findproduct(ProductRequest productRequest);

     List<Productdetail> findproductbyid(ProductRequest productRequest);
}
