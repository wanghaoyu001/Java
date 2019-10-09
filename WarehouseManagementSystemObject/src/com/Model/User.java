package com.Model;

//用户
public class User extends People {
	//用户编号
	private int userId;
	// 初始化用户信息
	public User() {
		super();
		
	}
	
	public User(String name, String account, String password,int userId) {
		this.setName(name);
		this.setAccount(account);
		this.setPassword(password);
		this.setUserId(userId);

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	

}
