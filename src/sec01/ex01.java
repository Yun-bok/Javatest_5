package sec01;

public class ex01 { //public �ܺΰ���
	public static void main(String[] args) {
		// �⺻������ ����
		// nunu�� ���� Ŭ�������� ������ �ʵ��� ������
		// new ->���޸𸮿� ���� ��ü�� �ּҸ� ��ȯ 
		//Ŭ������ new������(); *****
		Cat nunu = new Cat();
		String name1 = nunu.color;
		String name2 = nunu.name;
		System.out.println("color = "+name1 +"/name ="+ name2 );
		nunu.color ="������";
		nunu.name = "ŰƼ";
		
		System.out.println("color = "+nunu.color + "/name = "+ nunu.name);
		nunu.age =17; //������̱⶧���� �̷��� ġ�� ��� ���Ѵ� ������ public����
		System.out.println("���̴� "+nunu.age);
		//Dog ����ؼ� �� �ʵ忡 ���� �����ϰ� ����ϼ���
		
		Cat cat2 = new Cat();
		cat2.name = "�׷�";
		cat2.age = 2;
		cat2.type = "���������";
		
		cat2.cry();
		cat2.print();
		
		
		
		Cat cat3 = new Cat("���������", 3,"ȣ����");//�����ڿ� ����ִ� -> �ڵ���డ��
		
		cat3.cry();
		cat3.print();
		
	}
}

//Ŭ���� ����
//Dog
//�ʵ� name,age,color, type(ǰ��)	(public,default)

//Ŭ���� ����
//Cat�̶�� ����
//�ڹٴ� �⺻�� public?
class Cat {
	// �ʵ�
	//default -> ��Ű���ȿ��� ����
	String name;
	// �ʵ�
	public String color;
	// �����ڰ� ��� ����Ʈ(�⺻)������ ����
	// Cat()
	
	//�ʵ� private �����
	// private int age;
	public int age;
	
	public String type;
	//�����ڰ� ������->�⺻������ ������ Cat()
	
	Cat() {//�����ڴ� ���� Ŭ�������� �ۺ����� ���� �������� �����ϱ� ���ظ���
		System.out.println("Cat ������ ����");
		
	}
	
	Cat(String name,int age, String type) {
		//this. => Ŭ������ ����Ų�� this.~~ ����,����Ŭ������ ����������Ų��~ 
		this.name = name; //�ǵ�name�� �Ű�����
		this.age = age;
		this.type = type;
	}
	//void ----�Լ��� ���ϰ��� ������ ���
	//���ϰ��� �������� ���ϵǴ� ���� Ÿ�԰� ��ġ
	public void cry() {
		System.out.println("�߿˾߿˾߿�");
	}
	//print ���
	public void print() {
		System.out.println("�̸���:"+name+"/���̴�:"+age+"/Ÿ��:"+type);
	}
	
	//�ڹٿ��� ���������� �� = public ,private,default, pretected
	//public -> ��� ���� ���
	//private -> ���� Ŭ���� �ȿ����� ���
	//default -> �� ���������ڰ� �����ʵ� ->���� ��Ű�� �ȿ��� ��� ��ǻ� ǥ�ð�����
	//protected -> ���� ��Ű�� �ȿ��� ��Ӱ��迡 �ִ� Ŭ���� �������
	
 
}
