package com.learn.springboot.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.learn.springboot.dto.composite.LocalizedMessageCK;

@Table(name="localized_message")
@Entity
public class LocalizedMessage implements Serializable{
	@EmbeddedId
	private LocalizedMessageCK localizedMessageId;
	@NotNull
	@Size(max = 4095)
	private String localized;
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdatedStamp;
	
	public LocalizedMessage() {}
	
	public LocalizedMessageCK getLocalizedMessageId() {
		return localizedMessageId;
	}
	public void setLocalizedMessageId(LocalizedMessageCK localizedMessageId) {
		this.localizedMessageId = localizedMessageId;
	}
	public String getLocalized() {
		return localized;
	}
	public void setLocalized(String localized) {
		this.localized = localized;
	}
	public Date getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}
	public void setLastUpdatedStamp(Date lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}
	
	public String toString() {
		return "Localized Message properties are "
				+ "original: "+this.localizedMessageId.getOriginal()
				+", locale: "+this.localizedMessageId.getLocale()
				+", localized: "+this.getLocalized()
				+". timestamp: "+this.lastUpdatedStamp;
	}
	

}
