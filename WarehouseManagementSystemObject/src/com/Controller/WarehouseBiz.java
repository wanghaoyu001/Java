package com.Controller;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.Model.Administrators;
import com.Model.ColdWarehouse;
import com.Model.ConstantTemperatureWarehouse;
import com.Model.People;
import com.Model.ProductWarehouse;
import com.Model.RMWarehouse;
import com.Model.User;

public class WarehouseBiz implements IWarehouseBiz {
	// �ֿ�����goodsNum
	private static final int goodsNum = 100;
	// ����Ա����adminNum
	private static final int adminNum = 10;
	// �û�����userNum
	private static final int userNum = 10;
	
	//Test
	public void test() {
		List<RMWarehouse> rmlist = new ArrayList<RMWarehouse>();
		rmlist.add(rmWarehouse[0]);
		System.out.println(rmlist.get(0).getName()+"    "+rmlist.get(0).getRMName()+"   "+rmlist.get(0).getAddress());
	}

	// ��ʼ������Ա��Ϣ
	People[] admin = new Administrators[adminNum];

	public void initializationAdmin() {
		admin[0] = new Administrators();
		admin[0].setName("����Ա��");
		admin[0].setAccount("admin");
		admin[0].setPassword("12345");
	}

	// �������Ա����
	public void adminShow(int flag) {
		System.out.print(admin[flag].getName());
	}

