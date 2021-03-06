package com.example.demo.web.api.controller;

import com.example.demo.dao.bo.Cart;
import com.example.demo.server.Interface.CartBusisv;
import com.example.demo.server.Interface.IUserBusisv;
import com.example.demo.web.api.request.CartRequest;
import com.example.demo.web.model.JsonModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value="购物车控制层",tags= {"购物车信息","控制层"})
public class CartController {
  @Autowired
  private CartBusisv cartBusisv;
 @Autowired
 private IUserBusisv iUserBusisv;

    @ApiOperation(value = "购物车查询接口", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/getcart")
    public JsonModel getproduct(CartRequest cartRequest)
    {

      List<Cart> findcartbyid = cartBusisv.findcartbyid(cartRequest.getUserId());

      return JsonModel.success(findcartbyid);
    }
    @ApiOperation(value = "购物车新增窗口", httpMethod = "POST", consumes = "application/json")
    @ApiResponse(code = 200, message = "success", response = String.class)
    @PostMapping(value = "/v1.0/insertcart")
    public JsonModel insertproduct(CartRequest cartRequest)
    {

       boolean insertcartBusisv=cartBusisv.insertcart(cartRequest);

        return JsonModel.success(insertcartBusisv);
    }




}
