package com.restaurant.qrcodemapper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
public class QRCode 
{
	@Id
	@GeneratedValue
	private int id;
	@Column(name="uuid")
	private String uuid;
	@Column(name="type")
	private String type;
	@Column(name="url")
	private String url;
	
	public QRCode() {
	}
	
	
	public QRCode(int id,String uuid, String type, String url) {
		super();
		this.id = id;
		this.uuid = uuid;
		this.type = type;
		this.url = url;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	
	
	
}
