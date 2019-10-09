package com.Controller;

import com.Model.Administrators;
import com.Model.People;
import com.Model.RMWarehouse;
import com.Model.User;

public class WarehouseBiz implements IWarehouseBiz {
	// �ֿ�����goodsNum
	private static final int goodsNum = 100;

	// ��ʼ������Ա��Ϣ
	People[] admin = new Administrators[10];

	public void initializationAdmin() {
		admin[0] = new Administrators();
		admin[0].setName("����Ա");
		admin[0].setAccount("admin");
		admin[0].setPassword("12345");
	}

	// �������Ա����
	public void AdminShow(int flag) {
		System.out.print(admin[flag].getName());
	}

	// ��ʼ���û���Ϣ
	People[] user = new User[10];

	public void initializationUser() {
		user[0] = new User("����", "qwe", "123", 1);
		user[1] = new User("����", "asd", "456", 2);
		user[2] = new User("����", "zxc", "789", 3);
	}

	// ��ʼ��ԭ�ϲֿ�
	RMWarehouse[] rmWarehouse = new RMWarehouse[goodsNum];

	public RMWarehouse[] initializationRM() {
		rmWarehouse[0] = new RMWarehouse("����", "ɽ��", "����˾", "ԭ�ϲֿ�", 1);
		rmWarehouse[1] = new RMWarehouse("ͭ��", "����", "ͭ��˾", "ԭ�ϲֿ�", 2);
		rmWarehouse[2] = new RMWarehouse("ľ��", "������", "��ľ��", "ԭ�ϲֿ�", 3);
		return rmWarehouse;
	}

	// ԭ�ϲֿ����
	// ����Ա��¼
	public int AdminLog(String account, String password) {
		int flag = 1;// flag��־λ������Ա�����±�
		boolean find = false;// find��־λ��Ϊfalse��ʾδ�ҵ��ù���Ա��Ϊtrue��ʾ�ҵ��ù���Ա
		for (People ad : admin) {
			if (ad != null && account.equals(ad.getAccount()) && password.equals(ad.getPassword())) {
				find = true;// �ҵ�����Ա
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
