package part01.sec01.exam01;

class MyChar{
	char x;
	char y;
}


public class Ex09_19 {     
	         
	public static void func1(char x,char y) {  // call by value ��
		//���� ���� �Ѿ�� ���
        //�޸𸮿��ִ� ���� ����
		char imsi=x;
		x=y;
		y=imsi;
		
		System.out.println("func1():x="+x+",y="+y);
	}
	
    public static void func2(MyChar ch) { //100�����Ѿ�� ����:x='A',y='Z'
    	char imsi = ch.x;
    	     ch.x=ch.y;
    	     ch.y=imsi;
    	
    	   	
//    	System.out.printf("���޹��� x==>%c\n",ch.x);
//    	System.out.printf("���޹��� y==>%c\n",ch.y);
    }

    
    
    
	public static void main(String[] args) { // call by address(reference) ��
	    //�ּҰ��� �Ѿ�¹��
		
		char x='A',y='Z';
		System.out.printf("���� �� : x=%c , y=%c\n",x,y);
		func1(x,y);
		System.out.printf("���� ���� �� �� : x=%c , y=%c\n",x,y);
		
		System.out.println();
		
		
		
	    MyChar ch = new MyChar();	// �ּҰ� ����
	    
	    ch.x='A'; //x='A',y='Z' ��� �ּҰ��ȿ� �ִ� ���� ex)100����
	    ch.y='Z';
	   
	    System.out.printf("���� �� : x=%c,y=%c\n",ch.x,ch.y);
	    
	    func2(ch); // 100�����ѱ� 
	   
	    System.out.printf("func2()���� ���� x==>%c\n",ch.x);
	    System.out.printf("func2()���� ���� y==>%c\n",ch.y);
	    

	}



}
