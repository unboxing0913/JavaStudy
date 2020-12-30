package part01.sec01.exam01;

class MyChar{
	char x;
	char y;
}


public class Ex09_19 {     
	         
	public static void func1(char x,char y) {  // call by value 예
		//실제 값이 넘어가는 방식
        //메모리에있던 값만 복사
		char imsi=x;
		x=y;
		y=imsi;
		
		System.out.println("func1():x="+x+",y="+y);
	}
	
    public static void func2(MyChar ch) { //100번지넘어옴 내용:x='A',y='Z'
    	char imsi = ch.x;
    	     ch.x=ch.y;
    	     ch.y=imsi;
    	
    	   	
//    	System.out.printf("전달받은 x==>%c\n",ch.x);
//    	System.out.printf("전달받은 y==>%c\n",ch.y);
    }

    
    
    
	public static void main(String[] args) { // call by address(reference) 예
	    //주소값이 넘어가는방식
		
		char x='A',y='Z';
		System.out.printf("원래 값 : x=%c , y=%c\n",x,y);
		func1(x,y);
		System.out.printf("값을 전달 한 후 : x=%c , y=%c\n",x,y);
		
		System.out.println();
		
		
		
	    MyChar ch = new MyChar();	// 주소값 생성
	    
	    ch.x='A'; //x='A',y='Z' 라는 주소값안에 있는 내용 ex)100번지
	    ch.y='Z';
	   
	    System.out.printf("원래 값 : x=%c,y=%c\n",ch.x,ch.y);
	    
	    func2(ch); // 100번지넘김 
	   
	    System.out.printf("func2()실행 후의 x==>%c\n",ch.x);
	    System.out.printf("func2()실행 후의 y==>%c\n",ch.y);
	    

	}



}
