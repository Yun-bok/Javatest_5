package sec01;
//AccŬ������ ���°��õ� Ŭ����
	// acc_number(���¹�ȣ),acc_money(�ܾ�),acc_username(������),acc_pw(��й�ȣ)
	// String int String String
	// ��� �ʵ�� public

public class Acc {//�� Ŭ������ ���� //�ڽ� Ŭ���� ��
//���¹�ȣ
	public String acc_number;
	//���¹�ȣ
	public int acc_money;
	//�ܾ�
	public String acc_username;
	//������
	public String acc_pw;
	//��й�ȣ
	
	//������(���¹�ȣ,�ܾ�,������,��й�ȣ)
	//������ ������ �ʱ�ȭ
	
	
	
	//�⺻������ -�����ڰ� ������ �ڵ����� ����, �ٸ� �Ű�����(String acc_number��)�� ������ �����ڰ� ������ ����x
	
	
	
	
	
	
	//print
	//���
	//������:�̴���,���¹�ȣ: 1111-2222 ,�ܾ� :1000 �н����� ���x
	
	//������(���¹�ȣ,�ܾ�,������,��й�ȣ)
	//������ ������ �ʱ�ȭ-> ���𸸵ǰ� ���� ����������� ������ ���� ���ʷ� ����
	Acc(String number,int money,String username,String pw) {
		this.acc_number = number;
		this.acc_money = money;
		this.acc_username = username;
		this.acc_pw = pw;
	}
	
	
	
	public void Addmoney(int money, String pw) {
		if(acc_pw.equals(pw)) {
			acc_money += money;
			System.out.println("�Ա�: "+money+"�� �ܾ�:"+acc_money);
		}else {
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		
		
	}
	
	//���
		public void Minusmoney(int money, String pw) {
			if (acc_pw.equals(pw)) {
				if (acc_money < money) {
					System.out.println("�ܾ׺���");
					return;
				}

				acc_money -= money;
				System.out.println("���: " + money + "�� �ܾ�:" + acc_money);
			}
		}
	
	public void print() {
		
		System.out.println("������: "+acc_username+"/ ���¹�ȣ:"+acc_number+"/ �ܾ�:"+acc_money);
	}
}

