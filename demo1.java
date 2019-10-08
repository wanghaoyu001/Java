package day0919;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// 数据定义
		final int adminNum = 5;// 管理员数量
		final int userNum = 10;// 用户数量
		final int goodsNum = 20;// 货物数量
		String[] adminAccount = new String[adminNum];// 管理员账号
		String[] adminPassword = new String[adminNum];// 管理员密码
		String[] adminName = new String[adminNum];//管理员名称
		String[] userAccount = new String[userNum];// 用户账号
		String[] userPassword = new String[userNum];// 用户密码
		String[] userName = new String[userNum];// 用户名称

		// 货物属性
		String[][] goodsName = new String[userNum][goodsNum];// 货物名称
		String[][] goodsType = new String[userNum][goodsNum];// 货物类型
		String[][] goodsTime = new String[userNum][goodsNum];// 货物存入时间
		String[][] goodsPosition = new String[userNum][goodsNum];// 货物存入位置
		double[][] goodsPrice = new double[userNum][goodsNum];// 货物价格
		double[][] goodsWeight = new double[userNum][goodsNum];// 货物重量

		// 人员信息初始化
		adminAccount[0] = "qwe123";
		adminPassword[0] = "12345";
		adminName[0] = "管理员";
		userAccount[0] = "123";
		userPassword[0] = "456";
		userName[0] = "张三";
		userAccount[1] = "qwe";
		userPassword[1] = "rty";
		userName[1] = "李四";

		// 货物信息初始化
		goodsName[0][0] = "电视机";
		goodsType[0][0] = "家用电器";
		goodsTime[0][0] = "2019-08-01";
		goodsPosition[0][0] = "第1仓库，第1货架，1号";
		goodsPrice[0][0] = 2000;
		goodsWeight[0][0] = 20;

		goodsName[0][1] = "书柜";
		goodsType[0][1] = "家具";
		goodsTime[0][1] = "2019-08-20";
		goodsPosition[0][1] = "第2仓库，第5货架，12号";
		goodsPrice[0][1] = 500;
		goodsWeight[0][1] = 200;

		goodsName[0][2] = "苹果";
		goodsType[0][2] = "食品";
		goodsTime[0][2] = "2019-09-01";
		goodsPosition[0][2] = "第3仓库，第2货架，5号";
		goodsPrice[0][2] = 100;
		goodsWeight[0][2] = 10;

		goodsName[0][3] = "油烟机";
		goodsType[0][3] = "厨房用品";
		goodsTime[0][3] = "2019-10-01";
		goodsPosition[0][3] = "第4仓库，第1货架，2号";
		goodsPrice[0][3] = 1000;
		goodsWeight[0][3] = 100;
		
		goodsName[1][0] = "电脑";
		goodsType[1][0] = "电子产品";
		goodsTime[1][0] = "2019-06-01";
		goodsPosition[1][0] = "第1仓库，第2货架，1号";
		goodsPrice[1][0] = 5000;
		goodsWeight[1][0] = 30;

		goodsName[1][1] = "椰子";
		goodsType[1][1] = "食品";
		goodsTime[1][1] = "2019-09-20";
		goodsPosition[1][1] = "第3仓库，第1货架，2号";
		goodsPrice[1][1] = 400;
		goodsWeight[1][1] = 50;

		goodsName[1][2] = "炉子";
		goodsType[1][2] = "厨房用品";
		goodsTime[1][2] = "2019-06-01";
		goodsPosition[1][2] = "第4仓库，第21货架，52号";
		goodsPrice[1][2] = 1000;
		goodsWeight[1][2] = 30;

		goodsName[1][3] = "洗衣机";
		goodsType[1][3] = "家用电器";
		goodsTime[1][3] = "2019-02-01";
		goodsPosition[1][3] = "第1仓库，第3货架，12号";
		goodsPrice[1][3] = 1500;
		goodsWeight[1][3] = 80;

		// 功能实现
		Scanner input = new Scanner(System.in);
		int choose = 0;
		do {
			System.out.println("------欢迎使用仓库管理系统------");
			System.out.println("1.管理员入口");
			System.out.println("2.用户入口");
			System.out.println("0.退出系统");
			choose = input.nextInt();
			switch (choose) {
			case 1:
				// 管理员操作
				int choose1_1=0;
				int flag1=-1;
				do {
					System.out.println("---------管理员登录---------");
						// 管理员登录
						flag1 = -1;
						System.out.print("请输入账号：");
						String account = input.next();
						System.out.print("请输入密码：");
						String password = input.next();
						for (int i = 0; i < adminNum - 1; i++) {
							if (account.equals(adminAccount[i]) && password.equals(adminPassword[i])) {
								flag1 = i;
								break;
							}
						}
						if (flag1 == -1) {
							System.out.println("用户不存在!请重新选择！");

						} else {
							System.out.println("登录成功！");
							System.out.println("欢迎" + adminName[flag1] + "使用仓库管理系统");
							
							int choose1_2 = 0;
							do {
								System.out.println("---------仓库管理---------");
								System.out.println("1.货物管理");
								System.out.println("2.用户管理");
								System.out.println("0.退出");
								
								choose1_2 = input.nextInt();
										switch (choose1_2) {
										case 1:
											//货物管理
											System.out.println("-----货物管理-----");
											
											for(int i=0;i<userName.length;i++){
												if (userName[i]!=null) {
													System.out.println("用户"+userName[i]+"的仓库");
													
													System.out.println("序号\t货物名称\t货物类型\t货物存入时间\t货物存入位置\t货物价格\t货物重量");
													for (int j = 0; j < goodsName[i].length; j++) {
														if (goodsName[i][j]!= null) {
															System.out.println((j+1)+"\t"+goodsName[i][j] + "\t" + goodsType[i][j] + "\t"
																	+ goodsTime[i][j] + "\t" + goodsPosition[i][j] + "\t"
																	+ goodsPrice[i][j] + "元\t" + goodsWeight[i][j] + "kg");
														}
													}
													System.out.println();
												}
											}
											break;
                                        case 2:
											//用户管理
                                        	System.out.println("-----用户管理-----");
                                        	for(int i=0;i<userName.length;i++) {
                                        		if (userName[i]!=null) {
													System.out.println("用户"+(i+1)+":\t"+userName[i]);
													System.out.println("账号：\t"+userAccount[i]);
													System.out.println("密码：\t"+userPassword[i]);
													System.out.println();
													
                                        		}
                                        	}
											break;
										case 0:
											//退出系统
											choose1_2 = 0;
											break;
										default:
											System.out.println("输入数字有误，请重新输入！");
											break;
										}
							} while (choose1_2!=0);
							}

				} while (choose1_1!=0);
				
				break;
			case 2:
				// 用户操作
				int choose2_1 = 0;
				int flag = -1;
				do {
					System.out.println("-------用户入口-------");
					System.out.println("1.用户登录");
					System.out.println("2.用户注册");
					System.out.println("0.退出系统");
					choose2_1 = input.nextInt();
					switch (choose2_1) {
					case 1:
						// 用户登录
						flag = -1;
						System.out.print("请输入账号：");
						String account = input.next();
						System.out.print("请输入密码：");
						String password = input.next();
						for (int i = 0; i < userNum - 1; i++) {
							if (account.equals(userAccount[i]) && password.equals(userPassword[i])) {
								flag = i;
								break;
							}
						}
						if (flag == -1) {
							System.out.println("用户不存在!请重新选择！");

						} else {
							System.out.println("登录成功！");
							System.out.println("欢迎" + userName[flag] + "使用仓库管理系统");
							int choose2_2 = 0;
							do {
								System.out.println("---------仓库管理---------");
								System.out.println("1.查看货物清单");
								System.out.println("2.存入货物");
								System.out.println("3.取出货物");
								System.out.println("4.修改货物信息");
								System.out.println("5.查询货物信息");
								System.out.println("0.退出系统");
								choose2_2 = input.nextInt();
								switch (choose2_2) {
								case 1:
									//查看货物清单
									System.out.println("序号\t货物名称\t货物类型\t货物存入时间\t货物存入位置\t货物价格\t货物重量");
									//System.out.println("序号\t货物名称\t货物类型\t货物存入时间\t货物存入位置\t货物价格\t货物重量");
									for (int i = 0; i < goodsName[flag].length; i++) {
										if (goodsName[flag][i] != null) {
									System.out.println((i+1)+"\t"+goodsName[flag][i] + "\t" + goodsType[flag][i] + "\t"
									+ goodsTime[flag][i] + "\t" + goodsPosition[flag][i] + "\t"
													+ goodsPrice[flag][i] + "元\t" + goodsWeight[flag][i] + "kg");
											//System.out.printf("%-10d %-10s %-10s %-10s %-10s %-10.2f %-10.2f\n",(i+1),goodsName[flag][i],goodsType[flag][i] , goodsTime[flag][i], goodsPosition[flag][i], goodsPrice[flag][i] , goodsWeight[flag][i]);
										}
									}
									break;
								case 2:
									//存入货物
									System.out.println("-----存入货物-----");
									int flagSave=0;
									do {
										flagSave=0;
										System.out.print("货物名称：");
										String goodsnameNew = input.next();
										System.out.print("货物类型：");
										String goodstypeNew = input.next();
										System.out.print("货物存入时间：");
										String goodstimeNew = input.next();
										System.out.print("货物存入位置：");
										String goodspositionNew = input.next();
										System.out.print("货物价格：");
										double goodspriceNew = input.nextDouble();
										System.out.print("货物重量：");
										double goodsweightNew = input.nextDouble();
										for (int i = 0; i < goodsName[flag].length; i++) {
											if (goodsName[flag][i]==null) {
												goodsName[flag][i]=goodsnameNew;
												goodsType[flag][i]=goodstypeNew;
												goodsTime[flag][i]=goodstimeNew;
												goodsPosition[flag][i]=goodspositionNew;
												goodsPrice[flag][i]=goodspriceNew;
												goodsWeight[flag][i]=goodsweightNew;
												System.out.println("");
												System.out.println("存入货物完成！");
												System.out.println("是否继续存入货物？");
												System.out.println("1.是");
												System.out.println("2.否");
												flagSave =input.nextInt();
												if(flagSave!=1) {
													flagSave=-1;
												}
												break;
											}
										}
										if (flagSave==0) {
											System.out.println("仓库已满，存入货物失败！");
											break;
										}
									} while (flagSave!=0&&flagSave!=-1);
									break;
								case 3:
									//取出货物
									int flagTake=0;
									int arrayNum=-1;
									System.out.println("-----取出货物-----");
									System.out.println("序号\t货物名称\t货物类型\t货物存入时间\t货物存入位置\t货物价格\t货物重量");
									for (int i = 0; i < goodsName[flag].length; i++) {
										if (goodsName[flag][i] != null) {
											System.out.println((i+1)+"\t"+goodsName[flag][i] + "\t" + goodsType[flag][i] + "\t"
													+ goodsTime[flag][i] + "\t" + goodsPosition[flag][i] + "\t"
													+ goodsPrice[flag][i] + "元\t" + goodsWeight[flag][i] + "kg");
										}
									}
									do {
										System.out.print("请选择要取出货物的序号：");
										int num=input.nextInt();
										//找到需要取出的货号arrayNum
										for (int i = 0; i < goodsName[flag].length; i++) {
											if (i==(num-1)&&goodsName[flag][i]!=null) {
												arrayNum=i;
												break;
											}
										}
										if (arrayNum!=-1) {
						
										//将数组arrayNum号后数组前移
										for (int i = arrayNum; i < goodsName[flag].length-1; i++) {
										
											goodsName[flag][i]=goodsName[flag][i+1];
											goodsType[flag][i]=goodsType[flag][i+1];
											goodsTime[flag][i]=goodsTime[flag][i+1];
											goodsPosition[flag][i]=goodsPosition[flag][i+1];
											goodsPrice[flag][i]=goodsPrice[flag][i+1];
											goodsWeight[flag][i]=goodsWeight[flag][i+1];
											
											
										}
										goodsName[flag][goodsName[flag].length-1]=null;
										goodsType[flag][goodsName[flag].length-1]=null;
										goodsTime[flag][goodsName[flag].length-1]=null;
										goodsPosition[flag][goodsName[flag].length-1]=null;
										goodsPrice[flag][goodsName[flag].length-1]=0;
										goodsWeight[flag][goodsName[flag].length-1]=0;
										System.out.println("取出货物成功！");
										System.out.println("是否需要继续取货？");
										System.out.println("1.继续取货");
										System.out.println("0.退出");
										int choose1=input.nextInt();
										switch (choose1) {
										case 1:
											flagTake=1;
											break;
                                        case 0:
                                        	flagTake=0;
											break;
										default:
											break;
										}
										}
										if (arrayNum==-1) {
											
											System.out.println("您要取出的货物不存在！");
											System.out.println("1.重新选择");
											System.out.println("0.退出");
											int choose2=input.nextInt();
											switch (choose2) {
											case 1:
												flagTake=1;
												break;
	                                        case 0:
	                                        	flagTake=0;
												break;
											default:
												break;
											}
										}
									} while (flagTake!=0);
									
									break;
								case 4:
									//修改货物信息
									System.out.println("-----修改货物信息-----");
									System.out.println("序号\t货物名称\t货物类型\t货物存入时间\t货物存入位置\t货物价格\t货物重量");
									for (int i = 0; i < goodsName[flag].length; i++) {
										if (goodsName[flag][i] != null) {
											System.out.println((i+1)+"\t"+goodsName[flag][i] + "\t" + goodsType[flag][i] + "\t"
													+ goodsTime[flag][i] + "\t" + goodsPosition[flag][i] + "\t"
													+ goodsPrice[flag][i] + "元\t" + goodsWeight[flag][i] + "kg");
										}
									}
									System.out.println("请选择需要修改的货物序号");
									int chooseNum = input.nextInt();
									System.out.println("请选择要修改的内容");
									System.out.println("1.货物名称");
									System.out.println("2.货物类型");
									System.out.println("3.货物存入时间");
									System.out.println("4.货物存入位置");
									System.out.println("5.货物价格");
									System.out.println("6.货物重量");
									int fixNum = input.nextInt();
									if (fixNum==1) {
										System.out.print("请输入：");
										String goodName = input.next();
										goodsName[flag][chooseNum-1]=goodName;
										System.out.println("修改成功！");
									}
									if (fixNum==2) {
										System.out.print("请输入：");
										String goodType = input.next();
										goodsType[flag][chooseNum-1]=goodType;
										System.out.println("修改成功！");
									}
									if (fixNum==3) {
										System.out.print("请输入：");
										String goodTime = input.next();
										goodsTime[flag][chooseNum-1]=goodTime;
										System.out.println("修改成功！");
									}
									if (fixNum==4) {
										System.out.print("请输入：");
										String goodPosition = input.next();
										goodsPosition[flag][chooseNum-1]=goodPosition;
										System.out.println("修改成功！");
									}
									if (fixNum==5) {
										System.out.print("请输入：");
										double goodPrice = input.nextDouble();
										goodsPrice[flag][chooseNum-1]=goodPrice;
										System.out.println("修改成功！");
									}
									if (fixNum==6) {
										System.out.print("请输入：");
										double goodWeight = input.nextDouble();
										goodsWeight[flag][chooseNum-1]=goodWeight;
										System.out.println("修改成功！");
									}
									
									break;
								case 5:
									//查询货物信息
									System.out.println("-----查询货物信息-----");
									System.out.println("请选择要查询的内容");
									System.out.println("1.货物名称");
									System.out.println("2.货物类型");
									System.out.println("3.货物存入时间");
									System.out.println("4.货物存入位置");
									System.out.println("5.货物价格");
									System.out.println("6.货物重量");
									int findNum = input.nextInt();
									boolean f=false;
									if (findNum==1) {
										System.out.print("请输入：");
										String goodName = input.next();
										System.out.println("序号\t货物名称\t货物类型\t货物存入时间\t货物存入位置\t货物价格\t货物重量");
										for (int i = 0; i < goodsName[flag].length; i++) {
											f=goodsName[flag][i].contains(goodName);
											if (f) {
													System.out.println((i+1)+"\t"+goodsName[flag][i] + "\t" + goodsType[flag][i] + "\t"
														+ goodsTime[flag][i] + "\t" + goodsPosition[flag][i] + "\t"
														+ goodsPrice[flag][i] + "元\t" + goodsWeight[flag][i] + "kg");
													f=false;
											}
										
										}
										if (!f) {
											System.out.println("查找结束！");
										}
									}
									if (findNum==2) {System.out.print("请输入：");
									String goodType = input.next();
									System.out.println("序号\t货物名称\t货物类型\t货物存入时间\t货物存入位置\t货物价格\t货物重量");
									for (int i = 0; i < goodsName[flag].length; i++) {
										f=goodsType[flag][i].contains(goodType);
										if (f) {
												System.out.println((i+1)+"\t"+goodsName[flag][i] + "\t" + goodsType[flag][i] + "\t"
													+ goodsTime[flag][i] + "\t" + goodsPosition[flag][i] + "\t"
													+ goodsPrice[flag][i] + "元\t" + goodsWeight[flag][i] + "kg");
												f=false;
										}
									
									}
									if (!f) {
										System.out.println("查找结束！");
									}}
									if (findNum==3) {System.out.print("请输入：");
									String goodTime = input.next();
									System.out.println("序号\t货物名称\t货物类型\t货物存入时间\t货物存入位置\t货物价格\t货物重量");
									for (int i = 0; i < goodsName[flag].length; i++) {
										f=goodsTime[flag][i].contains(goodTime);
										if (f) {
												System.out.println((i+1)+"\t"+goodsName[flag][i] + "\t" + goodsType[flag][i] + "\t"
													+ goodsTime[flag][i] + "\t" + goodsPosition[flag][i] + "\t"
													+ goodsPrice[flag][i] + "元\t" + goodsWeight[flag][i] + "kg");
												f=false;
										}
									
									}
									if (!f) {
										System.out.println("查找结束！");
									}}
									if (findNum==4) {System.out.print("请输入：");
									String goodPosition = input.next();
									System.out.println("序号\t货物名称\t货物类型\t货物存入时间\t货物存入位置\t货物价格\t货物重量");
									for (int i = 0; i < goodsName[flag].length; i++) {
										f=goodsPosition[flag][i].contains(goodPosition);
										if (f) {
												System.out.println((i+1)+"\t"+goodsName[flag][i] + "\t" + goodsType[flag][i] + "\t"
													+ goodsTime[flag][i] + "\t" + goodsPosition[flag][i] + "\t"
													+ goodsPrice[flag][i] + "元\t" + goodsWeight[flag][i] + "kg");
												f=false;
										}
									
									}
									if (!f) {
										System.out.println("查找结束！");
									}
									}
									
									break;
								case 0:
									//退出系统
									choose2_2 = 0;
									break;
								default:
									System.out.println("输入数字有误，请重新输入！");
									break;
								}
							} while (choose2_2 != 0);

						}

						break;
					case 2:
						//用户注册
						System.out.println("-----新用户注册-----");
						System.out.print("请输入账号：");
						String accountNew = input.next();
						int flagAccount = 0;
						int flagPassword = 0;
						do {
							flagAccount = 0;
							for (int i = 0; i < userNum - 1; i++) {
								if (accountNew.equals(userAccount[i])) {
								System.out.println("账号已存在！请重新输入！");
								accountNew = input.next();
								flagAccount = -1;
								break;
								}
							}
						} while (flagAccount != 0);
						do {
							flagPassword = 0;
							System.out.print("请输入密码：");
							String passwordNew = input.next();
							System.out.print("请在输入一遍密码：");
							String passwordNew2 = input.next();
							if (passwordNew.equals(passwordNew2)) {
								System.out.print("请输入用户名：");
								String usernameNew = input.next();
								for (int i = 0; i < userName.length-1; i++) {
									if (userName[i] == null) {
										userName[i] = usernameNew;
										userAccount[i] = accountNew;
										userPassword[i] = passwordNew;
										break;
									}	
								}
								System.out.println("新建用户成功！\n");
							}else {
								flagPassword = -1;
								System.out.println("两次输入的密码不同，请重新输入！");
							}
						} while (flagPassword!=0);
						break;
					case 0:
						choose2_1 = 0;
						break;
					default:
						System.out.println("输入数字有误，请重新输入！");
						break;
					}
				} while (choose2_1 != 0);
				break;
			case 0:
				choose = 0;
				break;
			default:
				System.out.println("输入数字有误，请重新输入！");
				break;
			}
		} while (choose != 0);
		System.out.println("已退出，谢谢使用！");
	}
}
