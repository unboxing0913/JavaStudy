package part01.sec01.exam06;

public class BonusPointAccount extends Account {
    //�������̵� : �޼ҵ������� => ��ӿ����� ���� 
	int bonusPoint;
	
	BonusPointAccount(String accountNo, String ownerName, int balance , int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint=bonusPoint;
	}
	
	void deposit(int amount) {
		super.deposit(amount); // �θ������ִ� �޼ҵ�ȣ�� : �θ��Ǹ޼ҵ嵵 ó����
		bonusPoint+=(int)(amount*0.001); // ��������
		             //�Ҽ��� �ڸ������� int�� ĳ����
	}

	public static void main(String[] args) {
	

	}

}
