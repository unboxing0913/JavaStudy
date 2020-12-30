package part01.sec02.exam07;

class AccessWay{
	static int num=0; //객체와 상관없이 별도의 공간에 만들어짐 // 다른말고 클래스변수
	
	AccessWay(){
		incrCnt(); // 생성자 안에서 메소드호출
	}
	
	public void incrCnt() {
		num++;
	}
}

public class ClassVearAccess_2 {

	public static void main(String[] args) {
		AccessWay way=new AccessWay(); // num==>1
		way.num++; // num==>2
		AccessWay.num++; // num==>3           : 클래스이름접근 (중요)
		AccessWay way2=new AccessWay(); // num==>4
		way2.num++; // num==>5
		
		System.out.println("num="+AccessWay.num); // => static 객체가없어도 사용할수있다. /접근법 : 클래스이름으로 접근
		//System.out.println("num="+way.num);
		
	}

}