	// ����û�����
	public void userShow(int flag) {
		System.out.print(user[flag].getName());
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
	List<RMWarehouse> rmlist = new ArrayList<RMWarehouse>();
	public RMWarehouse[] initializationRM() {
		rmWarehouse[0] = new RMWarehouse("ԭ�ϲֿ�", 1, "2019-10-01", "����", "ɽ��", "����˾");
		rmWarehouse[1] = new RMWarehouse("ԭ�ϲֿ�", 2, "2019-09-23", "ͭ��", "����", "ͭ��˾");
		rmWarehouse[2] = new RMWarehouse("ԭ�ϲֿ�", 3, "2019-07-12", "ľ��", "������", "��ľ��");
		return rmWarehouse;
	}
	// ��ʼ��ԭ�ϲֿ�List
	public void initializationRMlist() {
		
		rmlist.add(new RMWarehouse("ԭ�ϲֿ�", 1, "2019-10-01", "����", "ɽ��", "����˾"));
		rmlist.add(new RMWarehouse("ԭ�ϲֿ�", 2, "2019-09-23", "ͭ��", "����", "ͭ��˾"));
		rmlist.add(new RMWarehouse("ԭ�ϲֿ�", 3, "2019-07-12", "ľ��", "������", "��ľ��"));
	}

	// ��ʼ����زֿ�
	ColdWarehouse[] coldWarehouse = new ColdWarehouse[goodsNum];

	public ColdWarehouse[] initializationCold() {
		coldWarehouse[0] = new ColdWarehouse("��زֿ�", 1, "2019-10-04", "����", 0.0, 30);
		coldWarehouse[1] = new ColdWarehouse("��زֿ�", 2, "2019-05-02", "����", -1.0, 120);
		coldWarehouse[2] = new ColdWarehouse("��زֿ�", 3, "2019-09-20", "����", -5.0, 60);
		return coldWarehouse;

	}

	// ��ʼ�����²ֿ�
	ConstantTemperatureWarehouse[] ctWarehouse = new ConstantTemperatureWarehouse[goodsNum];

	public ConstantTemperatureWarehouse[] initializationConstant() {
		ctWarehouse[0] = new ConstantTemperatureWarehouse("���²ֿ�", 1, "2019-10-10", "ơ��", 12.0, 300);
		ctWarehouse[1] = new ConstantTemperatureWarehouse("���²ֿ�", 2, "2019-11-13", "����", 15.0, 1200);
		ctWarehouse[2] = new ConstantTemperatureWarehouse("���²ֿ�", 3, "2019-09-18", "����", 18.0, 6000);
		return ctWarehouse;

	}

	// ��ʼ����Ʒ�ֿ�
	ProductWarehouse[] pWarehouse = new ProductWarehouse[goodsNum];

	public ProductWarehouse[] initializationProduct() {
		pWarehouse[0] = new ProductWarehouse("��Ʒ�ֿ�", 1, "2019-12-02", "�ֻ�", 1200, "����");
		pWarehouse[1] = new ProductWarehouse("��Ʒ�ֿ�", 2, "2019-08-16", "����", 500, "����");
		pWarehouse[2] = new ProductWarehouse("��Ʒ�ֿ�", 3, "2019-10-08", "���ӻ�", 800, "�Ĵ�");
		return pWarehouse;

	}

	// ����Ա��¼
	public int adminLog(String account, String password) {
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

	// �û���¼
	public int userLog(String account, String password) {
		int flag = 1;// flag��־λ���û������±�
		boolean find = false;// find��־λ��Ϊfalse��ʾδ�ҵ��ù���Ա��Ϊtrue��ʾ�ҵ��ù���Ա
		for (People us : user) {
			if (us != null && account.equals(us.getAccount()) && password.equals(us.getPassword())) {
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
	public void RMshow() {
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
	public void rmShowList() {
		
		rmlist.get(0);
	}

	public void RMshow(int flag) {
		int i = 0;// ���
		for (RMWarehouse rm : rmWarehouse) {
			// ����ǿ�Ԫ��
			if (rm != null && rm.getUserId() == flag) {
				i++;
				System.out.println(i + "\t" + user[rm.getUserId() - 1].getName() + "\t" + rm.getTime() + "\t"
						+ rm.getRMName() + "\t\t" + rm.getAddress() + "\t\t" + rm.getManufacturer());
			}
		}
	}

	// ԭ�ϲֿ����¼��
	public boolean RMInput(int flag, String RMName, String Address, String Manufacturer) {
		boolean find = false;// ¼��ɹ���־λ
		int i = 0;
		Format format = new SimpleDateFormat("yyyy-MM-dd");
		for (RMWarehouse rm : rmWarehouse) {
			if (rm != null) {
				i++;
			}
		}

		// ���ҿ�λ¼�������Ϣ
		if (i != 0) {
			rmWarehouse[i] = new RMWarehouse("ԭ�ϲֿ�", flag, format.format(new Date()), RMName, Address, Manufacturer);
			find = true;
		}

		return find;
	}
	// ԭ�ϲֿ����ȡ��
	public boolean RMoutput(int num) {
		return true;
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

	public void ColdOutput(int flag) {
		int i = 0;// ���
		for (ColdWarehouse cold : coldWarehouse) {
			// ����ǿ�Ԫ��
			if (cold != null && cold.getUserId() == flag) {
				i++;
				System.out.println(i + "\t" + user[cold.getUserId() - 1].getName() + "\t" + cold.getTime() + "\t"
						+ cold.getColdName() + "\t\t" + cold.getTemperature() + "��\t\t" + cold.getQuality() + "��");
			}
		}
	}

	// ������²ֿ�����б�
	public void ConstantOutput() {
		int i = 0;// ���
		for (ConstantTemperatureWarehouse con : ctWarehouse) {
			// ����ǿ�Ԫ��
			if (con != null) {
				i++;
				System.out.println(i + "\t" + user[con.getUserId() - 1].getName() + "\t" + con.getTime() + "\t"
						+ con.getConstantName() + "\t\t" + con.getWendu() + "��\t\t" + con.getWeight() + "kg");
			}
		}
	}

	public void ConstantOutput(int flag) {
		int i = 0;// ���
		for (ConstantTemperatureWarehouse con : ctWarehouse) {
			// ����ǿ�Ԫ��
			if (con != null && con.getUserId() == flag) {
				i++;
				System.out.println(i + "\t" + user[con.getUserId() - 1].getName() + "\t" + con.getTime() + "\t"
						+ con.getConstantName() + "\t\t" + con.getWendu() + "��\t\t" + con.getWeight() + "kg");
			}
		}
	}

	// �����Ʒ�ֿ�����б�
	public void ProductOutput() {
		int i = 0;// ���
		for (ProductWarehouse pro : pWarehouse) {
			// ����ǿ�Ԫ��
			if (pro != null) {
				i++;
				System.out.println(i + "\t" + user[pro.getUserId() - 1].getName() + "\t" + pro.getTime() + "\t"
						+ pro.getProductName() + "\t\t" + pro.getAmount() + "��\t\t" + pro.getDestination());
			}
		}
	}

	public void ProductOutput(int flag) {
		int i = 0;// ���
		for (ProductWarehouse pro : pWarehouse) {
			// ����ǿ�Ԫ��
			if (pro != null && pro.getUserId() == flag) {
				i++;
				System.out.println(i + "\t" + user[pro.getUserId() - 1].getName() + "\t" + pro.getTime() + "\t"
						+ pro.getProductName() + "\t\t" + pro.getAmount() + "��\t\t" + pro.getDestination());
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
