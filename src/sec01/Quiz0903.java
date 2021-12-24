package sec01;

public class Quiz0903 {
	//Play --------> "라라라라" 재생횟수 +1 재생횟수를 출력
	//Rankup ------> 순위 -1 순위출력 1~3등이 이하 잘하셨습니다 출력
	//Rank down----> 순위 +1 순위출력 5등이상이면 분발하세요 출력
	//print-->>노래제목: 가수: 재생횟수: 순위:

	public static void main(String[] args) {
		sing self = new sing("재생횟수","","그림","김가수");
		self.PlayCount ="재생횟수";
		self.Rank = "";
		self.name = "어디에도";
		self.Singer = "이수";
		
		
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
//랜덤함수로 순위?
public void Rankup(int Rank) {
	if(Rank.equal()<)

}else if(Rank){
	

	
}
public void print {
	System.out.println("노래제목: "+name+"/ 가수: "+Singer+"/ 재생횟수: "+playCount+"+1"+" / 순위: "+Rank);
}


//클래스 만들어 나가면됨
//노래
//song 이름을 가진 노래 클래스 o
//필드 ->name,Singer,Play Count, Rank

//생성자 -4개의 필드를 저장해주는o
//메서드
//Play --------> "라라라라" 재생횟수 +1 재생횟수를 출력
//Rankup ------> 순위 -1 순위출력 1~3등이 이하 잘하셨습니다 출력
//Rank down----> 순위 +1 순위출력 5등이상이면 분발하세요 출력
//print-->>노래제목: 가수: 재생횟수: 순위: