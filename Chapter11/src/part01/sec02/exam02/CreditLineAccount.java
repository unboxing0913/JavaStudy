package part01.sec02.exam02;

public class CreditLineAccount extends Account { //���̳ʽ� ����
	int creditLine;

	CreditLineAccount(String accountNo,String ownerName,int balance,int creditLine){
		super(accountNo,ownerName,balance);
		this.creditLine=creditLine;
		
	
	}
	
	int withdraw(int amount) throws Exception { // �������̵� �Ұ�� �θ� �޼���� ������
		if((balance+creditLine)<amount) {
			throw new Exception("������ �Ұ����մϴ�.");
		}
		    balance-=amount;
			return amount;
		
	}
	
}
