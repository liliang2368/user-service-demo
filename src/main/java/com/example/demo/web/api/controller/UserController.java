package com.example.demo.web.api.controller;

import com.example.demo.dao.bo.User;
import com.example.demo.server.Interface.IUserBusisv;
import com.example.demo.server.Interface.ProductBusisv;
import com.example.demo.util.TokenTools;
import com.example.demo.vo.PageObject;
import com.example.demo.web.api.request.UserloginRequest;
import com.example.demo.web.api.vo.UserRequest;
import com.example.demo.web.model.JsonModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

// @RestController   ->   @Controller  +   @ResponseBody
@RestController
@Api(value="用户控制层",tags= {"用户信息","控制层"})
public class UserController {
	
	private Logger logger = LogManager.getLogger(UserController.class);
	@Autowired
	private IUserBusisv iUserBusisv;
	@Autowired
	private ProductBusisv productBusisv;



	@ApiOperation(value = "用户注册接口", httpMethod = "POST", consumes = "application/json")
	@ApiResponse(code = 200, message = "success", response = String.class)
	@PostMapping(value = "/v1.0/sumbitInteger")
	public JsonModel regist(@RequestBody UserRequest user) throws Exception {
		logger.info("接口入参数"+user);
		JsonModel jsonModel=new JsonModel();
		int result=iUserBusisv.insertUser(user);
		jsonModel.setObj(jsonModel);
		jsonModel.setCode(200);
		return jsonModel;
	}

	@ApiOperation(value = "用户登录接口", httpMethod = "POST", consumes = "application/json")
	@ApiResponse(code = 200, message = "success", response = String.class)
	@PostMapping(value = "/v1.0/userlogin")
	public JsonModel login(@RequestBody UserloginRequest userloginRequest, HttpServletRequest request) {
		logger.info("接口入参数"+userloginRequest);
		JsonModel jsonModel=new JsonModel();
		List<User> result=iUserBusisv.loginUser(userloginRequest);
		TokenTools.createToken(request,"stoken");//创建出stoken
		return jsonModel.success(result);
	}
	@ApiOperation(value = "邮箱调用接口", httpMethod = "POST", consumes = "application/json")
	@ApiResponse(code = 200, message = "success", response = String.class)
	@PostMapping(value = "/v1.0/setrecord")
	public JsonModel getyanzhengma(@RequestBody User user) throws Exception {
		//把验证码发送给前端
	 String str=iUserBusisv.getrecods(user);

		return  JsonModel.success(str);
	}

	
	

}
