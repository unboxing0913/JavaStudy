package part01.sec01.exam01;

public class Ex08_10_01 {
                  // void => ��ȯ���� ����
	public static void main(String[] args) {//main�޼ҵ�� jvm�� ȣ���ϴ°�
		int intArray[];     //�޼ҵ� ��ȣ�ȿ� ����Ⱥ����� �Ű�����
		intArray=makeArray(); //ȣ��
		//temp�� �ּҰ��� ���� ex)100����
		for(int i=0;i<intArray.length;i++) 
			System.out.println(intArray[i]);
		
	}
	           //int[]�� ��ȯŸ��(�ڷ���) => temp�� ������ �迭�̴ٸ� �˷��ִ°� // []������ �׳� ������
		static int[] makeArray() {  //�޼ҵ�� ��ȣ���־����(){} //ȣ���
			
			int temp[]=new int[4];
			
			for(int i=0;i<temp.length;i++)
				temp[i]=i;
				
				return temp;//ȣ���� �޼ҵ�� �����ְ� ����    //return �ϳ��������� �׳�����
		               //temp�� �ּҰ��� �ǳ��� ex)100����

	}

}
