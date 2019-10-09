package com.Controller;

import com.Model.Administrators;
import com.Model.People;
import com.Model.RMWarehouse;
import com.Model.User;

public class WarehouseBiz implements IWarehouseBiz {
	// 仓库容量goodsNum
	private static final int goodsNum = 100;

	// 初始化管理员信息
	People[] admin = new Administrators[10];

	public void initializationAdmin() {
		admin[0] = new Administrators();
		admin[0].setName("管理员");
		admin[0].setAccount("admin");
		admin[0].setPassword("12345");
	}

	// 输出管理员姓名
	public void AdminShow(int flag) {
		System.out.print(admin[flag].getName());
	}

	// 初始化用户信息
	People[] user = new User[10];

	public void initializationUser() {
		user[0] = new User("张三", "qwe", "123", 1);
		user[1] = new User("李四", "asd", "456", 2);
		user[2] = new User("王五", "zxc", "789", 3);
	}

	// 初始化原料仓库
	RMWarehouse[] rmWarehouse = new RMWarehouse[goodsNum];

	public RMWarehouse[] initializationRM() {
		rmWarehouse[0] = new RMWarehouse("铁矿", "山西", "铁矿公司", "原料仓库", 1);
		rmWarehouse[1] = new RMWarehouse("铜矿", "河南", "铜矿公司", "原料仓库", 2);
		rmWarehouse[2] = new RMWarehouse("木材", "黑龙江", "伐木场", "原料仓库", 3);
		return rmWarehouse;
	}

	// 原料仓库存入
	// 管理员登录
	public int AdminLog(String account, String password) {
		int flag = 1;// flag标志位，管理员数组下标
		boolean find = false;// find标志位，为false表示未找到该管理员，为true表示找到该管理员
		for (People ad : admin) {
			if (ad != null && account.equals(ad.getAccount()) && password.equals(ad.getPassword())) {
				find = true;// 找到管理员
				break;
			}
			flag++;
		}
		if (find == true) {
			return flag;
		} else {
			return 0;
		}
	}
}
