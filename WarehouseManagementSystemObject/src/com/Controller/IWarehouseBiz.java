package com.Controller;

import com.Model.RMWarehouse;

public interface IWarehouseBiz {
	// ��ʼ������Ա��Ϣ
	public void initializationAdmin();

	// �������Ա����
	public void AdminShow(int flag);

	// ��ʼ���û���Ϣ
	public void initializationUser();

	// ����Ա��¼
	public int AdminLog(String account, String password);

	// ��ʼ��ԭ�ϲֿ�
	public RMWarehouse[] initializationRM();

}
