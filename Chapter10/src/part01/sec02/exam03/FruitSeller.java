package part01.sec02.exam03;

public class FruitSeller { // (���)���� ���
       int numOfApple=20;                    // Ŭ������ �����ϸ鼭 ���� �̸��ذ��
       int myMoney=0;
       final int APPLE_PRICE=1000;       //�ڹٿ����� final�� ������ ���̵��� �����Ұ�(�Ϲݺ����� �����ϱ����ؼ� �빮�ڷξ�)����
                    //���1���ǰ���
       
       public int saleApple(int money) { //����� �Ǹ��ϴ� ����
                int num=money/APPLE_PRICE; //������ �����ϱ�����  	  :/1000�����°��� ��������̾ƴϴ� 
                numOfApple-=num;
                myMoney+=money;             
                return num;
                
       }
       
       public void showSaleResult() {  // �ǸŸ� �������� ����
    	   System.out.println("���� ���: "+numOfApple);
    	   System.out.println("�Ǹ� ����: "+myMoney);
       }

}
