package part01.sec01.exam01;

public class ArrayVarTest1_1 {

	public static void main(String[] args) {
		int arr1[]= {1,2,3};
		int arr2[]=arr1;// arr1은 이미 배열이 선언되었기때문에 대괄호를 안쓰고 대입한다 (특정위치를 나타낼땐 예외)
		for(int cnt=0;cnt<arr2.length;cnt++) {
			System.out.println(arr2[cnt]);// 1 2 3
		}
		arr2[1]=7; //=>같은 주소값을 가르키기때문에 arr1도 변함
		//arr1=null;  //null:아무 데이터도 가르키지 않는 참조값
		for(int cnt=0;cnt<arr1.length;cnt++) {
			System.out.println(arr1[cnt]);
		}

	}

}

/*
      배열도 레퍼런스 타입이기 때문에 변수에 참조값만 저장된다.
      그리고 배열 변수를 다른 배열에 대입하면 두 변수가 같은 배열을 가르킨다 
*/