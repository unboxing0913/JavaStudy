package part01.sec02.exam08;

public class Employee_6 { // °í¿ëÀÎ
	
	private int myMoney;
	
	
	public Employee_6(int money) {
		myMoney=money;
	}
	
	public void earnMoney(int money) {
		myMoney+=money;
	}
	
	public void showMyMoney() {
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
