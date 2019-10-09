package com.Controller;

import com.Model.RMWarehouse;

//仓库存入
public class Add implements AddGoods{

	//原料仓库存入
	public void AddRMWarehouse(RMWarehouse[] user) {
	System.out.println(user[0].getUserId()+user[0].getName());
		
	}

}
