package com.Controller;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.Model.Administrators;
import com.Model.ColdWarehouse;
import com.Model.ConstantTemperatureWarehouse;
import com.Model.People;
import com.Model.ProductWarehouse;
import com.Model.RMWarehouse;
import com.Model.User;

public class WarehouseBiz implements IWarehouseBiz {
	// 仓库容量goodsNum
	private static final int goodsNum = 100;
	// 管理员数量adminNum
	private static final int adminNum = 10;
	// 用户数量userNum
	private static final int userNum = 10;
	
	//Test
	public void test() {
		List<RMWarehouse> rmlist = new ArrayList<RMWarehouse>();
		rmlist.add(rmWarehouse[0]);
		System.out.println(rmlist.get(0).getName()+"    "+rmlist.get(0).getRMName()+"   "+rmlist.get(0).getAddress());
	}

	// 初始化管理员信息
	People[] admin = new Administrators[adminNum];

	public void initializationAdmin() {
		admin[0] = new Administrators();
		admin[0].setName("管理员甲");
		admin[0].setAccount("admin");
		admin[0].setPassword("12345");
	}

	// 输出管理员姓名
	public void adminShow(int flag) {
		System.out.print(admin[flag].getName());
	}

	// 输出用户姓名
	public void userShow(int flag) {
		System.out.print(user[flag].getName());
	}

	// 初始化用户信息
	People[] user = new User[userNum];

	public void initializationUser() {
		user[0] = new User("张三", "qwe", "123", 1);
		user[1] = new User("李四", "asd", "456", 2);
		user[2] = new User("王五", "zxc", "789", 3);
	}
	
	// 初始化原料仓库
	RMWarehouse[] rmWarehouse = new RMWarehouse[goodsNum];
	List<RMWarehouse> rmlist = new ArrayList<RMWarehouse>();
	public RMWarehouse[] initializationRM() {
		rmWarehouse[0] = new RMWarehouse("原料仓库", 1, "2019-10-01", "铁矿", "山西", "铁矿公司");
		rmWarehouse[1] = new RMWarehouse("原料仓库", 2, "2019-09-23", "铜矿", "河南", "铜矿公司");
		rmWarehouse[2] = new RMWarehouse("原料仓库", 3, "2019-07-12", "木材", "黑龙江", "伐木场");
		return rmWarehouse;
	}
	// 初始化原料仓库List
	public void initializationRMlist() {
		
		rmlist.add(new RMWarehouse("原料仓库", 1, "2019-10-01", "铁矿", "山西", "铁矿公司"));
		rmlist.add(new RMWarehouse("原料仓库", 2, "2019-09-23", "铜矿", "河南", "铜矿公司"));
		rmlist.add(new RMWarehouse("原料仓库", 3, "2019-07-12", "木材", "黑龙江", "伐木场"));
	}

	// 初始化冷藏仓库
	ColdWarehouse[] coldWarehouse = new ColdWarehouse[goodsNum];

	public ColdWarehouse[] initializationCold() {
		coldWarehouse[0] = new ColdWarehouse("冷藏仓库", 1, "2019-10-04", "葡萄", 0.0, 30);
		coldWarehouse[1] = new ColdWarehouse("冷藏仓库", 2, "2019-05-02", "土豆", -1.0, 120);
		coldWarehouse[2] = new ColdWarehouse("冷藏仓库", 3, "2019-09-20", "西瓜", -5.0, 60);
		return coldWarehouse;

	}

	// 初始化恒温仓库
	ConstantTemperatureWarehouse[] ctWarehouse = new ConstantTemperatureWarehouse[goodsNum];

	public ConstantTemperatureWarehouse[] initializationConstant() {
		ctWarehouse[0] = new ConstantTemperatureWarehouse("恒温仓库", 1, "2019-10-10", "啤酒", 12.0, 300);
		ctWarehouse[1] = new ConstantTemperatureWarehouse("恒温仓库", 2, "2019-11-13", "饮料", 15.0, 1200);
		ctWarehouse[2] = new ConstantTemperatureWarehouse("恒温仓库", 3, "2019-09-18", "大米", 18.0, 6000);
		return ctWarehouse;

	}

	// 初始化产品仓库
	ProductWarehouse[] pWarehouse = new ProductWarehouse[goodsNum];

	public ProductWarehouse[] initializationProduct() {
		pWarehouse[0] = new ProductWarehouse("产品仓库", 1, "2019-12-02", "手机", 1200, "河南");
		pWarehouse[1] = new ProductWarehouse("产品仓库", 2, "2019-08-16", "电脑", 500, "陕西");
		pWarehouse[2] = new ProductWarehouse("产品仓库", 3, "2019-10-08", "电视机", 800, "四川");
		return pWarehouse;

	}

	// 管理员登录
	public int adminLog(String account, String password) {
		int flag = 1;// flag标志位，管理员数组下标
		boolean find = false;// find标志位，为false表示未找到该管理员，为true表示找到该管理员
		for (People ad : admin) {
			if (ad != null && account.equals(ad.getAccount()) && password.equals(ad.getPassword())) {
				find = true;// 找到管理员
				break;
			}
			flag++;
		}
		if (find == true) {
			return flag;
		} else {
			return 0;
		}
	}

