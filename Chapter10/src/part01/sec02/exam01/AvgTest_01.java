package part01.sec02.exam01;


class Avg{
	String name;
	int avg;
	
	public String average(int kor,int eng) {              //��ȯŸ�� String������ ��
		avg=(kor+eng)/2;
		//�ʵ忡�ִ� avg������
		return name+avg;                                        //���ڿ�+����(����)
	}    //��ȯ�ϴ°� ��ü�� �̸�+      
}





public class AvgTest_01 {

	public static void main(String[] args) {
	       Avg student1=new Avg();
	       Avg student2=new Avg();
	       
	       student1.name="��ö��";      //�ʵ�� ���ְ�
	       student2.name="�迵��";
	       
	       String st1_avg=student1.average(70, 80); //average �������� �޼ҵ�
	       String st2_avg=student2.average(80, 90);
	       
	      System.out.println(st1_avg);
	      System.out.println(st2_avg);
		
	}

}
