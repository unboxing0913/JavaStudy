package part01.sec01.exam01;

public class Ex04_06 {

	public static void main(String[] args) {
         int a=99;
         
         System.out.printf("AND 연산:%s \n",(a>=100) && (a<=200));//둘다참일때만참
        //Java의 경우 AND 앞의것이 참이아닐경우 뒤에것은 배제함 (내부적으로 그렇게처리)
       
         System.out.printf("OR 연산:%s \n",(a>=100) || (a<=200));//둘중하나만참이면참
         // OR 앞에것이참일경우 뒤에것배제 
         System.out.printf("NOT 연산:%s \n",!(a==100));//참이면거짓,거짓이면참
         
               
         

	}

}
