package part01.sec01.exam01;

public class Ex08_09_01 {
 //���ذ��Ȱ�
	public static void main(String[] args) {
		           //[3][4]
		int intArray[][]= {{90,90,110,110},{120,110,100,90},{120,140,130,150}};
		double sum=0;
		
		System.out.println(intArray.length); //12���� 3����� ==> �߰����̺����ִٰ� �����ؾ���		
		//System.out.println(intArray[0].length); //�迭[0]�� ���� �߰����̺��� ���ļ�
	    for(int i=0;i<intArray.length;i++) { //�ٸ������� �ٽ� // �߰����̺��� ��
	    	//System.out.println(intArray[i].length);
	    	for(int j=0;j<intArray[i].length;j++) {//�ٸ������� �ٽ� //intArray[i]=>�߰����̺��� ���� ����
	    		sum+=intArray[i][j];
	    		 
	    	}
	    }
		System.out.println("���� 3�Ⱓ ���� �Ѿ�"+sum+"�̸� ����� �����Ѿ���"+sum/intArray.length+"�Դϴ�.");
		

	}

}
                   //���ñ��� �������� ���� �������´�. 