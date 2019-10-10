package com.Model;

//冷藏仓库：它是用来储藏那些需要进行冷藏储存的货物，一般多是农副产品、药品等等对于储存温度有要求的物品。
public class ColdWarehouse extends Warehouse {
	private String ColdName;// 货物名称
	private double temperature;// 储存温度
	private int quality;// 保质期

	public ColdWarehouse(String name, int userId, String time) {
		super(name, userId, time);// 仓库名称, 用户编号,货物存入时间

	}

	public ColdWarehouse(String name, int userId, String time, String coldName, double temperature, int quality) {
		super(name, userId, time);// 仓库名称, 用户编号,货物存入时间
		ColdName = coldName;// 货物名称
		this.temperature = temperature;// 储存温度
		this.quality = quality;// 保质期
	}

	public String getColdName() {
		return ColdName;
	}

	public void setColdName(String coldName) {
		ColdName = coldName;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

}
