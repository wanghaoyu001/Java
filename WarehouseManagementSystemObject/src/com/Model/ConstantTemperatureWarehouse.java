package com.Model;

//恒温仓库：恒温仓库和冷藏仓库一样也是用来储存对于储藏温度有要求的产品。
public class ConstantTemperatureWarehouse extends Warehouse {
	private String ConstantName;// 货物名称
	private double Wendu;// 温度
	private double Weight;// 重量

	public ConstantTemperatureWarehouse(String name, int userId, String time) {
		super(name, userId, time);
	}

	public ConstantTemperatureWarehouse(String name, int userId, String time, String constantName, double wendu,
			double weight) {
		super(name, userId, time);
		ConstantName = constantName;// 货物名称
		Wendu = wendu;// 温度
		Weight = weight;// 重量
	}

	public String getConstantName() {
		return ConstantName;
	}

	public void setConstantName(String constantName) {
		ConstantName = constantName;
	}

	public double getWendu() {
		return Wendu;
	}

	public void setWendu(double wendu) {
		Wendu = wendu;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		Weight = weight;
	}

}
