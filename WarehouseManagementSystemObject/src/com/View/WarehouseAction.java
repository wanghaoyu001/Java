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

		// ��ʼ������Ա��Ϣ
		People[] admin = new Administrators[10];
		admin[0] = new Administrators();
		admin[0].setName("����Ա");
		admin[0].setAccount("admin");
		admin[0].setPassword("12345");

		// System.out.println(admin[0].getName());
		// System.out.println(admin[0].getAccount());
		// System.out.println(admin[0].getPassword());

		// ��ʼ���û���Ϣ
		People[] user = new User[10];
		user[0] = new User("����", "qwe", "123",1);
		user[1] = new User("����", "asd", "456",2);
		user[2] = new User("����", "zxc", "789",3);

		// System.out.println(user[0].getName());
		// System.out.println(user[0].getAccount());
		// System.out.println(user[0].getPassword());
		
		//��ʼ��ԭ�ϲֿ�
		CreateRM rm = new CreateRM();
		rm.initializationRMWarehouse();
		Add add = new Add();
		add.AddRMWarehouse(rm.initializationRMWarehouse());
		
		
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
					for (People ad:admin) {
						if (ad!=null&&account.equals(ad.getAccount()) && password.equals(ad.getPassword())) {
							find = true;//�ҵ�����Ա
							break;
						}
						flag++;
					}
					if (find==false) {
						System.out.println("�û�������!�����µ�¼��");
						flag = 0;//��־λ����
					} else {
						//����Ա����
						System.out.println("��¼�ɹ���");
						System.out.println("��ӭ  *" + admin[flag].getName() + "*  ʹ�òֿ����ϵͳ");
						
						int choose1=0;
						do {
							System.out.println("---------�ֿ����---------");
							System.out.println("1.�������");
							System.out.println("2.�û�����");
							System.out.println("0.�˳�");
							
							choose1 = input.nextInt();
							switch (choose1) {
							case 1:
								//�������
								System.out.println("-----�������-----");
								
								break;
							case 2:
								//�û�����
								break;
							case 0:
								//�˳�ϵͳ
								choose1 = 0;
								break;

							default:
								System.out.println("���������������������룡");
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
