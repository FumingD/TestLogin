public class Ter{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		
		
		int count = 0;
		String errorName ="";
		do{
			System.out.println("请输入用户名：");
			String name = input.next();
			System.out.println("请输入密码：");
			String password = input.next();
			if(name.equals("tom")&&password.equals("123")){
				System.out.println("登陆成功");
				break;
			}
			else{
				System.out.println("用户名或密码错误，请重新输入");
				if(errorName.equals(name)){
						count++;
				}
				else{
					errorName = name;
					count = 1;
				}
		

			}
		}while(count<3);
			if(count == 3){
			 System.out.println("账号已被冻结");
			}
		}
}	
			