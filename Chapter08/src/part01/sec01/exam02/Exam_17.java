package part01.sec01.exam02;

import java.util.Scanner;

public class Exam_17 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int arr[]=new int[5]; // []���� 0,1,2,3,4  // ��ġ�� ����(����)�� �ٸ�
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {		
			System.out.print((i+1)+"��° ���� �Է�:");
		    arr[i]=s.nextInt();	    		
            sum+=arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		   
		
		     System.out.println("�հ� : "+sum);
             
    //}System.out.printf("%d, %d, %d, %d, %d, �հ� : %d",arr[0],arr[1],arr[2],arr[3],arr[4],sum);
       s.close();
}
}