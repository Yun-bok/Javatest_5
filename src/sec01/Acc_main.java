package sec01;

public class Acc_main {// �θ� Ŭ����
	public static void main(String[] args) {
		Acc acc1 = new Acc("1234-1234",1000,"�̴���","1234");

		acc1.acc_number = "1234-1234";
		acc1.acc_money = 1000;
		acc1.acc_username = "�̴���";
		acc1.acc_pw = "1234";
		acc1.print();
		System.out.println(acc1.acc_number);
		System.out.println(acc1.acc_money);
		System.out.println(acc1.acc_username);
		System.out.println(acc1.acc_pw);

		Acc acc2 = new Acc("1234-1222", 1000000, "�̴���", "1234");
		acc2.print();

		Acc acc3 = new Acc("2221-2222", 2000000, "��", "1234");
		acc3.print();
		acc3.Addmoney(10000, "1234");
		acc3.Minusmoney(2000,"1234");
	}



			// acc_money -= money;
			// System.out.println("���: "+money+"�� �ܾ�:"+acc_money);
			// }else {
			// System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
			// }

//}

		
	
}