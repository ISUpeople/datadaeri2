package com.example.datadaeri2.entity;

//import java.util.Date;

import org.springframework.data.annotation.Id;

public class Task {
	
	@Id
	private String _id;
	private String owner;
	/*
	private Date created_date;
	private Date due_date;
	private String detail_text;
	private int num_text;
	private int num_image;
	private int num_audio;
	*/
	public Task() {
		super();
	}
	
	public Task(String owner) {
		this.owner = owner;
	}
	/*
	public Task(String id, String owner, Date created_date, Date due_date, String detail_text, int num_text,
			int num_image, int num_audio) {
		super();
		//this.id = id;
		this.owner = owner;
		this.created_date = created_date;
		this.due_date = due_date;
		this.detail_text = detail_text;
		this.num_text = num_text;
		this.num_image = num_image;
		this.num_audio = num_audio;
	}*/
	/*
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}*/
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}/*
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public String getDetail_text() {
		return detail_text;
	}
	public void setDetail_text(String detail_text) {
		this.detail_text = detail_text;
	}
	public int getNum_text() {
		return num_text;
	}
	public void setNum_text(int num_text) {
		this.num_text = num_text;
	}
	public int getNum_image() {
		return num_image;
	}
	public void setNum_image(int num_image) {
		this.num_image = num_image;
	}
	public int getNum_audio() {
		return num_audio;
	}
	public void setNum_audio(int num_audio) {
		this.num_audio = num_audio;
	}*/
	
	@Override
	public String toString() {
		return "task owner : " + this.owner;
	}
}
