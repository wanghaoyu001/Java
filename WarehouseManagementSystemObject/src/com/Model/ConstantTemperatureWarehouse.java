package com.Model;

//���²ֿ⣺���²ֿ����زֿ�һ��Ҳ������������ڴ����¶���Ҫ��Ĳ�Ʒ��
public class ConstantTemperatureWarehouse extends Warehouse {
	private String ConstantName;// ��������
	private double Wendu;// �¶�
	private double Weight;// ����

	public ConstantTemperatureWarehouse(String name, int userId, String time) {
		super(name, userId, time);
	}

	public ConstantTemperatureWarehouse(String name, int userId, String time, String constantName, double wendu,
			double weight) {
		super(name, userId, time);
		ConstantName = constantName;// ��������
		Wendu = wendu;// �¶�
		Weight = weight;// ����
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
