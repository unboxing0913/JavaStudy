package part01.sec02.exam07;

class AccessWay{
	static int num=0; //��ü�� ������� ������ ������ ������� // �ٸ����� Ŭ��������
	
	AccessWay(){
		incrCnt(); // ������ �ȿ��� �޼ҵ�ȣ��
	}
	
	public void incrCnt() {
		num++;
	}
}

public class ClassVearAccess_2 {

	public static void main(String[] args) {
		AccessWay way=new AccessWay(); // num==>1
		way.num++; // num==>2
		AccessWay.num++; // num==>3           : Ŭ�����̸����� (�߿�)
		AccessWay way2=new AccessWay(); // num==>4
		way2.num++; // num==>5
		
		System.out.println("num="+AccessWay.num); // => static ��ü����� ����Ҽ��ִ�. /���ٹ� : Ŭ�����̸����� ����
		//System.out.println("num="+way.num);
		
	}

}
