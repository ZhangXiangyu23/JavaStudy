import java.util.Scanner;
class Zxy{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你的名字：");
		String name = sc.next();
		System.out.print("请输入你的性别：");
		char gender = sc.next().charAt(0);
		System.out.println(gender);
		System.out.println("姓名为："+name+"性别为："+gender);

			
}
}
