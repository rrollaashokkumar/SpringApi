package com.learn.springboot.dao;

import com.learn.springboot.dto.LocalizedMessage;

public interface LocalizedMessageDao {
	
	void saveLocalizedMessages(LocalizedMessage lm);

}
