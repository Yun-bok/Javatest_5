package sec01;

public class ex02 {

	public static void main(String[] args) {
		Dog meat = new Dog();
		String str = meat.color;
		String str2 = meat.name;
		meat.name ="�ٵ���";
		meat.color = "��� ������";
		meat.type = "����";
		meat.age = 3;
		System.out.println("���Ƕ�� ������ �Ұ�");
		System.out.println("�̸�:"+meat.name+"����:"+meat.color);
		System.out.println("�۸��� ����:"+meat.age+"    ��ǰ��:"+meat.type);
		System.out.println("Ư¡: ��������");
		
		
		
			

	}

}
class Dog {
	
	String name;
	
	public String color;
	
	public int age;
	
	public String type;
	
}
