package part01.sec02.exam01;


class Avg{
	String name;
	int avg;
	
	public String average(int kor,int eng) {              //반환타입 String인이유 ▼
		avg=(kor+eng)/2;
		//필드에있는 avg가져옴
		return name+avg;                                        //문자열+숫자(연결)
	}    //반환하는것 자체에 이름+      
}





public class AvgTest_01 {

	public static void main(String[] args) {
	       Avg student1=new Avg();
	       Avg student2=new Avg();
	       
	       student1.name="김철수";      //필드로 값주고
	       student2.name="김영희";
	       
	       String st1_avg=student1.average(70, 80); //average 내가만든 메소드
	       String st2_avg=student2.average(80, 90);
	       
	      System.out.println(st1_avg);
	      System.out.println(st2_avg);
		
	}

}
