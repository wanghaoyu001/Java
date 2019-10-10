package com.Controller;

import com.Model.Administrators;
import com.Model.ColdWarehouse;
import com.Model.People;
import com.Model.RMWarehouse;
import com.Model.User;

public class WarehouseBiz implements IWarehouseBiz {
	// �ֿ�����goodsNum
	private static final int goodsNum = 100;
	// ����Ա����adminNum
	private static final int adminNum = 10;
	// �û�����userNum
	private static final int userNum = 10;

	// ��ʼ������Ա��Ϣ
	People[] admin = new Administrators[adminNum];

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
	People[] user = new User[userNum];

	public void initializationUser() {
		user[0] = new User("����", "qwe", "123", 1);
		user[1] = new User("����", "asd", "456", 2);
		user[2] = new User("����", "zxc", "789", 3);
	}

	// ��ʼ��ԭ�ϲֿ�
	RMWarehouse[] rmWarehouse = new RMWarehouse[goodsNum];

	public RMWarehouse[] initializationRM() {
		rmWarehouse[0] = new RMWarehouse("ԭ�ϲֿ�", 1, "2019-10-01", "����", "ɽ��", "����˾");
		rmWarehouse[1] = new RMWarehouse("ԭ�ϲֿ�", 2, "2019-09-23", "ͭ��", "����", "ͭ��˾");
		rmWarehouse[2] = new RMWarehouse("ԭ�ϲֿ�", 3, "2019-07-12", "ľ��", "������", "��ľ��");
		return rmWarehouse;
	}

	// ��ʼ����زֿ�
	ColdWarehouse[] coldWarehouse = new ColdWarehouse[goodsNum];

	public ColdWarehouse[] initializationCold() {
		coldWarehouse[0] = new ColdWarehouse("��زֿ�", 1, "2019-10-04", "����", 0.0, 30);
		coldWarehouse[1] = new ColdWarehouse("��زֿ�", 2, "2019-05-02", "����", 15.0, 120);
		coldWarehouse[2] = new ColdWarehouse("��زֿ�", 3, "2019-09-20", "����", 12.0, 60);
		return coldWarehouse;

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

	// ���ԭ�ϲֿ�����б�
	public void RMOutput() {
		int i = 0;// ���
		for (RMWarehouse rm : rmWarehouse) {
			// ����ǿ�Ԫ��
			if (rm != null) {
				i++;
				System.out.println(i + "\t" + user[rm.getUserId() - 1].getName() + "\t" + rm.getTime() + "\t"
						+ rm.getRMName() + "\t\t" + rm.getAddress() + "\t\t" + rm.getManufacturer());
			}
		}
	}

	// �����زֿ�����б�
	public void ColdOutput() {
		int i = 0;// ���
		for (ColdWarehouse cold : coldWarehouse) {
			// ����ǿ�Ԫ��
			if (cold != null) {
				i++;
				System.out.println(i + "\t" + user[cold.getUserId() - 1].getName() + "\t" + cold.getTime() + "\t"
						+ cold.getColdName() + "\t\t" + cold.getTemperature() + "��\t\t" + cold.getQuality() + "��");
			}
		}
	}

	// ��������û��б�
	public void userOutput() {
		int i = 0;// ���
		for (People user : user) {
			// ����ǿ�Ԫ��
			if (user != null) {
				i++;
				System.out.println(i + "\t" + user.getName() + "\t" + user.getAccount() + "\t" + user.getPassword());
			}
		}
	}
}
