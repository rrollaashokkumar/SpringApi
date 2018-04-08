package com.learn.springboot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.springboot.dao.LocalizedMessageDao;
import com.learn.springboot.dto.LocalizedMessage;
import com.learn.springboot.service.LocalizedMessageService;

@Service
public class LocalizedMessageServiceImpl implements LocalizedMessageService {

	@Autowired
	private LocalizedMessageDao lmd;
	
	public LocalizedMessageServiceImpl() {}
	
	@Override
	public void saveLocalizedMessages(LocalizedMessage lm) {
		lmd.saveLocalizedMessages(lm);
	}

}
