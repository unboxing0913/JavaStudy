package part01.sec01.exam02;

public class CheckingAccount extends Account{ //Account �� ��ӹ޴� CheckingAccountŬ����
	String cardNo; //ī���ȣ
	
	int pay(String cardNo,int amount)throws Exception{ //ī���ȣ �Ѱܹ�����
		if(!(cardNo.equals(this.cardNo)&&(balance > amount))) { // �Ѿ��ī���ȣ�� ���簴ü�� ī���ȣ�� ����
		throw new Exception("������ �Ұ��� �մϴ�.");                // && => ||
		}
		return withdraw(amount);
	}

}
