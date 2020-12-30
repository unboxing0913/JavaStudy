package part01.sec01.exam01;

public class Ex04_03 {

	public static void main(String[] args) {
        int a=10;
        
        a++;//자기자신 1증가 10->11  (a=a+1;)
            // ++a;//1증가 11->12  (a=a+1;)
        System.out.printf("a++ ==>%d\n",a);
        
        
        a--;//자기자신 1감소 11->10 (a=a-1;)
        System.out.printf("a-- ==>%d\n",a);   
        
        
        a+=5;//a=a+5;
        System.out.printf("a+=5 ==>%d\n",a);  
        
        
        a-=5;//a=a-5;
        System.out.printf("a-=5 ==>%d\n",a);  
        
        
        a*=5;//a=a*5
        System.out.printf("a*=5 ==>%d\n",a);  
        
        
        a/=5;//a=a/5
        System.out.printf("a/=5 ==>%d\n",a);  
        
        
        a%=5;//a=a%5
        System.out.printf("a%%=5 ==>%d\n",a);  
		
	}

}
