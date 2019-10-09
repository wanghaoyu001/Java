package com.View;

import java.util.Scanner;

import com.Controller.IWarehouseBiz;
import com.Controller.WarehouseBiz;

public class WarehouseAction {

	public static void main(String[] args) {

		IWarehouseBiz warehouse = new WarehouseBiz();
		warehouse.initializationAdmin();// 初始化管理员信息
		warehouse.initializationUser();// 初始化用户信息
		warehouse.initializationRM();// 初始化原料仓库

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
					flag = warehouse.AdminLog(account, password);// 管理员登录

					if (flag == 0) {
						System.out.println("用户不存在!请重新登录！");
					} else {
						find = true;// 找到管理员
						// 管理员操作
						System.out.println("登录成功！");
						System.out.print("欢迎  *");
						warehouse.AdminShow(flag-1);
						System.out.println("*  使用仓库管理系统");
						int choose1 = 0;
						do {
							System.out.println("---------仓库管理---------");
							System.out.println("1.货物管理");
							System.out.println("2.用户管理");
							System.out.println("0.退出");

							choose1 = input.nextInt();
							switch (choose1) {
							case 1:
								// 货物管理
								System.out.println("-----货物管理-----");

								break;
							case 2:
								// 用户管理
								break;
							case 0:
								// 退出系统
								choose1 = 0;
								break;

							default:
								System.out.println("输入数字有误，请重新输入！");
								break;
							}
						} while (choose1 != 0);
					}
				} while (!find);
				break;

			default:
				break;
			}
		} while (choose != 0);
	}

}
