package sec01;

public class ex02 {

	public static void main(String[] args) {
		Dog meat = new Dog();
		String str = meat.color;
		String str2 = meat.name;
		meat.name ="바둑이";
		meat.color = "흰색 검은색";
		meat.type = "잡종";
		meat.age = 3;
		System.out.println("장판뜯는 지옥견 소개");
		System.out.println("이름:"+meat.name+"색갈:"+meat.color);
		System.out.println("멍멍이 나이:"+meat.age+"    개품종:"+meat.type);
		System.out.println("특징: 지옥견임");
		
		
		
			

	}

}
class Dog {
	
	String name;
	
	public String color;
	
	public int age;
	
	public String type;
	
}
