package com.crewmate.shop.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crewmate.shop.model.ResponseMessage;
import com.crewmate.shop.service.TestService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api-product")
public class TestController {
	
	private final TestService testService;

	@RequestMapping("/test")
	public ResponseEntity<ResponseMessage> getTest() {
        
        log.debug("TestController.getTest : ");
        ResponseMessage rm =  new ResponseMessage();
        rm.setData(new ArrayList<>());
        rm.setResponseMessage("Success!");
        return new ResponseEntity<ResponseMessage>(rm, HttpStatus.OK);
    }
	
	@RequestMapping("/getModel")
	public ResponseEntity<ResponseMessage> getTestModel() {
		log.debug("TestController.getTestModel.. ");
		ResponseMessage rm = new ResponseMessage();
		rm.setData(this.testService.selectModel());
		rm.setResultCode(200);
		rm.setResponseMessage("Success!");

		return new ResponseEntity<ResponseMessage>(rm, HttpStatus.OK);
	}
}
