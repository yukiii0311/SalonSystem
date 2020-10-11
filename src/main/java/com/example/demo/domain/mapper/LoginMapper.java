package com.example.demo.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.entity.Login;

@Mapper
public interface LoginMapper {
	List<Login> selectAll();

}
