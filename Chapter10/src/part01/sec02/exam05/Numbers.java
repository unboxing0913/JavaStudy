package part01.sec02.exam05;

public class Numbers {
	int num[];
	
	
	Numbers(int num[]){
		this.num=num;
		
	}
	
	int getTotal() {
		int total=0;
		for(int cnt=0;cnt<num.length;cnt++) {
			total+=num[cnt];
		}
		    return total;
		
	}
	
	int getAverage() { //���		
		int average=getTotal()/num.length;
		return average;
	}   // ����� ����
	
         /* 
          * int total; 
          * total=getTotal();
          * int average=totalnum.length;
          * 
          * return average;                      
          */
}
