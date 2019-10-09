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
					flag = warehouse.AdminLog(account, password);// ����Ա��¼

					if (flag == 0) {
						System.out.println("�û�������!�����µ�¼��");
					} else {
						find = true;// �ҵ�����Ա
						// ����Ա����
						System.out.println("��¼�ɹ���");
						System.out.print("��ӭ  *");
						warehouse.AdminShow(flag-1);
						System.out.println("*  ʹ�òֿ����ϵͳ");
						int choose1 = 0;
						do {
							System.out.println("---------�ֿ����---------");
							System.out.println("1.�������");
							System.out.println("2.�û�����");
							System.out.println("0.�˳�");

							choose1 = input.nextInt();
							switch (choose1) {
							case 1:
								// �������
								System.out.println("-----�������-----");

								break;
							case 2:
								// �û�����
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

			default:
				break;
			}
		} while (choose != 0);
	}

}
