package com.example.demo.server.Interface;


import com.example.demo.web.userRequest.UserloginRequest;

import java.util.List;

public interface IUserBusisv {

    public int insertUser(User user);

    List<User> loginUser(UserloginRequest userloginRequest);
}
