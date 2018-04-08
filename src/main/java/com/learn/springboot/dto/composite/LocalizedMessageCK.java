package com.learn.springboot.dto.composite;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class LocalizedMessageCK implements Serializable {
	
	@NotNull
    @Size(max = 255)
	private String original;
	@NotNull
    @Size(max = 63)
	private String locale;
	
	public LocalizedMessageCK() {}
	
	public String getOriginal() {
		return original;
	}
	public void setOriginal(String original) {
		this.original = original;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	
	

}
