package project8_oop;

//实体类：用于包装数据
public class Account {
	private String uname;
	private String password;  //private 表示私有  只能在这个类里面访问
	
	
	//当属性私有时，对外提供  “方法”  来访问
	//提供一个设置密码的方法，在这个方法中，可以加逻辑（长度。密级。生成密文）
	public void setPassword(String p) {
		//逻辑代码：判断 p 的长度如果小于6，自动设定一个初始密码
		if(p.length()<6) {
			System.out.println("密码长度过短，必须大于6位，如不满足，系统自动生成密码：123456");
			password="123456";
		}else {
			password=p;
		}
	}
	
	//用户必须大于两位  空格不算
	public void setUname(String u) {
		//trim（）表示将一个字符串去掉空格
		if(u==null||u.trim().length()<2) {
			System.out.println("用户不满足需求，系统安全退出！");
			System.exit(0);
		}else {
			uname=u;
		}
	}
	
	public boolean login(String u,String pwd) {
		//equals()判断两个字符串是否相等
		
		if(uname.equals(u)&&password.equals(pwd)) {
			return true;
		}else {
			return false;
		}
	}

}
