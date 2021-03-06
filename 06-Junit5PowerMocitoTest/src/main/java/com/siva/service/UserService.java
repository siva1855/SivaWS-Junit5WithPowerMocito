package com.siva.service;

import com.siva.dao.UserDAO;

public class UserService {

	private UserDAO dao;

	public UserService() {

	}

	//construction Injection
	public UserService(UserDAO dao) {
		this.dao = dao;
	}

	public String getNameByUserId(Integer id) {
		String name = dao.findNameById(id);
		return name;
	}

	public String getEmailByUserId(Integer id) {
		String email = dao.findEmailById(id);
		return email;
	}

	public void doProcess() {
		System.out.println("doProcess() method started");
		pushMsgToKafkaTopic("msg");
		System.out.println("doProcess() method ended");
	}

	public void pushMsgToKafkaTopic(String msg) {
		System.out.println("msg pushing to kafka......");
	}

	public String doWork(String msg) {
		String formattedMsg = formatMsg(msg);
		return formattedMsg;
	}

	private String formatMsg(String msg) {
		return msg.toUpperCase();
	}

}
