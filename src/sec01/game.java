package sec01;

public class game {
	public static void main(String[] args) {
		Game_character test = new Game_character(10,10,10,30);
		test.Attack();
	}

	//Ŭ������ ������
	//����ĳ����
	//Ŭ���� �̸��� �����Ӱ�
	//�ʵ� -�� ,����, ��Ʈ, ��
	//������ - 4���� �Է¹޾Ƽ� �ʵ��� ���� ���� (�ʱ�ȭ?
	//�޼��� - ����(����)�޼��� - ���ݷ�: ��+����+��Ʈ+��
}
class Game_character{
	public int Str;//��
	public int Dex;//����
	public int Int;//��Ʈ
	public int Luk;//��

	Game_character(int Str,int Dex,int Int,int Luk) {
		this.Str = Str;
		this.Dex = Dex;
		this.Int = Int;
		this.Luk = Luk;
			
		

	}
	
	public void Attack() {
		System.out.println("���ݷ�: "+Str+Dex+Int+Luk);
	}

}


