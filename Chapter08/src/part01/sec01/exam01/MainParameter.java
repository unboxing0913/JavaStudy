package part01.sec01.exam01;

public class MainParameter {
                                    //우클릭 -> RunAs -> Runconfigurations..-> arguments -> program arguments 입력
	public static void main(String[] args) {//매개변수 => 외부로부터 값을 전달받는 변수
	    double sum=0.0;
	    
	    for(int i=0;i<args.length;i++) {
	    	sum+=Double.parseDouble(args[i]); //문자열을 실수로 변환하여 준다.
	    }
	    	System.out.println("합계 :"+sum);
	    	System.out.println("평균 :"+sum/args.length);
	    
	}

}
