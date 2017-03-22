package com.skb.stat.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Stats {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer type;
	private String title;
	private String user;
	private String deviceinfo;
	private String details;
	private Date time = new Date();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDeviceinfo() {
		return deviceinfo;
	}
	public void setDeviceinfo(String deviceinfo) {
		this.deviceinfo = deviceinfo;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Stats [id=" + id + ", type=" + type + ", title=" + title + ", user=" + user + ", deviceinfo="
				+ deviceinfo + ", details=" + details + ", time=" + time + "]";
	}
	
	
	
}
