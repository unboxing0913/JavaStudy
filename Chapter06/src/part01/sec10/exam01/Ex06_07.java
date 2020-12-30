package part01.sec10.exam01;

public class Ex06_07 {

	public static void main(String[] args) {
		
        int i;
        int hap=0; // 이걸못했음..... 이거진짜중요명심 가슴에새김 값을더해나가는변수는반드시 초기화를해줘
    // 초기화 ; 비   교값 ; 증가나감소
		for(i=1;i<=10;i++) { 	
		hap = hap+i; // 집가서 계산해봐 		
		
		}
		System.out.printf("1에서10까지의 합%d\n",hap);//괄호밖으로 빼준거 아니면 다출력됨..
		                                           // 집가서 안에도 넣어봐
		
	}   

}
