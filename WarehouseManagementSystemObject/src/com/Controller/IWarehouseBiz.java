package com.Controller;

import com.Model.RMWarehouse;

public interface IWarehouseBiz {
	// 初始化管理员信息
	public void initializationAdmin();

	// 输出管理员姓名
	public void AdminShow(int flag);

	// 初始化用户信息
	public void initializationUser();

	// 管理员登录
	public int AdminLog(String account, String password);

	// 初始化原料仓库
	public RMWarehouse[] initializationRM();

}
