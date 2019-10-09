package com.Model;

//仓库管理员
public class Administrators extends People{

	//初始化管理员信息
	
	// 初始化用户信息
		public Administrators() {
			super();
			
		}
		
		public Administrators(String name, String account, String password) {
			this.setName(name);
			this.setAccount(account);
			this.setPassword(password);

		}

}
