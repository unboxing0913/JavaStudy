package part01.sec02.exam02;

public class ClassExample1 {

	public static void main(String[] args) {
		GoodsStock obj; //��������
		obj=new GoodsStock(); // ���߿� ���οü����
		obj.goodsCode="52135";
		obj.stockNum=200;
		
		System.out.println("��ǰ�ڵ�:"+obj.goodsCode);
		System.out.println("������:"+obj.stockNum);
		obj.addStock(1000);
		//obj.subtractStock(500); // ����ʱ�ȭ ��Ű�°�?
		System.out.println("��ǰ�ڵ�:"+obj.goodsCode);
		System.out.println("������:"+obj.stockNum);
		
	}

}
