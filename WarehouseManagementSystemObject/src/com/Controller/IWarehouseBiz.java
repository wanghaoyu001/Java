package com.Controller;

import com.Model.ColdWarehouse;
import com.Model.ConstantTemperatureWarehouse;
import com.Model.ProductWarehouse;
import com.Model.RMWarehouse;

public interface IWarehouseBiz {
	// 初始化管理员信息
	public void initializationAdmin();

	// 输出管理员姓名
	public void adminShow(int flag);

	// 输出用户姓名
	public void userShow(int flag);

	// 初始化用户信息
	public void initializationUser();

	// 管理员登录
	public int adminLog(String account, String password);

	// 用户登录
	public int userLog(String account, String password);

	// 初始化原料仓库
	public RMWarehouse[] initializationRM();
	public void initializationRMlist();

	// 初始化冷藏仓库
	public ColdWarehouse[] initializationCold();

	// 初始化恒温仓库
	public ConstantTemperatureWarehouse[] initializationConstant();

	// 初始化产品仓库
	public ProductWarehouse[] initializationProduct();

	// 输出原料仓库货物列表
	public void RMshow();
	public void rmShowList();
	public void RMshow(int flag);
	//原料仓库货物录入
	public boolean RMInput(int flag,String RMName,String Address,String Manufacturer);
	//原料仓库取出
	public boolean RMoutput(int num);

	// 输出冷藏仓库货物列表
	public void ColdOutput();
	public void ColdOutput(int flag);

	// 输出恒温仓库货物列表
	public void ConstantOutput();
	public void ConstantOutput(int flag);

	// 输出产品仓库货物列表
	public void ProductOutput();
	public void ProductOutput(int flag);

	// 输出所有用户列表
	public void userOutput();
	
	//Test
	public void test();

}
