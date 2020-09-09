package com.example.demo.web.api.controller;

import com.example.demo.server.Interface.ProductBusisv;
import com.example.demo.vo.PageObject;
import com.example.demo.web.api.vo.ProductRequest;
import com.example.demo.web.model.JsonModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="商品控制层",tags= {"商品信息","控制层"})
public class ProductController {
    @Autowired
    private ProductBusisv productBusisv;

    @ApiOperation(value = "商品查询调用接口", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/setrecord1")
    public JsonModel getproduct(ProductRequest productRequest)
    {
        PageObject result= productBusisv.findproduct(productRequest);
        return JsonModel.success(result);
    }



}
