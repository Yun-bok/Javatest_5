package sec01;

public class Quiz0903 {
	//Play --------> "�����" ���Ƚ�� +1 ���Ƚ���� ���
	//Rankup ------> ���� -1 ������� 1~3���� ���� ���ϼ̽��ϴ� ���
	//Rank down----> ���� +1 ������� 5���̻��̸� �й��ϼ��� ���
	//print-->>�뷡����: ����: ���Ƚ��: ����:

	public static void main(String[] args) {
		sing self = new sing("���Ƚ��","","�׸�","�谡��");
		self.PlayCount ="���Ƚ��";
		self.Rank = "";
		self.name = "��𿡵�";
		self.Singer = "�̼�";
		
		
	}

}
class song {
	
	public String name;
	public String Singer;
	public int PlayCount;
	public int Rank;
	song(String name,String Singer,int PlayCount,int Rank) {
		this.name = name;
		this.Singer = Singer ;
		this.PlayCount = PlayCount;
		this.Rank = Rank ;
	}
}
//�����Լ��� ����?
public void Rankup(int Rank) {
	if(Rank.equal()<)

}else if(Rank){
	

	
}
public void print {
	System.out.println("�뷡����: "+name+"/ ����: "+Singer+"/ ���Ƚ��: "+playCount+"+1"+" / ����: "+Rank);
}


//Ŭ���� ����� �������
//�뷡
//song �̸��� ���� �뷡 Ŭ���� o
//�ʵ� ->name,Singer,Play Count, Rank

//������ -4���� �ʵ带 �������ִ�o
//�޼���
//Play --------> "�����" ���Ƚ�� +1 ���Ƚ���� ���
//Rankup ------> ���� -1 ������� 1~3���� ���� ���ϼ̽��ϴ� ���
//Rank down----> ���� +1 ������� 5���̻��̸� �й��ϼ��� ���
//print-->>�뷡����: ����: ���Ƚ��: ����: