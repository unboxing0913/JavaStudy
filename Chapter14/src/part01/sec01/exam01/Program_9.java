package part01.sec01.exam01;

public class Program_9 {

	public static void main(String[] args) {
		Object[] arr=new Object[5];//���Ŭ������ ���� Object[] �θ�Ÿ������ ������������ ���ؼ� �����ϴ�(��ü�ϰ��)
		arr[0]="������";
		arr[1]=new Integer(52);
		arr[2]=3.14;
		arr[3]=new Character('��');
		arr[4]=true;
		
		for(int cnt=0;cnt<arr.length;cnt++) {
			System.out.println(arr[cnt]);
		}
	}

}
