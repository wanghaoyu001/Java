package com.Model;

//�û�
public class User extends People {
	//�û����
	private int userId;
	// ��ʼ���û���Ϣ
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
