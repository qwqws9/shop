package com.crewmate.shop.service.impl;

import org.springframework.stereotype.Service;

import com.crewmate.shop.mapper.TestMapper;
import com.crewmate.shop.model.TestModel;
import com.crewmate.shop.service.TestService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

	private final TestMapper testMapper;

	@Override
	public TestModel selectModel() {
		return this.testMapper.selectModel();
	}

}
