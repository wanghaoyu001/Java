package com.Model;

//�ֿ�
public abstract class Warehouse {
	private String name;// �ֿ�����
	private int userId;// �û����
	private String time;// �������ʱ��

	public Warehouse(String name, int userId, String time) {
		super();
		this.name = name;// �ֿ�����
		this.userId = userId;// �û����
		this.time = time;// �������ʱ��

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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
