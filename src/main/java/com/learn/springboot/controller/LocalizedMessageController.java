package com.learn.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot.dto.LocalizedMessage;
import com.learn.springboot.service.LocalizedMessageService;

@RestController()
@RequestMapping("/msgs")
public class LocalizedMessageController {
	
	@Autowired
	private LocalizedMessageService lms;
	
	@RequestMapping(value = "/locale", method = RequestMethod.POST)
	public ResponseEntity < String > saveLocalizedMessages(@RequestBody LocalizedMessage lm) {
		System.out.println("Test "+lm.getLocalizedMessageId().getOriginal());
		lms.saveLocalizedMessages(lm);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
}
