package part01.sec01.exam01;

public class StringBuilderExample1_2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("���縦 �ϳ��� �Ƕ��� �Ĵٰ�");
        System.out.println(sb);
        System.out.println(sb.append(" Ŀ�ٶ� ���ε��� ������ ���b�� ����"));
        System.out.println(sb.insert(26,"�ϳ�"));
        System.out.println(sb.delete(21, 23));
        System.out.println(sb.deleteCharAt(9));
	}
	
}

/*
 *StringBuilder Ŭ������ ���ڿ� ���� �޼ҵ�
 *append(string str):���ڿ� �ڿ� str�� ������
 *insert(int offset,String set):���ڿ��� offset��ġ�� str�� ����
 *delete(int Start,int end):start���� end-1������ �κ� ���ڿ� ����
 *deleteCharAt(int inderx):inderx��ġ�� �ִ� �ϳ��� ���ڸ� ����
 *
 * Ư¡:�۾��� ���ο� ������(��ü)�� ������ �ʴ´�.
 */
