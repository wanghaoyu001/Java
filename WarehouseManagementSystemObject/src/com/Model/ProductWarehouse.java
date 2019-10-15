package com.Model;

//��Ʒ�ֿ⣺��Ʒ�ֿ�������Ǵ���Ѿ���ɵĲ�Ʒ������Щ��Ʒ��û�н�����ͨ�������ֲֿ�һ���Ǹ����ڲ�Ʒ����������
public class ProductWarehouse extends Warehouse {
	private String productName;// ��������
	private int amount;// ����
	private String Destination;// Ŀ�ĵ�

	public ProductWarehouse(String name, int userId, String time) {
		super(name, userId, time);

	}

	public ProductWarehouse(String name, int userId, String time, String productName, int amount, String destination) {
		super(name, userId, time);
		this.productName = productName;// ��������
		this.amount = amount;// ����
		this.Destination = destination;// Ŀ�ĵ�

	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

}
