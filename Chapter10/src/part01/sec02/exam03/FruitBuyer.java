package part01.sec02.exam03;

public class FruitBuyer { // (���������)��
      int myMoney=5000;
      int numOfApple=0;
      
      public void buyApple(FruitSeller seller,int money) { //����� �����ϴ� ����  (����,��)
    	  numOfApple+=seller.saleApple(money); //��� ���� �������� �޼ҵ�ȣ��
    	  myMoney-=money; // ������
    	  
      }
      
      public void showBuyResult() {
    	  System.out.println("���� �ܾ� : "+myMoney);
    	  System.out.println("��� ���� : "+numOfApple);
      }
      
	

}
