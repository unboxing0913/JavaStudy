package part01.sec01.exam02;

class GoodsStock{
	String goodsCode;
	int stockNum;
	
	GoodsStock(String goodsCode,int stockNum){
		this.goodsCode=goodsCode;
		this.stockNum=stockNum;
	}
	
	public String toString(){
		return "��ǰ�ڵ� :"+goodsCode+"������:"+stockNum;
	}
}

public class ObjectExample2_1 {

	public static void main(String[] args) {
		GoodsStock obj=new GoodsStock("57923",100);
       // String str=obj.toString(); // ��ü�� ���ڿ��ι޾ƺ���ʹ�
		String str="�������:"+obj;//�������̵� �؇J�� ������ toString();���ص� ����̵�
        System.out.println(str);// ��ǰ�ڵ�:57923 ������:100
        System.out.println(obj);
	}

}
