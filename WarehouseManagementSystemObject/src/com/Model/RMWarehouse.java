package com.Model;

//原料仓库：原材料仓库是用来储存生产所用的原材料的，这类仓库一般比较大。
public class RMWarehouse extends Warehouse {
	private String RMName;// 原材料名称
	private String Address;// 原材料产地
	private String Manufacturer;// 原材料生产厂家

	public RMWarehouse(String name, int userId, String time) {
		super(name, userId, time);

	}

	public RMWarehouse(String name, int userId, String time, String rMName, String address, String manufacturer) {
		super(name, userId, time);
		RMName = rMName;// 原材料名称
		Address = address;// 原材料产地
		Manufacturer = manufacturer;// 原材料生产厂家
	}

	public String getRMName() {
		return RMName;
	}

	public void setRMName(String rMName) {
		RMName = rMName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

}
