package com.Controller;

import com.Model.Administrators;
import com.Model.ColdWarehouse;
import com.Model.People;
import com.Model.RMWarehouse;
import com.Model.User;

public class WarehouseBiz implements IWarehouseBiz {
	// 仓库容量goodsNum
	private static final int goodsNum = 100;
	// 管理员数量adminNum
	private static final int adminNum = 10;
	// 用户数量userNum
	private static final int userNum = 10;

	// 初始化管理员信息
	People[] admin = new Administrators[adminNum];

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
	People[] user = new User[userNum];

	public void initializationUser() {
		user[0] = new User("张三", "qwe", "123", 1);
		user[1] = new User("李四", "asd", "456", 2);
		user[2] = new User("王五", "zxc", "789", 3);
	}

	// 初始化原料仓库
	RMWarehouse[] rmWarehouse = new RMWarehouse[goodsNum];

	public RMWarehouse[] initializationRM() {
		rmWarehouse[0] = new RMWarehouse("原料仓库", 1, "2019-10-01", "铁矿", "山西", "铁矿公司");
		rmWarehouse[1] = new RMWarehouse("原料仓库", 2, "2019-09-23", "铜矿", "河南", "铜矿公司");
		rmWarehouse[2] = new RMWarehouse("原料仓库", 3, "2019-07-12", "木材", "黑龙江", "伐木场");
		return rmWarehouse;
	}

	// 初始化冷藏仓库
	ColdWarehouse[] coldWarehouse = new ColdWarehouse[goodsNum];

	public ColdWarehouse[] initializationCold() {
		coldWarehouse[0] = new ColdWarehouse("冷藏仓库", 1, "2019-10-04", "葡萄", 0.0, 30);
		coldWarehouse[1] = new ColdWarehouse("冷藏仓库", 2, "2019-05-02", "土豆", 15.0, 120);
		coldWarehouse[2] = new ColdWarehouse("冷藏仓库", 3, "2019-09-20", "西瓜", 12.0, 60);
		return coldWarehouse;

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

	// 输出原料仓库货物列表
	public void RMOutput() {
		int i = 0;// 编号
		for (RMWarehouse rm : rmWarehouse) {
			// 输出非空元素
			if (rm != null) {
				i++;
				System.out.println(i + "\t" + user[rm.getUserId() - 1].getName() + "\t" + rm.getTime() + "\t"
						+ rm.getRMName() + "\t\t" + rm.getAddress() + "\t\t" + rm.getManufacturer());
			}
		}
	}

	// 输出冷藏仓库货物列表
	public void ColdOutput() {
		int i = 0;// 编号
		for (ColdWarehouse cold : coldWarehouse) {
			// 输出非空元素
			if (cold != null) {
				i++;
				System.out.println(i + "\t" + user[cold.getUserId() - 1].getName() + "\t" + cold.getTime() + "\t"
						+ cold.getColdName() + "\t\t" + cold.getTemperature() + "℃\t\t" + cold.getQuality() + "天");
			}
		}
	}

	// 输出所有用户列表
	public void userOutput() {
		int i = 0;// 编号
		for (People user : user) {
			// 输出非空元素
			if (user != null) {
				i++;
				System.out.println(i + "\t" + user.getName() + "\t" + user.getAccount() + "\t" + user.getPassword());
			}
		}
	}
}
