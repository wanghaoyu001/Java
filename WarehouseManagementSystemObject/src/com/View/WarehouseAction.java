package com.View;

import java.lang.Character.UnicodeScript;
import java.util.Scanner;

import com.Controller.Add;
import com.Controller.CreateRM;
import com.Model.Administrators;
import com.Model.People;
import com.Model.RMWarehouse;
import com.Model.User;
import com.Model.Warehouse;

public class WarehouseAction {

	public static void main(String[] args) {

		// 初始化管理员信息
		People[] admin = new Administrators[10];
		admin[0] = new Administrators();
		admin[0].setName("管理员");
		admin[0].setAccount("admin");
		admin[0].setPassword("12345");

		// System.out.println(admin[0].getName());
		// System.out.println(admin[0].getAccount());
		// System.out.println(admin[0].getPassword());

		// 初始化用户信息
		People[] user = new User[10];
		user[0] = new User("张三", "qwe", "123",1);
		user[1] = new User("李四", "asd", "456",2);
		user[2] = new User("王五", "zxc", "789",3);

		// System.out.println(user[0].getName());
		// System.out.println(user[0].getAccount());
		// System.out.println(user[0].getPassword());
		
		//初始化原料仓库
		CreateRM rm = new CreateRM();
		rm.initializationRMWarehouse();
		Add add = new Add();
		add.AddRMWarehouse(rm.initializationRMWarehouse());
		
		
		Scanner input = new Scanner(System.in);
		int choose = 0;// 标志位，为0持续循环，为1退出循环
		do {
			System.out.println("******欢迎使用仓库管理系统******");
			System.out.println("*  1.管理员入口                               *");
			System.out.println("*  2.用户入口                                   *");
			System.out.println("*  0.退出系统                                   *");
			System.out.println("*****************************");
			choose = input.nextInt();
			switch (choose) {
			case 1:
				// 管理员入口
				// flag标志位，管理员数组下标
				int flag = 0;
				// find标志位，为false表示未找到该管理员，为true表示找到该管理员
				boolean find = false;
				do {
					System.out.println("******管理员登录******");
					System.out.print("请输入账号：");
					String account = input.next();
					System.out.print("请输入密码：");
					String password = input.next();
					for (People ad:admin) {
						if (ad!=null&&account.equals(ad.getAccount()) && password.equals(ad.getPassword())) {
							find = true;//找到管理员
							break;
						}
						flag++;
					}
					if (find==false) {
						System.out.println("用户不存在!请重新登录！");
						flag = 0;//标志位重置
					} else {
						//管理员操作
						System.out.println("登录成功！");
						System.out.println("欢迎  *" + admin[flag].getName() + "*  使用仓库管理系统");
						
						int choose1=0;
						do {
							System.out.println("---------仓库管理---------");
							System.out.println("1.货物管理");
							System.out.println("2.用户管理");
							System.out.println("0.退出");
							
							choose1 = input.nextInt();
							switch (choose1) {
							case 1:
								//货物管理
								System.out.println("-----货物管理-----");
								
								break;
							case 2:
								//用户管理
								break;
							case 0:
								//退出系统
								choose1 = 0;
								break;

							default:
								System.out.println("输入数字有误，请重新输入！");
								break;
							}
						} while (choose1!=0);
					}
				} while (!find);
				break;

			default:
				break;
			}
		} while (choose != 0);
	}

}
