package part01.sec01.exam01;

public class MainParameter {
                                    //��Ŭ�� -> RunAs -> Runconfigurations..-> arguments -> program arguments �Է�
	public static void main(String[] args) {//�Ű����� => �ܺηκ��� ���� ���޹޴� ����
	    double sum=0.0;
	    
	    for(int i=0;i<args.length;i++) {
	    	sum+=Double.parseDouble(args[i]); //���ڿ��� �Ǽ��� ��ȯ�Ͽ� �ش�.
	    }
	    	System.out.println("�հ� :"+sum);
	    	System.out.println("��� :"+sum/args.length);
	    
	}

}
