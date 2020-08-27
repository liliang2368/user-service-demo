package com.example.demo.server.impl;


import ch.qos.logback.core.joran.util.beans.BeanUtil;
import com.example.demo.dao.Interface.UserMapper;
import com.example.demo.dao.bo.User;
import com.example.demo.dao.bo.UserExample;
import com.example.demo.server.Interface.IUserBusisv;
import com.example.demo.web.userRequest.UserloginRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class UserBusisvImpl  implements IUserBusisv {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> loginUser(UserloginRequest userloginRequest) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(userloginRequest.getUserName());
        criteria.andPasswordEqualTo(userloginRequest.getPassWord());
        List<User> list=userMapper.selectByExample(userExample);
        return list;
    }
}
