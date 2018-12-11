package com.example.service;
/**
 *luoxiaojiang
 * 2018年12月11日
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.UserMapper;
import com.example.proj.User;

@Service
public class UserService
{
    @Autowired
    private UserMapper userMapper;
    
    public User findByName1(String name){
        return userMapper.findByName(name);
    }
}
