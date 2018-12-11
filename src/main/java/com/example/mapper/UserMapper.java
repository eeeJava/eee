package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.proj.User;

public interface UserMapper
{
    public User findByName(String name);
}
