package com.Model;

//��زֿ⣺��������������Щ��Ҫ������ش���Ļ��һ�����ũ����Ʒ��ҩƷ�ȵȶ��ڴ����¶���Ҫ�����Ʒ��
public class ColdWarehouse extends Warehouse {
	private String ColdName;// ��������
	private double temperature;// �����¶�
	private int quality;// ������

	public ColdWarehouse(String name, int userId, String time) {
		super(name, userId, time);// �ֿ�����, �û����,�������ʱ��

	}

	public ColdWarehouse(String name, int userId, String time, String coldName, double temperature, int quality) {
		super(name, userId, time);// �ֿ�����, �û����,�������ʱ��
		ColdName = coldName;// ��������
		this.temperature = temperature;// �����¶�
		this.quality = quality;// ������
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
