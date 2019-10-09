package com.Model;

//ԭ�ϲֿ⣺ԭ���ϲֿ������������������õ�ԭ���ϵģ�����ֿ�һ��Ƚϴ�
public class RMWarehouse extends Warehouse {
	private String RMName;// ԭ��������
	private String Address;// ԭ���ϲ���
	private String Manufacturer;// ԭ������������

	public RMWarehouse(String name, int userId) {
		super(name, userId);

	}

	public RMWarehouse(String rMName, String address, String manufacturer, String name, int userId) {
		super(name, userId);
		RMName = rMName;// ԭ��������
		Address = address;// ԭ���ϲ���
		Manufacturer = manufacturer;// ԭ������������
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