	// 用户登录
	public int userLog(String account, String password) {
		int flag = 1;// flag标志位，用户数组下标
		boolean find = false;// find标志位，为false表示未找到该管理员，为true表示找到该管理员
		for (People us : user) {
			if (us != null && account.equals(us.getAccount()) && password.equals(us.getPassword())) {
				find = true;// 找到管理员
				break;
			}
			flag++;
		}
		if (find == true) {
			return flag;
		} else {
			return 0;
		}
	}

	// 输出原料仓库货物列表
	public void RMshow() {
		int i = 0;// 编号
		for (RMWarehouse rm : rmWarehouse) {
			// 输出非空元素
			if (rm != null) {
				i++;
				System.out.println(i + "\t" + user[rm.getUserId() - 1].getName() + "\t" + rm.getTime() + "\t"
						+ rm.getRMName() + "\t\t" + rm.getAddress() + "\t\t" + rm.getManufacturer());
			}
		}
	}
	public void rmShowList() {
		
		rmlist.get(0);
	}

	public void RMshow(int flag) {
		int i = 0;// 编号
		for (RMWarehouse rm : rmWarehouse) {
			// 输出非空元素
			if (rm != null && rm.getUserId() == flag) {
				i++;
				System.out.println(i + "\t" + user[rm.getUserId() - 1].getName() + "\t" + rm.getTime() + "\t"
						+ rm.getRMName() + "\t\t" + rm.getAddress() + "\t\t" + rm.getManufacturer());
			}
		}
	}

	// 原料仓库货物录入
	public boolean RMInput(int flag, String RMName, String Address, String Manufacturer) {
		boolean find = false;// 录入成功标志位
		int i = 0;
		Format format = new SimpleDateFormat("yyyy-MM-dd");
		for (RMWarehouse rm : rmWarehouse) {
			if (rm != null) {
				i++;
			}
		}

		// 查找空位录入货物信息
		if (i != 0) {
			rmWarehouse[i] = new RMWarehouse("原料仓库", flag, format.format(new Date()), RMName, Address, Manufacturer);
			find = true;
		}

		return find;
	}
	// 原料仓库货物取出
	public boolean RMoutput(int num) {
		return true;
	}

	// 输出冷藏仓库货物列表
	public void ColdOutput() {
		int i = 0;// 编号
		for (ColdWarehouse cold : coldWarehouse) {
			// 输出非空元素
			if (cold != null) {
				i++;
				System.out.println(i + "\t" + user[cold.getUserId() - 1].getName() + "\t" + cold.getTime() + "\t"
						+ cold.getColdName() + "\t\t" + cold.getTemperature() + "℃\t\t" + cold.getQuality() + "天");
			}
		}
	}

	public void ColdOutput(int flag) {
		int i = 0;// 编号
		for (ColdWarehouse cold : coldWarehouse) {
			// 输出非空元素
			if (cold != null && cold.getUserId() == flag) {
				i++;
				System.out.println(i + "\t" + user[cold.getUserId() - 1].getName() + "\t" + cold.getTime() + "\t"
						+ cold.getColdName() + "\t\t" + cold.getTemperature() + "℃\t\t" + cold.getQuality() + "天");
			}
		}
	}

	// 输出恒温仓库货物列表
	public void ConstantOutput() {
		int i = 0;// 编号
		for (ConstantTemperatureWarehouse con : ctWarehouse) {
			// 输出非空元素
			if (con != null) {
				i++;
				System.out.println(i + "\t" + user[con.getUserId() - 1].getName() + "\t" + con.getTime() + "\t"
						+ con.getConstantName() + "\t\t" + con.getWendu() + "℃\t\t" + con.getWeight() + "kg");
			}
		}
	}

	public void ConstantOutput(int flag) {
		int i = 0;// 编号
		for (ConstantTemperatureWarehouse con : ctWarehouse) {
			// 输出非空元素
			if (con != null && con.getUserId() == flag) {
				i++;
				System.out.println(i + "\t" + user[con.getUserId() - 1].getName() + "\t" + con.getTime() + "\t"
						+ con.getConstantName() + "\t\t" + con.getWendu() + "℃\t\t" + con.getWeight() + "kg");
			}
		}
	}

	// 输出产品仓库货物列表
	public void ProductOutput() {
		int i = 0;// 编号
		for (ProductWarehouse pro : pWarehouse) {
			// 输出非空元素
			if (pro != null) {
				i++;
				System.out.println(i + "\t" + user[pro.getUserId() - 1].getName() + "\t" + pro.getTime() + "\t"
						+ pro.getProductName() + "\t\t" + pro.getAmount() + "个\t\t" + pro.getDestination());
			}
		}
	}

	public void ProductOutput(int flag) {
		int i = 0;// 编号
		for (ProductWarehouse pro : pWarehouse) {
			// 输出非空元素
			if (pro != null && pro.getUserId() == flag) {
				i++;
				System.out.println(i + "\t" + user[pro.getUserId() - 1].getName() + "\t" + pro.getTime() + "\t"
						+ pro.getProductName() + "\t\t" + pro.getAmount() + "个\t\t" + pro.getDestination());
			}
		}
	}

	// 输出所有用户列表
	public void userOutput() {
		int i = 0;// 编号
		for (People user : user) {
			// 输出非空元素
			if (user != null) {
				i++;
				System.out.println(i + "\t" + user.getName() + "\t" + user.getAccount() + "\t" + user.getPassword());
			}
		}
	}
}
