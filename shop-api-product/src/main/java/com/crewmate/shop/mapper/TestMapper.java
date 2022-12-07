package com.crewmate.shop.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.crewmate.shop.model.TestModel;

@Mapper
public interface TestMapper {

	TestModel selectModel();
}
