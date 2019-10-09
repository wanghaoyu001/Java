package com.Controller;

import com.Model.RMWarehouse;

//初始化
public interface Initialization {
	//初始化原料仓库
	public abstract RMWarehouse[] initializationRMWarehouse();
}
