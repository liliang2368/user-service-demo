package com.example.demo.server.Interface;


import com.example.demo.dao.bo.User;
import com.example.demo.web.api.vo.UserRequest;
import com.example.demo.web.api.userRequest.UserloginRequest;

import java.util.List;

public interface IUserBusisv {

    public int insertUser(UserRequest user) throws Exception;

    List<User> loginUser(UserloginRequest userloginRequest);

    String getrecods(User user) throws Exception;
}
