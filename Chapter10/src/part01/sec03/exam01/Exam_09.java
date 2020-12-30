package part01.sec03.exam01;

import java.util.Scanner;

class SungJuk{
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private int rank;
	
	 
	
	SungJuk(String name,int kor,int eng){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
//		this.tot=kor+eng; // 사용자에서 연산가능                     *Q: 생성자 연산말고 메소드로 연산해서 값출력해보기                        
//		this.rank=1; //랭크 초기값1주고 1씩누적하는방법으로 
	}
	
	public void setKor(int kor) {
		this.kor=kor;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	public void setTot() {
		this.tot=kor+eng;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getTot() {
		return tot;
	}
	public int getRank() {
		return rank;
	}
	
	public void plusRank() {
		rank++;
	}
	void disp() {
		System.out.println(name+"님의 총점은"+tot+"점 이고,순위는"+rank+"입니다.");
	}
	public void clearRank() {
		this.rank=1;
	}

}

public class Exam_09 {
	
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name="";
		int kor=0;
		int eng=0;
		
		System.out.print("학생수를 입력: ");
		int inwon = s.nextInt();
		SungJuk sj[]=new SungJuk[inwon];
		
		for(int i=0;i<inwon;i++) {
			System.out.print((i+1)+"번째 학생의 이름: ");
			name=s.next();
			System.out.print((i+1)+"번째 학생의 국어점수: ");
			kor=s.nextInt();
			System.out.print((i+1)+"번째 학생의 영어점수: ");
			eng=s.nextInt();
			sj[i]=new SungJuk(name,kor,eng);
			sj[i].setKor(kor);
			sj[i].setEng(eng);
			sj[i].setTot();
			//sj[i].clearRank(1);//이렇게되면 모든값이 랭크1로초기화			
		} 
		
		
		for(int i=0;i<inwon;i++) {	
			sj[i].clearRank(); // 값을비교할때마다 초기화해주기위해서 여기위치해있는게 좋다.
			for(int j=0;j<inwon;j++) {	
				// 여기서 랭크1주는 메소드는 입력하면 전부다안되고 [0]의 위치에 있는 
				if(sj[i].getTot()<sj[j].getTot()) {
				         sj[i].plusRank();
				}
			}
			sj[i].disp();
		}
		

	}

}
