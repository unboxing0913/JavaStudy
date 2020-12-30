package part01.sec01.exam01;

public class Ex08_10_01 {
                  // void => 반환값이 없다
	public static void main(String[] args) {//main메소드는 jvm이 호출하는것
		int intArray[];     //메소드 괄호안에 선언된변수는 매개변수
		intArray=makeArray(); //호출
		//temp의 주소값을 받음 ex)100번지
		for(int i=0;i<intArray.length;i++) 
			System.out.println(intArray[i]);
		
	}
	           //int[]는 반환타입(자료형) => temp는 정수형 배열이다를 알려주는것 // []없으면 그냥 정수값
		static int[] makeArray() {  //메소드는 괄호가있어야함(){} //호출됨
			
			int temp[]=new int[4];
			
			for(int i=0;i<temp.length;i++)
				temp[i]=i;
				
				return temp;//호출한 메소드로 값을주고 종료    //return 하나만있으면 그냥종료
		               //temp의 주소값을 건네줌 ex)100번지

	}

}
