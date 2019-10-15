package com.Controller;

import com.Model.ColdWarehouse;
import com.Model.ConstantTemperatureWarehouse;
import com.Model.ProductWarehouse;
import com.Model.RMWarehouse;

public interface IWarehouseBiz {
	// ��ʼ������Ա��Ϣ
	public void initializationAdmin();

	// �������Ա����
	public void adminShow(int flag);

	// ����û�����
	public void userShow(int flag);

	// ��ʼ���û���Ϣ
	public void initializationUser();

	// ����Ա��¼
	public int adminLog(String account, String password);

	// �û���¼
	public int userLog(String account, String password);

	// ��ʼ��ԭ�ϲֿ�
	public RMWarehouse[] initializationRM();
	public void initializationRMlist();

	// ��ʼ����زֿ�
	public ColdWarehouse[] initializationCold();

	// ��ʼ�����²ֿ�
	public ConstantTemperatureWarehouse[] initializationConstant();

	// ��ʼ����Ʒ�ֿ�
	public ProductWarehouse[] initializationProduct();

	// ���ԭ�ϲֿ�����б�
	public void RMshow();
	public void rmShowList();
	public void RMshow(int flag);
	//ԭ�ϲֿ����¼��
	public boolean RMInput(int flag,String RMName,String Address,String Manufacturer);
	//ԭ�ϲֿ�ȡ��
	public boolean RMoutput(int num);

	// �����زֿ�����б�
	public void ColdOutput();
	public void ColdOutput(int flag);

	// ������²ֿ�����б�
	public void ConstantOutput();
	public void ConstantOutput(int flag);

	// �����Ʒ�ֿ�����б�
	public void ProductOutput();
	public void ProductOutput(int flag);

	// ��������û��б�
	public void userOutput();
	
	//Test
	public void test();

}
