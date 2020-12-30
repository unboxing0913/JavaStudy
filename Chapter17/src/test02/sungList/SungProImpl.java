package test02.sungList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungProImpl implements SungPro {
       
	  private ArrayList<SungJuk>list;
	  private Scanner in;
	  
	  public SungProImpl() {
		  list=new ArrayList<SungJuk>();
		  in=new Scanner(System.in);	  
	  }
	 
	  public int inputSub(String str) {
		  int sub;
		  
		  while(true) {
			  System.out.print(str+"과목의 점수를 입력 :");
			  sub=in.nextInt();
			  if(sub<0 || sub>100) {
				  System.out.println(str+"과목의 점수는 0점에서 100점 사이입니다.");
			  }else {
				  break;
			  }
		  }
			  return sub;
		  }
	  
	@Override
	public void input() {
		System.out.print("이름을 입력: ");
		String name = in.next(); //이름받고
		int kor=inputSub("국어");//국어점수받고
		int eng=inputSub("영어");//영어점수받고
		SungJuk input=new SungJuk(name,kor,eng); // SungJuk 객체생성 input
		list.add(input); // ArrayList 배열에 객체값 넣기
	}
	
	
	public void rank() {
		for(SungJuk rank1:list) {
			rank1.clearRank();
			for(SungJuk rank2:list) {
				if(rank1.getTot()<rank2.getTot()) {
					rank1.plusRank();
				}				
			}
			//rank1.getRank();
		}
	}
	
	@Override
	public void view() {
		rank();
		for(SungJuk view:list) {
			view.disp();
		}
		
	}
	
	@Override
	public void edit() {
		System.out.println("수정할 학생의 이름 입력: ");
		String name=in.next();
		Iterator<SungJuk> it = list.iterator();
		while(it.hasNext()) {
			SungJuk edit=it.next();
			if(name.equals(edit.getName())){
				System.out.println(name+"님의 현재 국어 점수는"+edit.getKor()+"점 입니다.");
				int kor=inputSub("수정할 국어"); /*메소드호출 => 호출받은점수는 지역변수 kor에 저장(임시보관)*/
				System.out.println(name+"님의 현재 영어 점수는"+edit.getEng()+"점 입니다.");
				int eng=inputSub("수정할 영어"); /*메소드호출 => 호출받은점수는 지역변수 kor에 저장(임시보관)*/
				edit.setKor(kor);
				edit.setEng(eng);
				edit.setTot();  /*점수가바뀌면 등수도바뀌어야함*/ 
				System.out.println(name+"학생의 성적을 수정하엿습니다.");
				return;
			}
		}
			
		
	}
	
	@Override
	public void delete() {
		System.out.println("삭제할 학생의 이름 입력: ");
		String name=in.next();
		for(SungJuk delete:list) {
			if(name.equals(delete.getName())) {
				list.remove(delete);
				System.out.println(name+"학생을 삭제하였습니다.");				
				return;
			}
		}		
		System.out.println(name+"님은 저희 학생이 아닙니다.");
	}
	
	@Override
	public void exit() {
		System.out.println("프로그램을 종료.");
		System.exit(0);
		
	}
	

}
