package com.Model;

//仓库
public abstract class Warehouse {
	private String name;// 仓库名称
	private int userId;// 用户编号
	private String time;// 货物存入时间

	public Warehouse(String name, int userId, String time) {
		super();
		this.name = name;// 仓库名称
		this.userId = userId;// 用户编号
		this.time = time;// 货物存入时间

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
