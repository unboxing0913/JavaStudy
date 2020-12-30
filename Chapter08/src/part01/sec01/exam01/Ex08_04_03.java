package part01.sec01.exam01;

public class Ex08_04_03 {

	public static void main(String[] args) {
		 int[] arr1=new int[3]; // 인트타입의 배열을 메모리에 만들다
		 for(int i=0;i<3;i++) { //인트타입 배열은 따로값을안줘도 디폴트값으로0이들어감 
			 
			 System.out.println("arr1["+i+"]:"+arr1[i]);
		
		 }
		 arr1[0]=10;
		 arr1[1]=20;
		 arr1[2]=30;
		 
             for(int i=0;i<3;i++) {
			 
			   System.out.println("arr1["+i+"]:"+arr1[i]);
	}
       ///////////////////////////////////////////////////////////////////      
             
             double[] arr2=new double[3]; 
    		 for(int i=0;i<3;i++) { //더블타입은 값을안주면 0.0이들어감  			 
    			 System.out.println("arr2["+i+"]:"+arr2[i]);
    		 }
    		 
    		 arr2[0]=0.1;
    		 arr2[1]=0.2;
    		 arr2[2]=0.3;
    		 
                 for(int i=0;i<3;i++) {
    			 
    			   System.out.println("arr2["+i+"]:"+arr2[i]);

                }
       /////////////////////////////////////////////////////////////////////
                 String[] arr3=new String[3]; 
        		 for(int i=0;i<3;i++) { //문자열타입은 값을안주면 null이들어감  	//null:가르키는대상이없다.		 
        			 System.out.println("arr3["+i+"]:"+arr3[i]);
        		 }
        		 
        		 arr3[0]="1월";
        		 arr3[1]="2월";
        		 arr3[2]="3월";
        		 
                     for(int i=0;i<3;i++) {
        			 
        			   System.out.println("arr3["+i+"]:"+arr3[i]);

                    }
        //////////////////////////////////////////////////////////////////////
                     char[] arr4=new char[3]; 
            		 for(int i=0;i<3;i++) { //캐릭터타입은 값을안주면 공백이들어감  			 
            			 System.out.println("arr4["+i+"]:"+arr4[i]);
            		 }
            		 
            		 arr4[0]='가';
            		 arr4[1]='나';
            		 arr4[2]='다';
            		 
                         for(int i=0;i<3;i++) {
            			 
            			   System.out.println("arr4["+i+"]:"+arr4[i]);

                        }
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
	}               
}