package sec01;
//Acc클래스는 계좌관련된 클래스
	// acc_number(계좌번호),acc_money(잔액),acc_username(예금주),acc_pw(비밀번호)
	// String int String String
	// 모든 필드는 public

public class Acc {//이 클래스만 쓴다 //자식 클래스 임
//계좌번호
	public String acc_number;
	//계좌번호
	public int acc_money;
	//잔액
	public String acc_username;
	//예금주
	public String acc_pw;
	//비밀번호
	
	//생성자(계좌번호,잔액,예금주,비밀번호)
	//각각의 변수를 초기화
	
	
	
	//기본생성자 -생성자가 없으면 자동으로 생성, 다른 매개변수(String acc_number등)를 가지는 생성자가 있으면 생성x
	
	
	
	
	
	
	//print
	//출력
	//예금주:이대현,계좌번호: 1111-2222 ,잔액 :1000 패스워드 출력x
	
	//생성자(계좌번호,잔액,예금주,비밀번호)
	//각각의 변수를 초기화-> 선언만되고 값이 저장되지않은 변수에 값을 최초로 저장
	Acc(String number,int money,String username,String pw) {
		this.acc_number = number;
		this.acc_money = money;
		this.acc_username = username;
		this.acc_pw = pw;
	}
	
	
	
	public void Addmoney(int money, String pw) {
		if(acc_pw.equals(pw)) {
			acc_money += money;
			System.out.println("입금: "+money+"총 잔액:"+acc_money);
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		
		
	}
	
	//출금
		public void Minusmoney(int money, String pw) {
			if (acc_pw.equals(pw)) {
				if (acc_money < money) {
					System.out.println("잔액부족");
					return;
				}

				acc_money -= money;
				System.out.println("출금: " + money + "총 잔액:" + acc_money);
			}
		}
	
	public void print() {
		
		System.out.println("예금주: "+acc_username+"/ 계좌번호:"+acc_number+"/ 잔액:"+acc_money);
	}
}

