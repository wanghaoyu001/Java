package com.View;

import java.util.Scanner;

import com.Controller.IWarehouseBiz;
import com.Controller.WarehouseBiz;

public class WarehouseAction {

	public static void main(String[] args) {

		IWarehouseBiz warehouse = new WarehouseBiz();
		warehouse.initializationAdmin();// ��ʼ������Ա��Ϣ
		warehouse.initializationUser();// ��ʼ���û���Ϣ
		warehouse.initializationRM();// ��ʼ��ԭ�ϲֿ�
		warehouse.initializationCold();// ��ʼ����زֿ�
		warehouse.initializationConstant();// ��ʼ�����²ֿ�
		warehouse.initializationProduct();// ��ʼ����Ʒ�ֿ�
		warehouse.initializationRMlist();//��ʼ��ԭ�ϲֿ�List
		//test
		warehouse.test();
		Scanner input = new Scanner(System.in);
		int choose = 0;// ��־λ��Ϊ0����ѭ����Ϊ1�˳�ѭ��
		do {
			System.out.println("******��ӭʹ�òֿ����ϵͳ******");
			System.out.println("*  1.����Ա���                               *");
			System.out.println("*  2.�û����                                   *");
			System.out.println("*  0.�˳�ϵͳ                                   *");
			System.out.println("*****************************");
			choose = input.nextInt();
			switch (choose) {
			case 1:
				// ����Ա���
				// flag��־λ������Ա�����±�
				int flag = 0;
				// find��־λ��Ϊfalse��ʾδ�ҵ��ù���Ա��Ϊtrue��ʾ�ҵ��ù���Ա
				boolean find = false;
				do {
					System.out.println("******����Ա��¼******");
					System.out.print("�������˺ţ�");
					String account = input.next();
					System.out.print("���������룺");
					String password = input.next();
					flag = warehouse.adminLog(account, password);// ����Ա��¼

					if (flag == 0) {
						System.out.println("�û�������!�����µ�¼��");
					} else {
						find = true;// �ҵ�����Ա
						// ����Ա����
						System.out.println("��¼�ɹ���");
						System.out.print("��ӭ  *");
						warehouse.adminShow(flag - 1);
						System.out.println("*  ʹ�òֿ����ϵͳ");
						int choose1 = 0;
						do {
							System.out.println("---------�ֿ����---------");
							System.out.println("1.�ֿ����Ԥ��");
							System.out.println("2.�û�����");
							System.out.println("0.�˳�");

							choose1 = input.nextInt();
							switch (choose1) {
							case 1:
								// �������
								System.out.println("-----�������-----");
								// ԭ�ϲֿ����
								System.out.println("-----------------ԭ�ϲֿ�----------------");
								System.out.println("���\t������\t����ʱ��\t\t��������\t\tԭ���ϲ���\tԭ������������");
								warehouse.RMshow();
								// ��زֿ����
								System.out.println("-----------------��زֿ�----------------");
								System.out.println("���\t������\t����ʱ��\t\t��������\t\t�����¶�\t\t������");
								warehouse.ColdOutput();
								// ���²ֿ����
								System.out.println("-----------------���²ֿ�----------------");
								System.out.println("���\t������\t����ʱ��\t\t��������\t\t�����¶�\t\t����");
								warehouse.ConstantOutput();
								// ��Ʒ�ֿ����
								System.out.println("-----------------��Ʒ�ֿ�----------------");
								System.out.println("���\t������\t����ʱ��\t\t��������\t\t����\t\tĿ�ĵ�");
								warehouse.ProductOutput();
								break;
							case 2:
								// �û�����
								System.out.println("-----------------�û�����----------------");
								System.out.println("���\t�û���\t�˺�\t����");
								warehouse.userOutput();
								break;
							case 0:
								// �˳�ϵͳ
								choose1 = 0;
								break;

							default:
								System.out.println("���������������������룡");
								break;
							}
						} while (choose1 != 0);
					}
				} while (!find);
				break;
			case 2:
				// �û����
				int choose2 = 0;// �û������ҳ��ѡ��
				do {
					System.out.println("-------�û����-------");
					System.out.println("1.�û���¼");
					System.out.println("2.�û�ע��");
					System.out.println("0.�˳�ϵͳ");
					choose2 = input.nextInt();
					switch (choose2) {
					case 1:
						// �û���¼
						System.out.println("******�û���¼******");
						System.out.print("�������˺ţ�");
						String account = input.next();
						System.out.print("���������룺");
						String password = input.next();
						flag = warehouse.userLog(account, password);// ����Ա��¼

						if (flag == 0) {
							System.out.println("�û�������!�����µ�¼��");
						} else {
							find = true;// �ҵ��û�
							// �û�����
							System.out.println("��¼�ɹ���");
							System.out.print("��ӭ  *");
							warehouse.userShow(flag - 1);
							System.out.println("*  ʹ�òֿ����ϵͳ");
							int choose3 = 0;// �û��ֿ������ҳ��ѡ��
							do {
								System.out.println("---------�ֿ����---------");
								System.out.println("1.�鿴�����嵥");
								System.out.println("2.�������");
								System.out.println("3.ȡ������");
								System.out.println("4.�޸Ļ�����Ϣ");
								System.out.println("5.��ѯ������Ϣ");
								System.out.println("0.�˳�ϵͳ");
								choose3 = input.nextInt();
								switch (choose3) {
								case 1:
									// �鿴�����嵥
									// ԭ�ϲֿ����
									System.out.println("-----------------ԭ�ϲֿ�----------------");
									System.out.println("���\t������\t����ʱ��\t\t��������\t\tԭ���ϲ���\tԭ������������");
									warehouse.RMshow(flag);
									// ��زֿ����
									System.out.println("-----------------��زֿ�----------------");
									System.out.println("���\t������\t����ʱ��\t\t��������\t\t�����¶�\t\t������");
									warehouse.ColdOutput(flag);
									// ���²ֿ����
									System.out.println("-----------------���²ֿ�----------------");
									System.out.println("���\t������\t����ʱ��\t\t��������\t\t�����¶�\t\t����");
									warehouse.ConstantOutput(flag);
									// ��Ʒ�ֿ����
									System.out.println("-----------------��Ʒ�ֿ�----------------");
									System.out.println("���\t������\t����ʱ��\t\t��������\t\t����\t\tĿ�ĵ�");
									warehouse.ProductOutput(flag);
									break;
								case 2:
									// �������
									int choose4 = 0;// �����ȡѡ��
									do {
										System.out.println("-----------------����¼��-------------------");
										System.out.println("��ѡ��ֿ����ࣺ");
										System.out.println("1.ԭ�ϲֿ�");
										System.out.println("2.��زֿ�");
										System.out.println("3.���²ֿ�");
										System.out.println("4.��Ʒ�ֿ�");
										System.out.println("0.�˳�");
										choose4 = input.nextInt();
										switch (choose4) {
										case 1:
											// ԭ�ϲֿ����
											System.out.println("--------ԭ�ϲֿ�¼��-------");
											System.out.print("�������Ʒ���ƣ�");
											String RMName = input.next();
											System.out.print("�������Ʒ���أ�");
											String Address = input.next();
											System.out.print("�������Ʒ�������ң�");
											String Manufacturer = input.next();
											boolean result = warehouse.RMInput(flag, RMName, Address, Manufacturer);
											if (result) {
												System.out.println("������Ϣ¼��ɹ�!");
											} else {
												System.out.println("������Ϣ¼��ʧ��!");
											}
											break;
										case 2:
											// ��زֿ����
											break;
										case 3:
											// ���²ֿ����
											break;
										case 4:
											// ��Ʒ�ֿ����
											break;
										case 0:
											// �˳�
											choose4 = 0;
											break;

										default:
											System.out.println("���������������������룡");
											break;
										}
									} while (choose4 != 0);
									break;
								case 3:
									// ȡ������
									int choose5 = 0;// ȡ������˵�����
									do {
										System.out.println("-----------------����ȡ��-------------------");
										System.out.println("��ѡ��ֿ����ࣺ");
										System.out.println("1.ԭ�ϲֿ�");
										System.out.println("2.��زֿ�");
										System.out.println("3.���²ֿ�");
										System.out.println("4.��Ʒ�ֿ�");
										System.out.println("0.�˳�");
										choose5 = input.nextInt();
										switch (choose5) {
										case 1:
											// ԭ�ϲֿ�ȡ��
											System.out.println("--------ԭ�ϲֿ�ȡ��-------");
											System.out.print("������Ҫȡ���Ļ����ţ�");
											int num = input.nextInt();

											// boolean result = warehouse.RMInput(flag, RMName, Address, Manufacturer);
											// if (result) {
											// System.out.println("����ȡ���ɹ�!");
											// } else {
											// System.out.println("����ȡ��ʧ��!");
											// }
											break;
										case 2:
											// ��زֿ����
											break;
										case 3:
											// ���²ֿ����
											break;
										case 4:
											// ��Ʒ�ֿ����
											break;
										case 0:
											// �˳�
											choose5 = 0;
											break;

										default:
											System.out.println("���������������������룡");
											break;
										}
									} while (choose5 != 0);

									break;
								case 4:
									// �޸Ļ�����Ϣ
									break;
								case 5:
									// ��ѯ������Ϣ
									break;
								case 0:
									// �˳�ϵͳ
									choose3 = 0;
									break;

								default:
									System.out.println("���������������������룡");
									break;
								}
							} while (choose3 != 0);
						}
						break;
					case 0:
						choose2 = 0;
						break;
					default:
						System.out.println("���������������������룡");
						break;
					}
				} while (choose2 != 0);
				break;
			case 0:
				choose = 0;
				System.out.println("���������ллʹ�ã�");
				break;
			default:
				System.out.println("���������������������룡");
				break;
			}
		} while (choose != 0);
	}
	

}
