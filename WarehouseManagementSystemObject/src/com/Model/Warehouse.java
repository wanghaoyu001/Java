package com.Model;
//�ֿ�
public abstract class Warehouse {
	private String name;//�ֿ�����
	private int userId;//�û����
	
	public Warehouse(String name, int userId) {
		super();
		this.name = name;
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
