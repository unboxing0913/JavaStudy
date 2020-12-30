package part01.sec02.exam08;

public class Employer_6 { //╟М©Каж
     
	  private int myMoney;
      
      public Employer_6(int money) {
    	  myMoney=money;
      }
      
      public void payForWork(Employee_6 emp,int money) {
    	  if(myMoney<money) {
    		  return;
    	  }
    	  emp.earnMoney(money);
    	  myMoney-=money;
      }
      
      public void showMoney() {
    	  System.out.println(myMoney);
      }
      
   	public static void main(String[] args) {
		Employer_6 emr = new Employer_6(3000);
		Employee_6 eme = new Employee_6(0);
		
		
		
		emr.payForWork(eme,1000);
		eme.earnMoney(1000);
		emr.showMoney();
		eme.showMyMoney();
  	 }
}
