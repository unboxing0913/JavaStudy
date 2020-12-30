package part01.sec01.exam01;
//실행안됨 괄호볼것
public class IrregularArray {

	public static void main(String[] args) {
		
           int intArray[][]=new int[4][];	
           
           intArray[0]=new int[3];
           intArray[1]=new int[2];
           intArray[2]=new int[3];
           intArray[3]=new int[2];
           
           for(int i=0;i<intArray.length;i++) {//0,1,2,3
 		      for(int j=0;j<intArray[i].length;j++) {
 		    	  intArray[i][j]=i+1*10 + j; //i+1이유 => 0*10=10 때문
 		      }
           }
           
           
           for(int i=0;i<intArray.length;i++) {
        	   for(int j=0;j<intArray[i].length;j++) { 
        	    System.out.print(intArray[i][j]+" ");
        	   }System.out.println();
           }
		
}
	}
