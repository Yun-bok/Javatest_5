package sec01;

public class game {
	public static void main(String[] args) {
		Game_character test = new Game_character(10,10,10,30);
		test.Attack();
	}

	//클ㄹ래스 만들어라
	//게임캐릭터
	//클래스 이름은 자유롭게
	//필드 -힘 ,덱스, 인트, 럭
	//생성자 - 4개를 입력받아서 필드의 값을 저장 (초기화?
	//메서드 - 어택(공격)메서드 - 공격력: 힘+덱스+인트+럭
}
class Game_character{
	public int Str;//힘
	public int Dex;//덱스
	public int Int;//인트
	public int Luk;//럭

	Game_character(int Str,int Dex,int Int,int Luk) {
		this.Str = Str;
		this.Dex = Dex;
		this.Int = Int;
		this.Luk = Luk;
			
		

	}
	
	public void Attack() {
		System.out.println("공격력: "+Str+Dex+Int+Luk);
	}

}


