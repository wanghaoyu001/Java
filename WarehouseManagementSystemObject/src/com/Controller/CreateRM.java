package com.Controller;

import com.Model.RMWarehouse;

public class CreateRM implements Initialization{
	//原料仓库容量goodsNum
	private static final int goodsNum = 100;
	RMWarehouse[] rmWarehouse = new RMWarehouse[goodsNum];
	//初始化原料仓库
	public RMWarehouse[] initializationRMWarehouse() {
		rmWarehouse[0] = new RMWarehouse("铁矿","山西","铁矿公司","原料仓库",1);
	    rmWarehouse[1] = new RMWarehouse("铜矿", "河南","铜矿公司","原料仓库",2);
	    rmWarehouse[2] = new RMWarehouse("木材", "黑龙江","伐木场","原料仓库",3);
	    return rmWarehouse;
	}

}
