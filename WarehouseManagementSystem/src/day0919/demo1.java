package day0919;

import java.util.Scanner;

public class demo1 {

	public static void main(String[] args) {
		// ���ݶ���
		final int adminNum = 5;// ����Ա����
		final int userNum = 10;// �û�����
		final int goodsNum = 20;// ��������
		String[] adminAccount = new String[adminNum];// ����Ա�˺�
		String[] adminPassword = new String[adminNum];// ����Ա����
		String[] adminName = new String[adminNum];//����Ա����
		String[] userAccount = new String[userNum];// �û��˺�
		String[] userPassword = new String[userNum];// �û�����
		String[] userName = new String[userNum];// �û�����

		// ��������
		String[][] goodsName = new String[userNum][goodsNum];// ��������
		String[][] goodsType = new String[userNum][goodsNum];// ��������
		String[][] goodsTime = new String[userNum][goodsNum];// �������ʱ��
		String[][] goodsPosition = new String[userNum][goodsNum];// �������λ��
		double[][] goodsPrice = new double[userNum][goodsNum];// ����۸�
		double[][] goodsWeight = new double[userNum][goodsNum];// ��������

		// ��Ա��Ϣ��ʼ��
		adminAccount[0] = "qwe123";
		adminPassword[0] = "12345";
		adminName[0] = "����Ա";
		userAccount[0] = "123";
		userPassword[0] = "456";
		userName[0] = "����";
		userAccount[1] = "qwe";
		userPassword[1] = "rty";
		userName[1] = "����";

		// ������Ϣ��ʼ��
		goodsName[0][0] = "���ӻ�";
		goodsType[0][0] = "���õ���";
		goodsTime[0][0] = "2019-08-01";
		goodsPosition[0][0] = "��1�ֿ⣬��1���ܣ�1��";
		goodsPrice[0][0] = 2000;
		goodsWeight[0][0] = 20;

		goodsName[0][1] = "���";
		goodsType[0][1] = "�Ҿ�";
		goodsTime[0][1] = "2019-08-20";
		goodsPosition[0][1] = "��2�ֿ⣬��5���ܣ�12��";
		goodsPrice[0][1] = 500;
		goodsWeight[0][1] = 200;

		goodsName[0][2] = "ƻ��";
		goodsType[0][2] = "ʳƷ";
		goodsTime[0][2] = "2019-09-01";
		goodsPosition[0][2] = "��3�ֿ⣬��2���ܣ�5��";
		goodsPrice[0][2] = 100;
		goodsWeight[0][2] = 10;

		goodsName[0][3] = "���̻�";
		goodsType[0][3] = "������Ʒ";
		goodsTime[0][3] = "2019-10-01";
		goodsPosition[0][3] = "��4�ֿ⣬��1���ܣ�2��";
		goodsPrice[0][3] = 1000;
		goodsWeight[0][3] = 100;
		
		goodsName[1][0] = "����";
		goodsType[1][0] = "���Ӳ�Ʒ";
		goodsTime[1][0] = "2019-06-01";
		goodsPosition[1][0] = "��1�ֿ⣬��2���ܣ�1��";
		goodsPrice[1][0] = 5000;
		goodsWeight[1][0] = 30;

		goodsName[1][1] = "Ҭ��";
		goodsType[1][1] = "ʳƷ";
		goodsTime[1][1] = "2019-09-20";
		goodsPosition[1][1] = "��3�ֿ⣬��1���ܣ�2��";
		goodsPrice[1][1] = 400;
		goodsWeight[1][1] = 50;

		goodsName[1][2] = "¯��";
		goodsType[1][2] = "������Ʒ";
		goodsTime[1][2] = "2019-06-01";
		goodsPosition[1][2] = "��4�ֿ⣬��21���ܣ�52��";
		goodsPrice[1][2] = 1000;
		goodsWeight[1][2] = 30;

		goodsName[1][3] = "ϴ�»�";
		goodsType[1][3] = "���õ���";
		goodsTime[1][3] = "2019-02-01";
		goodsPosition[1][3] = "��1�ֿ⣬��3���ܣ�12��";
		goodsPrice[1][3] = 1500;
		goodsWeight[1][3] = 80;

		// ����ʵ��
		Scanner input = new Scanner(System.in);
		int choose = 0;
		do {
			System.out.println("------��ӭʹ�òֿ����ϵͳ------");
			System.out.println("1.����Ա���");
			System.out.println("2.�û����");
			System.out.println("0.�˳�ϵͳ");
			choose = input.nextInt();
			switch (choose) {
			case 1:
				// ����Ա����
				int choose1_1=0;
				int flag1=-1;
				do {
					System.out.println("---------����Ա��¼---------");
						// ����Ա��¼
						flag1 = -1;
						System.out.print("�������˺ţ�");
						String account = input.next();
						System.out.print("���������룺");
						String password = input.next();
						for (int i = 0; i < adminNum - 1; i++) {
							if (account.equals(adminAccount[i]) && password.equals(adminPassword[i])) {
								flag1 = i;
								break;
							}
						}
						if (flag1 == -1) {
							System.out.println("�û�������!������ѡ��");

						} else {
							System.out.println("��¼�ɹ���");
							System.out.println("��ӭ" + adminName[flag1] + "ʹ�òֿ����ϵͳ");
							
							int choose1_2 = 0;
							do {
								System.out.println("---------�ֿ����---------");
								System.out.println("1.�������");
								System.out.println("2.�û�����");
								System.out.println("0.�˳�");
								
								choose1_2 = input.nextInt();
										switch (choose1_2) {
										case 1:
											//�������
											System.out.println("-----�������-----");
											
											for(int i=0;i<userName.length;i++){
												if (userName[i]!=null) {
													System.out.println("�û�"+userName[i]+"�Ĳֿ�");
													
													System.out.println("���\t��������\t��������\t�������ʱ��\t�������λ��\t����۸�\t��������");
													for (int j = 0; j < goodsName[i].length; j++) {
														if (goodsName[i][j]!= null) {
															System.out.println((j+1)+"\t"+goodsName[i][j] + "\t" + goodsType[i][j] + "\t"
																	+ goodsTime[i][j] + "\t" + goodsPosition[i][j] + "\t"
																	+ goodsPrice[i][j] + "Ԫ\t" + goodsWeight[i][j] + "kg");
														}
													}
													System.out.println();
												}
											}
											break;
                                        case 2:
											//�û�����
                                        	System.out.println("-----�û�����-----");
                                        	for(int i=0;i<userName.length;i++) {
                                        		if (userName[i]!=null) {
													System.out.println("�û�"+(i+1)+":\t"+userName[i]);
													System.out.println("�˺ţ�\t"+userAccount[i]);
													System.out.println("���룺\t"+userPassword[i]);
													System.out.println();
													
                                        		}
                                        	}
											break;
										case 0:
											//�˳�ϵͳ
											choose1_2 = 0;
											break;
										default:
											System.out.println("���������������������룡");
											break;
										}
							} while (choose1_2!=0);
							}

				} while (choose1_1!=0);
				
				break;
			case 2:
				// �û�����
				int choose2_1 = 0;
				int flag = -1;
				do {
					System.out.println("-------�û����-------");
					System.out.println("1.�û���¼");
					System.out.println("2.�û�ע��");
					System.out.println("0.�˳�ϵͳ");
					choose2_1 = input.nextInt();
					switch (choose2_1) {
					case 1:
						// �û���¼
						flag = -1;
						System.out.print("�������˺ţ�");
						String account = input.next();
						System.out.print("���������룺");
						String password = input.next();
						for (int i = 0; i < userNum - 1; i++) {
							if (account.equals(userAccount[i]) && password.equals(userPassword[i])) {
								flag = i;
								break;
							}
						}
						if (flag == -1) {
							System.out.println("�û�������!������ѡ��");

						} else {
							System.out.println("��¼�ɹ���");
							System.out.println("��ӭ" + userName[flag] + "ʹ�òֿ����ϵͳ");
							int choose2_2 = 0;
							do {
								System.out.println("---------�ֿ����---------");
								System.out.println("1.�鿴�����嵥");
								System.out.println("2.�������");
								System.out.println("3.ȡ������");
								System.out.println("4.�޸Ļ�����Ϣ");
								System.out.println("5.��ѯ������Ϣ");
								System.out.println("0.�˳�ϵͳ");
								choose2_2 = input.nextInt();
								switch (choose2_2) {
								case 1:
									//�鿴�����嵥
									System.out.println("���\t��������\t��������\t�������ʱ��\t�������λ��\t����۸�\t��������");
									//System.out.println("���\t��������\t��������\t�������ʱ��\t�������λ��\t����۸�\t��������");
									for (int i = 0; i < goodsName[flag].length; i++) {
										if (goodsName[flag][i] != null) {
									System.out.println((i+1)+"\t"+goodsName[flag][i] + "\t" + goodsType[flag][i] + "\t"
									+ goodsTime[flag][i] + "\t" + goodsPosition[flag][i] + "\t"
													+ goodsPrice[flag][i] + "Ԫ\t" + goodsWeight[flag][i] + "kg");
											//System.out.printf("%-10d %-10s %-10s %-10s %-10s %-10.2f %-10.2f\n",(i+1),goodsName[flag][i],goodsType[flag][i] , goodsTime[flag][i], goodsPosition[flag][i], goodsPrice[flag][i] , goodsWeight[flag][i]);
										}
									}
									break;
								case 2:
									//�������
									System.out.println("-----�������-----");
									int flagSave=0;
									do {
										flagSave=0;
										System.out.print("�������ƣ�");
										String goodsnameNew = input.next();
										System.out.print("�������ͣ�");
										String goodstypeNew = input.next();
										System.out.print("�������ʱ�䣺");
										String goodstimeNew = input.next();
										System.out.print("�������λ�ã�");
										String goodspositionNew = input.next();
										System.out.print("����۸�");
										double goodspriceNew = input.nextDouble();
										System.out.print("����������");
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
												System.out.println("���������ɣ�");
												System.out.println("�Ƿ����������");
												System.out.println("1.��");
												System.out.println("2.��");
												flagSave =input.nextInt();
												if(flagSave!=1) {
													flagSave=-1;
												}
												break;
											}
										}
										if (flagSave==0) {
											System.out.println("�ֿ��������������ʧ�ܣ�");
											break;
										}
									} while (flagSave!=0&&flagSave!=-1);
									break;
								case 3:
									//ȡ������
									int flagTake=0;
									int arrayNum=-1;
									System.out.println("-----ȡ������-----");
									System.out.println("���\t��������\t��������\t�������ʱ��\t�������λ��\t����۸�\t��������");
									for (int i = 0; i < goodsName[flag].length; i++) {
										if (goodsName[flag][i] != null) {
											System.out.println((i+1)+"\t"+goodsName[flag][i] + "\t" + goodsType[flag][i] + "\t"
													+ goodsTime[flag][i] + "\t" + goodsPosition[flag][i] + "\t"
													+ goodsPrice[flag][i] + "Ԫ\t" + goodsWeight[flag][i] + "kg");
										}
									}
									do {
										System.out.print("��ѡ��Ҫȡ���������ţ�");
										int num=input.nextInt();
										//�ҵ���Ҫȡ���Ļ���arrayNum
										for (int i = 0; i < goodsName[flag].length; i++) {
											if (i==(num-1)&&goodsName[flag][i]!=null) {
												arrayNum=i;
												break;
											}
										}
										if (arrayNum!=-1) {
						
										//������arrayNum�ź�����ǰ��
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
										System.out.println("ȡ������ɹ���");
										System.out.println("�Ƿ���Ҫ����ȡ����");
										System.out.println("1.����ȡ��");
										System.out.println("0.�˳�");
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
											
											System.out.println("��Ҫȡ���Ļ��ﲻ���ڣ�");
											System.out.println("1.����ѡ��");
											System.out.println("0.�˳�");
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
									//�޸Ļ�����Ϣ
									System.out.println("-----�޸Ļ�����Ϣ-----");
									System.out.println("���\t��������\t��������\t�������ʱ��\t�������λ��\t����۸�\t��������");
									for (int i = 0; i < goodsName[flag].length; i++) {
										if (goodsName[flag][i] != null) {
											System.out.println((i+1)+"\t"+goodsName[flag][i] + "\t" + goodsType[flag][i] + "\t"
													+ goodsTime[flag][i] + "\t" + goodsPosition[flag][i] + "\t"
													+ goodsPrice[flag][i] + "Ԫ\t" + goodsWeight[flag][i] + "kg");
										}
									}
									System.out.println("��ѡ����Ҫ�޸ĵĻ������");
									int chooseNum = input.nextInt();
									System.out.println("��ѡ��Ҫ�޸ĵ�����");
									System.out.println("1.��������");
									System.out.println("2.��������");
									System.out.println("3.�������ʱ��");
									System.out.println("4.�������λ��");
									System.out.println("5.����۸�");
									System.out.println("6.��������");
									int fixNum = input.nextInt();
									if (fixNum==1) {
										System.out.print("�����룺");
										String goodName = input.next();
										goodsName[flag][chooseNum-1]=goodName;
										System.out.println("�޸ĳɹ���");
									}
									if (fixNum==2) {
										System.out.print("�����룺");
										String goodType = input.next();
										goodsType[flag][chooseNum-1]=goodType;
										System.out.println("�޸ĳɹ���");
									}
									if (fixNum==3) {
										System.out.print("�����룺");
										String goodTime = input.next();
										goodsTime[flag][chooseNum-1]=goodTime;
										System.out.println("�޸ĳɹ���");
									}
									if (fixNum==4) {
										System.out.print("�����룺");
										String goodPosition = input.next();
										goodsPosition[flag][chooseNum-1]=goodPosition;
										System.out.println("�޸ĳɹ���");
									}
									if (fixNum==5) {
										System.out.print("�����룺");
										double goodPrice = input.nextDouble();
										goodsPrice[flag][chooseNum-1]=goodPrice;
										System.out.println("�޸ĳɹ���");
									}
									if (fixNum==6) {
										System.out.print("�����룺");
										double goodWeight = input.nextDouble();
										goodsWeight[flag][chooseNum-1]=goodWeight;
										System.out.println("�޸ĳɹ���");
									}
									
									break;
								case 5:
									//��ѯ������Ϣ
									System.out.println("-----��ѯ������Ϣ-----");
									System.out.println("��ѡ��Ҫ��ѯ������");
									System.out.println("1.��������");
									System.out.println("2.��������");
									System.out.println("3.�������ʱ��");
									System.out.println("4.�������λ��");
									System.out.println("5.����۸�");
									System.out.println("6.��������");
									int findNum = input.nextInt();
									boolean f=false;
									if (findNum==1) {
										System.out.print("�����룺");
										String goodName = input.next();
										System.out.println("���\t��������\t��������\t�������ʱ��\t�������λ��\t����۸�\t��������");
										for (int i = 0; i < goodsName[flag].length; i++) {
											f=goodsName[flag][i].contains(goodName);
											if (f) {
													System.out.println((i+1)+"\t"+goodsName[flag][i] + "\t" + goodsType[flag][i] + "\t"
														+ goodsTime[flag][i] + "\t" + goodsPosition[flag][i] + "\t"
														+ goodsPrice[flag][i] + "Ԫ\t" + goodsWeight[flag][i] + "kg");
													f=false;
											}
										
										}
										if (!f) {
											System.out.println("���ҽ�����");
										}
									}
									if (findNum==2) {System.out.print("�����룺");
									String goodType = input.next();
									System.out.println("���\t��������\t��������\t�������ʱ��\t�������λ��\t����۸�\t��������");
									for (int i = 0; i < goodsName[flag].length; i++) {
										f=goodsType[flag][i].contains(goodType);
										if (f) {
												System.out.println((i+1)+"\t"+goodsName[flag][i] + "\t" + goodsType[flag][i] + "\t"
													+ goodsTime[flag][i] + "\t" + goodsPosition[flag][i] + "\t"
													+ goodsPrice[flag][i] + "Ԫ\t" + goodsWeight[flag][i] + "kg");
												f=false;
										}
									
									}
									if (!f) {
										System.out.println("���ҽ�����");
									}}
									if (findNum==3) {System.out.print("�����룺");
									String goodTime = input.next();
									System.out.println("���\t��������\t��������\t�������ʱ��\t�������λ��\t����۸�\t��������");
									for (int i = 0; i < goodsName[flag].length; i++) {
										f=goodsTime[flag][i].contains(goodTime);
										if (f) {
												System.out.println((i+1)+"\t"+goodsName[flag][i] + "\t" + goodsType[flag][i] + "\t"
													+ goodsTime[flag][i] + "\t" + goodsPosition[flag][i] + "\t"
													+ goodsPrice[flag][i] + "Ԫ\t" + goodsWeight[flag][i] + "kg");
												f=false;
										}
									
									}
									if (!f) {
										System.out.println("���ҽ�����");
									}}
									if (findNum==4) {System.out.print("�����룺");
									String goodPosition = input.next();
									System.out.println("���\t��������\t��������\t�������ʱ��\t�������λ��\t����۸�\t��������");
									for (int i = 0; i < goodsName[flag].length; i++) {
										f=goodsPosition[flag][i].contains(goodPosition);
										if (f) {
												System.out.println((i+1)+"\t"+goodsName[flag][i] + "\t" + goodsType[flag][i] + "\t"
													+ goodsTime[flag][i] + "\t" + goodsPosition[flag][i] + "\t"
													+ goodsPrice[flag][i] + "Ԫ\t" + goodsWeight[flag][i] + "kg");
												f=false;
										}
									
									}
									if (!f) {
										System.out.println("���ҽ�����");
									}
									}
									
									break;
								case 0:
									//�˳�ϵͳ
									choose2_2 = 0;
									break;
								default:
									System.out.println("���������������������룡");
									break;
								}
							} while (choose2_2 != 0);

						}

						break;
					case 2:
						//�û�ע��
						System.out.println("-----���û�ע��-----");
						System.out.print("�������˺ţ�");
						String accountNew = input.next();
						int flagAccount = 0;
						int flagPassword = 0;
						do {
							flagAccount = 0;
							for (int i = 0; i < userNum - 1; i++) {
								if (accountNew.equals(userAccount[i])) {
								System.out.println("�˺��Ѵ��ڣ����������룡");
								accountNew = input.next();
								flagAccount = -1;
								break;
								}
							}
						} while (flagAccount != 0);
						do {
							flagPassword = 0;
							System.out.print("���������룺");
							String passwordNew = input.next();
							System.out.print("��������һ�����룺");
							String passwordNew2 = input.next();
							if (passwordNew.equals(passwordNew2)) {
								System.out.print("�������û�����");
								String usernameNew = input.next();
								for (int i = 0; i < userName.length-1; i++) {
									if (userName[i] == null) {
										userName[i] = usernameNew;
										userAccount[i] = accountNew;
										userPassword[i] = passwordNew;
										break;
									}	
								}
								System.out.println("�½��û��ɹ���\n");
							}else {
								flagPassword = -1;
								System.out.println("������������벻ͬ�����������룡");
							}
						} while (flagPassword!=0);
						break;
					case 0:
						choose2_1 = 0;
						break;
					default:
						System.out.println("���������������������룡");
						break;
					}
				} while (choose2_1 != 0);
				break;
			case 0:
				choose = 0;
				break;
			default:
				System.out.println("���������������������룡");
				break;
			}
		} while (choose != 0);
		System.out.println("���˳���ллʹ�ã�");
	}
}
