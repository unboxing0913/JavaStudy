package part01.sec01.exam01;

public class ArrayVarTest1_1 {

	public static void main(String[] args) {
		int arr1[]= {1,2,3};
		int arr2[]=arr1;// arr1�� �̹� �迭�� ����Ǿ��⶧���� ���ȣ�� �Ⱦ��� �����Ѵ� (Ư����ġ�� ��Ÿ���� ����)
		for(int cnt=0;cnt<arr2.length;cnt++) {
			System.out.println(arr2[cnt]);// 1 2 3
		}
		arr2[1]=7; //=>���� �ּҰ��� ����Ű�⶧���� arr1�� ����
		//arr1=null;  //null:�ƹ� �����͵� ����Ű�� �ʴ� ������
		for(int cnt=0;cnt<arr1.length;cnt++) {
			System.out.println(arr1[cnt]);
		}

	}

}

/*
      �迭�� ���۷��� Ÿ���̱� ������ ������ �������� ����ȴ�.
      �׸��� �迭 ������ �ٸ� �迭�� �����ϸ� �� ������ ���� �迭�� ����Ų�� 
*/