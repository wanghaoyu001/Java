package com.Controller;

import com.Model.RMWarehouse;

public class CreateRM implements Initialization{
	//ԭ�ϲֿ�����goodsNum
	private static final int goodsNum = 100;
	RMWarehouse[] rmWarehouse = new RMWarehouse[goodsNum];
	//��ʼ��ԭ�ϲֿ�
	public RMWarehouse[] initializationRMWarehouse() {
		rmWarehouse[0] = new RMWarehouse("����","ɽ��","����˾","ԭ�ϲֿ�",1);
	    rmWarehouse[1] = new RMWarehouse("ͭ��", "����","ͭ��˾","ԭ�ϲֿ�",2);
	    rmWarehouse[2] = new RMWarehouse("ľ��", "������","��ľ��","ԭ�ϲֿ�",3);
	    return rmWarehouse;
	}

}
