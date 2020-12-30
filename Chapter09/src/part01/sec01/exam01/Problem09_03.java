package part01.sec01.exam01;
//이거 이해잘해야함 (1)for문을 어떻게쓰느냐 방법 ,(2)lotto[k]의 이해  1000번 타이핑
public class Problem09_03 {
	//get 가져오다        //set 저장하다
	public static int getNumber() {
		return (int)(Math.random()*45)+1;	
	}

	public static void main(String[] args) {
		int[] lotto= {0,0,0,0,0,0};
		int i,k,num;
		char dup1='N';
		
		System.out.printf("**로또 추첨을 시작합니다.**\n\n");
		i=0;//이런방법도됨	
		for(;i<6;) { //012345
			num=getNumber();				
			for(k=0;k<=i;k++) {
				if(lotto[k]==num)  //같은숫자면Y (중복검사)
					dup1='Y';					
			    }				
								
				/// for문에서는 중복검사
			
			
				if(dup1=='N') {		//중복없으면			
					lotto[i++]=num;//for문말고 여기서증가 중복없을때 증가
				}else{ // 중복있으면 
					dup1='N';
										
				  }
			}
			
		
		
		       System.out.printf("추첨된 로또 번호 ==>");			
		       for(i=0;i<6;i++) {
			   System.out.printf("%d ",lotto[i]);
		       }
	
	}
}


