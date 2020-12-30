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
//		this.tot=kor+eng; // ����ڿ��� ���갡��                     *Q: ������ ���긻�� �޼ҵ�� �����ؼ� ������غ���                        
//		this.rank=1; //��ũ �ʱⰪ1�ְ� 1�������ϴ¹������ 
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
		System.out.println(name+"���� ������"+tot+"�� �̰�,������"+rank+"�Դϴ�.");
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
		
		System.out.print("�л����� �Է�: ");
		int inwon = s.nextInt();
		SungJuk sj[]=new SungJuk[inwon];
		
		for(int i=0;i<inwon;i++) {
			System.out.print((i+1)+"��° �л��� �̸�: ");
			name=s.next();
			System.out.print((i+1)+"��° �л��� ��������: ");
			kor=s.nextInt();
			System.out.print((i+1)+"��° �л��� ��������: ");
			eng=s.nextInt();
			sj[i]=new SungJuk(name,kor,eng);
			sj[i].setKor(kor);
			sj[i].setEng(eng);
			sj[i].setTot();
			//sj[i].clearRank(1);//�̷��ԵǸ� ��簪�� ��ũ1���ʱ�ȭ			
		} 
		
		
		for(int i=0;i<inwon;i++) {	
			sj[i].clearRank(); // �������Ҷ����� �ʱ�ȭ���ֱ����ؼ� ������ġ���ִ°� ����.
			for(int j=0;j<inwon;j++) {	
				// ���⼭ ��ũ1�ִ� �޼ҵ�� �Է��ϸ� ���δپȵǰ� [0]�� ��ġ�� �ִ� 
				if(sj[i].getTot()<sj[j].getTot()) {
				         sj[i].plusRank();
				}
			}
			sj[i].disp();
		}
		

	}

}
