package com.Model;

//产品仓库：产品仓库的作用是存放已经完成的产品，但这些产品还没有进入流通区域，这种仓库一般是附属于产品生产工厂。
public class ProductWarehouse extends Warehouse {
	private String productName;// 货物名称
	private int amount;// 数量
	private String Destination;// 目的地

	public ProductWarehouse(String name, int userId, String time) {
		super(name, userId, time);

	}

	public ProductWarehouse(String name, int userId, String time, String productName, int amount, String destination) {
		super(name, userId, time);
		this.productName = productName;// 货物名称
		this.amount = amount;// 数量
		this.Destination = destination;// 目的地

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
