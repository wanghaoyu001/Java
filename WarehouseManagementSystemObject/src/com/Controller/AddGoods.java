package com.Controller;

import com.Model.RMWarehouse;

//仓库存入
public interface AddGoods {
	//原料仓库存入
	public abstract void AddRMWarehouse(RMWarehouse[] user);
}
