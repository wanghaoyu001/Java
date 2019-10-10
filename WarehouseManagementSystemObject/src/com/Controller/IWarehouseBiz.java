package com.Controller;

import com.Model.ColdWarehouse;
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
	
	// 初始化冷藏仓库
	public ColdWarehouse[] initializationCold();
	
	//输出原料仓库货物列表
	public void RMOutput();
	
	//输出冷藏仓库货物列表
	public void ColdOutput();
	
	//输出所有用户列表
	public void userOutput();

}
