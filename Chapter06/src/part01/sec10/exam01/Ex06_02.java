package part01.sec10.exam01;

public class Ex06_02 {

	public static void main(String[] args) {
		int i; //���� ����(for���� ���º����� �ݺ��� �����Ѵٶ�¶�)
		//int j;
		
		//for�� if�� ���� ������ ������ ������ ù��° ��ɹ�
		for(i=0;i<5;i++) {// (�ʱ�ȭ;��;����)(�����̸���������) ������ġ���� �°�
			System.out.println("�ȳ��ϼ���? ���ۺ��� for���� ���� �� �Դϴ�.");
		}
		System.out.println("�ȳ��ϼ���2? ���ۺ��� for���� ���� �� �Դϴ�.");
		
		for(i=0;i<3;i++) { //i=5 => i=0���� �ʱ�ȭ 
			System.out.println("�ȳ��ϼ���?");
		    System.out.println("##�ݰ����ϴ�.");
		}
		System.out.println("i="+i);

	}

}
