package com.example.demo.web.controller;

import com.example.demo.dao.bo.User;
import com.example.demo.server.Interface.IUserBusisv;
import com.example.demo.web.model.JsonModel;
import com.example.demo.web.userRequest.UserloginRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// @RestController   ->   @Controller  +   @ResponseBody
@RestController
@Api(value="用户控制层",tags= {"用户信息","控制层"})
public class BikeController {
	
	private Logger logger = LogManager.getLogger(BikeController.class);
	@Autowired
	private IUserBusisv iUserBusisv;

	@ApiOperation(value = "用户注册接口", httpMethod = "POST", consumes = "application/json")
	@ApiResponse(code = 200, message = "success", response = String.class)
	@PostMapping(value = "/v1.0/sumbitInteger")
	public JsonModel open(@RequestBody User user) {
		logger.info("接口入参数"+user);
		JsonModel jsonModel=new JsonModel();
		int result=iUserBusisv.insertUser(user);
		jsonModel.setObj(jsonModel);
		return jsonModel;
	}

	@ApiOperation(value = "用户登录接口", httpMethod = "POST", consumes = "application/json")
	@ApiResponse(code = 200, message = "success", response = String.class)
	@PostMapping(value = "/v1.0/userlogin")
	public JsonModel login(@RequestBody UserloginRequest userloginRequest) {
		logger.info("接口入参数"+userloginRequest);
		JsonModel jsonModel=new JsonModel();
		List<User> result=iUserBusisv.loginUser(userloginRequest);

		return jsonModel.success(result);


	}


	
	

}
