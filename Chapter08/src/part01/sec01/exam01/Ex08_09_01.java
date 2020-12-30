package part01.sec01.exam01;

public class Ex08_09_01 {
 //이해가안감
	public static void main(String[] args) {
		           //[3][4]
		int intArray[][]= {{90,90,110,110},{120,110,100,90},{120,140,130,150}};
		double sum=0;
		
		System.out.println(intArray.length); //12가인 3이출력 ==> 중간테이블이있다고 생각해야함		
		//System.out.println(intArray[0].length); //배열[0]의 갯수 중간테이블을 거쳐서
	    for(int i=0;i<intArray.length;i++) { //다른이유가 핵심 // 중간테이블의 수
	    	//System.out.println(intArray[i].length);
	    	for(int j=0;j<intArray[i].length;j++) {//다른이유가 핵심 //intArray[i]=>중간테이블을 거쳐 직접
	    		sum+=intArray[i][j];
	    		 
	    	}
	    }
		System.out.println("지난 3년간 매출 총액"+sum+"이며 연평균 매출총액은"+sum/intArray.length+"입니다.");
		

	}

}
                   //스택구조 마지막에 들어간게 먼저나온다. 