package com.example.demo.server.impl;


import com.example.demo.dao.Interface.UserMapper;
import com.example.demo.dao.bo.User;
import com.example.demo.dao.bo.UserExample;
import com.example.demo.server.Interface.IUserBusisv;
import com.example.demo.util.DbMailHelper;
import com.example.demo.web.api.vo.UserRequest;
import com.example.demo.web.api.request.*;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import redis.clients.jedis.Jedis;

import java.util.List;

@Component
@Transactional
public class UserBusisvImpl  implements IUserBusisv
{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private Jedis jedis;
    @Autowired
    private DbMailHelper dbMailHelper;


    @Override
    public int insertUser(UserRequest userRequest) throws Exception {
        String email= userRequest.getEmail();
        String srt = jedis.get(email);
        //邮箱只能被注册一次
//根据用户名查数据库如果存在抛出异常
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUsernameEqualTo(userRequest.getUsername());
        System.out.println("sfweffwerwerwerwerrwerw"+userMapper.selectByExample(userExample));
        if(!(userMapper.selectByExample(userExample).isEmpty()))
        {
            throw new Exception("用户名已经被占用");
        }

        if(!(userRequest.getYanzhengma().equals(srt)))
        {
          return 0;
        }


        User user=new User();
        BeanUtils.copyProperties(user,userRequest);

        return userMapper.insert(user);
    }

    @Override
    public List<User> loginUser(UserloginRequest userloginRequest) {
        UserExample userExample=new UserExample();
         UserExample.Criteria criteria= userExample.createCriteria();
         criteria.andUsernameEqualTo(userloginRequest.getUserName());
         criteria.andPasswordEqualTo(userloginRequest.getPassWord());
        List<User> list= userMapper.selectByExample(userExample);
        return list;
    }

    @Override
    public String getrecods(User user) throws Exception {

        String email=user.getEmail();
        //随机生成验证码
      String dbc=   dbMailHelper.verifyCode();
      //随机生成那个邮箱
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andEmailEqualTo(email);
        System.out.println("sfweffwerwerwerwerrwerw"+userMapper.selectByExample(userExample));
        if(!(userMapper.selectByExample(userExample).isEmpty()))
        {
            throw new Exception("邮箱已经被注册");
        }
        try {
            dbMailHelper.sendVertifyCode(user.getEmail(), "用于邮箱注册的验证码为", dbc);
            //redis验证码怎么设置过期时间
            jedis.setex(email,  300*100,dbc);

        }catch (Exception e)
        {
            e.printStackTrace();
            return "验证码发送失败";
        }

        return "发送验证码成功";
    }
}
