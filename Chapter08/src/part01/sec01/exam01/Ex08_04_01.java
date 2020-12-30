package part01.sec01.exam01;

public class Ex08_04_01 {

	public static void main(String[] args) {
		int[] scores= {83,90,87}; //[2]ÀÎ¼À 0,1,2=> 3°³
		int hap=0;
		double avg=0;
		System.out.println("scores[0]:"+scores[0]);
		System.out.println("scores[1]:"+scores[1]);
		System.out.println("scores[2]:"+scores[2]);
		
		for(int i=0;i<=2;i++) {				
			hap+=scores[i];			
		}
		  System.out.println("ÃÑÇÕ : "+hap);
		  avg=(double)hap/3;
		  System.out.println("Æò±Õ : "+avg);
		

	}

}
