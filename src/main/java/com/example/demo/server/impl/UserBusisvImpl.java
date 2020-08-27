package com.example.demo.server.impl;


import com.example.demo.dao.Interface.UserMapper;
import com.example.demo.dao.bo.User;
import com.example.demo.server.Interface.IUserBusisv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UserBusisvImpl  implements IUserBusisv {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }
}
