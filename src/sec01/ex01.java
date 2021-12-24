package sec01;

public class ex01 { //public 외부공개
	public static void main(String[] args) {
		// 기본생성자 만듬
		// nunu는 이제 클래스에서 선언한 필드사용 ㅆㄱㄴ
		// new ->힙메모리에 생긴 객체의 주소를 반환 
		//클래스는 new생성자(); *****
		Cat nunu = new Cat();
		String name1 = nunu.color;
		String name2 = nunu.name;
		System.out.println("color = "+name1 +"/name ="+ name2 );
		nunu.color ="빨간색";
		nunu.name = "키티";
		
		System.out.println("color = "+nunu.color + "/name = "+ nunu.name);
		nunu.age =17; //비공개이기때문에 이렇게 치면 사용 못한다 쓸려면 public으로
		System.out.println("나이는 "+nunu.age);
		//Dog 사용해서 각 필드에 값을 저장하고 출력하세요
		
		Cat cat2 = new Cat();
		cat2.name = "네로";
		cat2.age = 2;
		cat2.type = "검정고양이";
		
		cat2.cry();
		cat2.print();
		
		
		
		Cat cat3 = new Cat("빨강고양이", 3,"호랭이");//생성자에 들어있다 -> 코드단축가능
		
		cat3.cry();
		cat3.print();
		
	}
}

//클래스 선언
//Dog
//필드 name,age,color, type(품종)	(public,default)

//클래스 선언
//Cat이라고 만듬
//자바는 기본이 public?
class Cat {
	// 필드
	//default -> 패키지안에서 공개
	String name;
	// 필드
	public String color;
	// 생성자가 없어서 디폴트(기본)생성자 생성
	// Cat()
	
	//필드 private 비공개
	// private int age;
	public int age;
	
	public String type;
	//생성자가 없으면->기본생성자 생성됨 Cat()
	
	Cat() {//생성자는 위에 클래스에서 퍼블릭으로 만든 변수들을 저장하기 위해만듬
		System.out.println("Cat 생성자 실행");
		
	}
	
	Cat(String name,int age, String type) {
		//this. => 클래스를 가르킨다 this.~~ ㅁㅁ,ㅂㅂ클래스의 무엇을가리킨다~ 
		this.name = name; //맨뒤name은 매개변수
		this.age = age;
		this.type = type;
	}
	//void ----함수의 리턴값이 없을때 사용
	//리턴값이 있을때는 리턴되는 값의 타입과 일치
	public void cry() {
		System.out.println("야옹야옹야옹");
	}
	//print 출력
	public void print() {
		System.out.println("이름은:"+name+"/나이는:"+age+"/타입:"+type);
	}
	
	//자바에선 접근제한자 는 = public ,private,default, pretected
	//public -> 모든 접근 허용
	//private -> 현재 클래스 안에서만 허용
	//default -> 는 접근제한자가 없는필드 ->같은 패키지 안에서 허용 사실상 표시가없음
	//protected -> 같은 패키지 안에서 상속관계에 있는 클래스 에서허용
	
 
}
