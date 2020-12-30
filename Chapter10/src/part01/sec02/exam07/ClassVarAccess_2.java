package part01.sec02.exam07;

class AccessWay {
	static int num=0;
	
	AccessWay() {
		incrCnt();
	}
	public void incrCnt() {
		num++;
	}
}
public class ClassVarAccess_2 {

	public static void main(String[] args) {
		AccessWay way=new AccessWay();	//num==1
		way.num++;						//num==2
		AccessWay.num++;				//num==3		//중요
		System.out.println("num="+AccessWay.num); 		//중요
		//System.out.println("num="+way.num);
		
	}

}
