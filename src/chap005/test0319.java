package chap005;

import java.util.Scanner;

public class test0319 {
Scanner sc =new Scanner(System.in);
	public void main(String[] args) {
		//cola1();	
		//cola2();
		//cola3();
		//cola4();
	}
	
	static void cola1() {
		int i = 1;
		while(i<=15) {
			System.out.println(i);
			i++;
		}
	}
	static void cola2() {
		int suma = 0;
		
		int i =1;
		while(i<=100) {
			
			suma += i;
			
			i++;
			
			
		}
		System.out.println((i-1)+"��"+suma);
	}
	static void cola3() {
		Scanner sc =new Scanner(System.in);
		System.out.println("�Ǽ��� �Է��ϼ���");
		float numr = Float.parseFloat(sc.nextLine());
		float numr2 = Float.parseFloat(sc.nextLine());
		
		if(numr2+numr>=4.0) {
			System.out.println("�Ѵ� 4.0�̻� 'A'");
		}else if(numr2+numr>=3.0) {
			System.out.println("�Ѵ� 3.0�̻� 'B'");
		}else {
			System.out.println("C");
			
		}
	}
	static void cola4() {
		Scanner sc =new Scanner(System.in);
		int col = Integer.parseInt(sc.nextLine());
		
		if(col>0) {
			System.out.println("���");
		}else if(col<0){
			System.out.println("����");
		}else if(col==0) {
			System.out.println("���α׷� ����..");
			//???????
		}
		
	}
}
