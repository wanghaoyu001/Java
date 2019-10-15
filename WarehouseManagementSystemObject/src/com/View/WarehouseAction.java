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
		warehouse.initializationCold();// 初始化冷藏仓库
		warehouse.initializationConstant();// 初始化恒温仓库
		warehouse.initializationProduct();// 初始化产品仓库
		warehouse.initializationRMlist();//初始化原料仓库List
		//test
		warehouse.test();
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
					flag = warehouse.adminLog(account, password);// 管理员登录

					if (flag == 0) {
						System.out.println("用户不存在!请重新登录！");
					} else {
						find = true;// 找到管理员
						// 管理员操作
						System.out.println("登录成功！");
						System.out.print("欢迎  *");
						warehouse.adminShow(flag - 1);
						System.out.println("*  使用仓库管理系统");
						int choose1 = 0;
						do {
							System.out.println("---------仓库管理---------");
							System.out.println("1.仓库货物预览");
							System.out.println("2.用户管理");
							System.out.println("0.退出");

							choose1 = input.nextInt();
							switch (choose1) {
							case 1:
								// 货物管理
								System.out.println("-----货物管理-----");
								// 原料仓库输出
								System.out.println("-----------------原料仓库----------------");
								System.out.println("编号\t所有者\t存入时间\t\t货物名称\t\t原材料产地\t原材料生产厂家");
								warehouse.RMshow();
								// 冷藏仓库输出
								System.out.println("-----------------冷藏仓库----------------");
								System.out.println("编号\t所有者\t存入时间\t\t货物名称\t\t储存温度\t\t保质期");
								warehouse.ColdOutput();
								// 恒温仓库输出
								System.out.println("-----------------恒温仓库----------------");
								System.out.println("编号\t所有者\t存入时间\t\t货物名称\t\t储存温度\t\t重量");
								warehouse.ConstantOutput();
								// 产品仓库输出
								System.out.println("-----------------产品仓库----------------");
								System.out.println("编号\t所有者\t存入时间\t\t货物名称\t\t数量\t\t目的地");
								warehouse.ProductOutput();
								break;
							case 2:
								// 用户管理
								System.out.println("-----------------用户管理----------------");
								System.out.println("编号\t用户名\t账号\t密码");
								warehouse.userOutput();
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
			case 2:
				// 用户入口
				int choose2 = 0;// 用户入口子页面选择
				do {
					System.out.println("-------用户入口-------");
					System.out.println("1.用户登录");
					System.out.println("2.用户注册");
					System.out.println("0.退出系统");
					choose2 = input.nextInt();
					switch (choose2) {
					case 1:
						// 用户登录
						System.out.println("******用户登录******");
						System.out.print("请输入账号：");
						String account = input.next();
						System.out.print("请输入密码：");
						String password = input.next();
						flag = warehouse.userLog(account, password);// 管理员登录

						if (flag == 0) {
							System.out.println("用户不存在!请重新登录！");
						} else {
							find = true;// 找到用户
							// 用户操作
							System.out.println("登录成功！");
							System.out.print("欢迎  *");
							warehouse.userShow(flag - 1);
							System.out.println("*  使用仓库管理系统");
							int choose3 = 0;// 用户仓库管理子页面选择
							do {
								System.out.println("---------仓库管理---------");
								System.out.println("1.查看货物清单");
								System.out.println("2.存入货物");
								System.out.println("3.取出货物");
								System.out.println("4.修改货物信息");
								System.out.println("5.查询货物信息");
								System.out.println("0.退出系统");
								choose3 = input.nextInt();
								switch (choose3) {
								case 1:
									// 查看货物清单
									// 原料仓库输出
									System.out.println("-----------------原料仓库----------------");
									System.out.println("编号\t所有者\t存入时间\t\t货物名称\t\t原材料产地\t原材料生产厂家");
									warehouse.RMshow(flag);
									// 冷藏仓库输出
									System.out.println("-----------------冷藏仓库----------------");
									System.out.println("编号\t所有者\t存入时间\t\t货物名称\t\t储存温度\t\t保质期");
									warehouse.ColdOutput(flag);
									// 恒温仓库输出
									System.out.println("-----------------恒温仓库----------------");
									System.out.println("编号\t所有者\t存入时间\t\t货物名称\t\t储存温度\t\t重量");
									warehouse.ConstantOutput(flag);
									// 产品仓库输出
									System.out.println("-----------------产品仓库----------------");
									System.out.println("编号\t所有者\t存入时间\t\t货物名称\t\t数量\t\t目的地");
									warehouse.ProductOutput(flag);
									break;
								case 2:
									// 存入货物
									int choose4 = 0;// 货物存取选择
									do {
										System.out.println("-----------------货物录入-------------------");
										System.out.println("请选择仓库种类：");
										System.out.println("1.原料仓库");
										System.out.println("2.冷藏仓库");
										System.out.println("3.恒温仓库");
										System.out.println("4.产品仓库");
										System.out.println("0.退出");
										choose4 = input.nextInt();
										switch (choose4) {
										case 1:
											// 原料仓库存入
											System.out.println("--------原料仓库录入-------");
											System.out.print("请输入产品名称：");
											String RMName = input.next();
											System.out.print("请输入产品产地：");
											String Address = input.next();
											System.out.print("请输入产品生产厂家：");
											String Manufacturer = input.next();
											boolean result = warehouse.RMInput(flag, RMName, Address, Manufacturer);
											if (result) {
												System.out.println("货物信息录入成功!");
											} else {
												System.out.println("货物信息录入失败!");
											}
											break;
										case 2:
											// 冷藏仓库存入
											break;
										case 3:
											// 恒温仓库存入
											break;
										case 4:
											// 产品仓库存入
											break;
										case 0:
											// 退出
											choose4 = 0;
											break;

										default:
											System.out.println("输入数字有误，请重新输入！");
											break;
										}
									} while (choose4 != 0);
									break;
								case 3:
									// 取出货物
									int choose5 = 0;// 取出货物菜单控制
									do {
										System.out.println("-----------------货物取出-------------------");
										System.out.println("请选择仓库种类：");
										System.out.println("1.原料仓库");
										System.out.println("2.冷藏仓库");
										System.out.println("3.恒温仓库");
										System.out.println("4.产品仓库");
										System.out.println("0.退出");
										choose5 = input.nextInt();
										switch (choose5) {
										case 1:
											// 原料仓库取出
											System.out.println("--------原料仓库取出-------");
											System.out.print("请输入要取出的货物编号：");
											int num = input.nextInt();

											// boolean result = warehouse.RMInput(flag, RMName, Address, Manufacturer);
											// if (result) {
											// System.out.println("货物取出成功!");
											// } else {
											// System.out.println("货物取出失败!");
											// }
											break;
										case 2:
											// 冷藏仓库存入
											break;
										case 3:
											// 恒温仓库存入
											break;
										case 4:
											// 产品仓库存入
											break;
										case 0:
											// 退出
											choose5 = 0;
											break;

										default:
											System.out.println("输入数字有误，请重新输入！");
											break;
										}
									} while (choose5 != 0);

									break;
								case 4:
									// 修改货物信息
									break;
								case 5:
									// 查询货物信息
									break;
								case 0:
									// 退出系统
									choose3 = 0;
									break;

								default:
									System.out.println("输入数字有误，请重新输入！");
									break;
								}
							} while (choose3 != 0);
						}
						break;
					case 0:
						choose2 = 0;
						break;
					default:
						System.out.println("输入数字有误，请重新输入！");
						break;
					}
				} while (choose2 != 0);
				break;
			case 0:
				choose = 0;
				System.out.println("程序结束，谢谢使用！");
				break;
			default:
				System.out.println("输入数字有误，请重新输入！");
				break;
			}
		} while (choose != 0);
	}
	

}
