package part01.sec02.exam05;

public class MethodExample2 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		Numbers obj = new Numbers(arr);
		int total=obj.getTotal();
		int average=obj.getAverage();
		
		System.out.println("�հ�="+total); //550
		System.out.println("���="+average); // 55
	}

}
