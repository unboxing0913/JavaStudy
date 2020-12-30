package test05.sungMap;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import test02.sungList.SungJuk;
import test03.memberMap.Member;

public class SungProImpl implements SungPro {
	
	private Hashtable<String,SungJuk> map;
	private Scanner in;
	
	public SungProImpl(){
		map = new Hashtable<String,SungJuk>();
		in = new Scanner(System.in);
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
		System.out.println("이름을 입력 : ");
		String name=in.next();
		int kor=inputSub("국어");
		int eng=inputSub("영어");
		SungJuk input=new SungJuk(name,kor,eng);
		map.put(name, input);
		
	}
	
	public void rank() {
        
	/*	Set<String> key = map.keySet();
		Iterator<String> keyit = key.iterator();
		while(keyit.hasNext()) {
		SungJuk list1 = (SungJuk)keyit;
		list1.clearRank();
		       while(keyit.hasNext()) {
			   SungJuk list2 = (SungJuk)keyit;
			   if(list1.getTot()<list2.getTot()) {
				   list1.plusRank();
			      }
		       }				
	     }  안되는방법 */      
		
	   for(Enumeration<String> enu1=map.keys();enu1.hasMoreElements();) { /*keys() 메서드는 배열의 각 인덱스를 키 값으로 가지는 새로운 Array Iterator 객체를 반환합니다.*/
		   String key1=enu1.nextElement();
			  SungJuk rank1 = map.get(key1); 
			  rank1.clearRank(); // 초기화이유(초기화 안해줄시 수정할때 문제가생김 기존에있던 Rank값 + 됨 ) 
			  for(Enumeration<String> enu2=map.keys();enu2.hasMoreElements();) {
				  String key2=enu2.nextElement();
				  SungJuk rank2 = map.get(key2);			  			 
				  if(rank1.getTot() < rank2.getTot()) {
					  rank1.plusRank();
				  }
			  }  
			  }      
		   }  
	 
	   

	@Override 
	public void view() {//점수가 나오기전에 랭크가 정해져있어야함
	/*	rank(); //사용하려고 만든것
		Set<String> key = map.keySet();	
		Iterator<String> keyit=key.iterator();     
	    while(keyit.hasNext()) {
//	    	Object obj=keyit.next();	    	
//	    	SungJuk view = (SungJuk)obj;  //안됨
	    	String name = keyit.next();
	    	SungJuk view = map.get(name);
	    	//view.disp();
	    	view.disp();
	    }	다른방법	*/
		
		rank();
		Enumeration<String> enu=map.keys();
		while(enu.hasMoreElements()) {
			String key=enu.nextElement();
			SungJuk view=map.get(key);
			view.disp();
		}
		
	}

	@Override
	public void edit() {
/*		System.out.println("수정할 학생의 이름 입력: ");
		String name=in.next();
		Set<String> key = map.keySet();	
		Iterator<String> keyit=key.iterator();    
		while(keyit.hasNext()) {
//		    Object obj = keyit;             //안됨
//			SungJuk edit= (SungJuk)obj;
			String name2 = keyit.next();
	    	SungJuk edit = map.get(name2);
			if(name.equals(edit.getName())){
				System.out.println(name+"님의 현재 국어 점수는"+edit.getKor()+"점 입니다.");
				int kor=inputSub("수정할 국어"); 
				System.out.println(name+"님의 현재 영어 점수는"+edit.getEng()+"점 입니다.");
				int eng=inputSub("수정할 영어");
				edit.setKor(kor);
				edit.setEng(eng);
				edit.setTot(); 
				System.out.println(name+"학생의 성적을 수정하엿습니다.");
				return;
			}
		}     다른방법 */
			
		System.out.println("수정할 학생의 이름입력: ");
		String name = in.next();
		if(map.contains(name)) {
			SungJuk edit=map.get(name);			
				System.out.println(name+"님의 현재 국어 점수는"+edit.getKor()+"점 입니다.");
				int kor=inputSub("수정할 국어"); 
				System.out.println(name+"님의 현재 영어 점수는"+edit.getEng()+"점 입니다.");
				int eng=inputSub("수정할 영어");
				edit.setKor(kor);
				edit.setEng(eng);
				edit.setTot(); 
				System.out.println(name+"학생의 성적을 수정하엿습니다.");
				return;			
		       }
		System.out.println(name+"님은 저희학생이 아닙니다.");
	}

	@Override
	public void delete() {
/*		System.out.println("삭제할 학생의 이름 입력: ");
		String name=in.next();
		Set<String> key = map.keySet();	
		Iterator<String> keyit=key.iterator(); 
		String name2 = keyit.next();
    	SungJuk delete = map.get(name2);
			if(name.equals(delete.getName())) {
				map.remove(name2);
				System.out.println(name+"학생을 삭제하였습니다.");				
				return;
			}
				
		System.out.println(name+"님은 저희 학생이 아닙니다.");     */
		
		System.out.println("삭제할 학생의 이름 입력: ");
		String name=in.next();
		if(map.containsKey(name)) { //contains와 containsKey차이점 알기
				map.remove(name);
				System.out.println(name+"학생을 삭제하였습니다.");				
				return;
			}		
		System.out.println(name+"님은 저희 학생이 아닙니다."); 
	}
		

	@Override
	public void exit() {
		System.out.println("시스템을 종료합니다.");
		System.exit(0);
		
		
	}

	
}
