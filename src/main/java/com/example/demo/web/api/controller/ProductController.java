package com.example.demo.web.api.controller;

import com.example.demo.dao.bo.Productdetail;
import com.example.demo.server.Interface.ProductBusisv;
import com.example.demo.vo.PageObject;
import com.example.demo.web.api.request.ProductRequest;
import com.example.demo.web.model.JsonModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value="商品控制层",tags= {"商品信息","控制层"})
public class ProductController {
    @Autowired
    private ProductBusisv productBusisv;
    private ProductRequest productRequest;

    @ApiOperation(value = "商品查询调用接口", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/setrecord1")
    public JsonModel getproduct(ProductRequest productRequest)
    {
        PageObject result= productBusisv.findproduct(productRequest);
        return JsonModel.success(result);
    }

    @ApiOperation(value = " 根据商品查询调用商品详情接口", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/findbyproductud")
    public JsonModel getproductbyid(ProductRequest productRequest)
    {

        List<Productdetail> result= productBusisv.findproductbyid(productRequest);
        return JsonModel.success(result);
    }


}
