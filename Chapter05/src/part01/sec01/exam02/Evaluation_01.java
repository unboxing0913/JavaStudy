package part01.sec01.exam02;

import java.util.Scanner;

public class Evaluation_01 {

	public static void main(String[] args) {
              Scanner s=new Scanner(System.in);
              
              System.out.print("ù��° ���� �Է�:");
              int su1 = s.nextInt();
              System.out.print("�ι�° ���� �Է�:");
              int su2 = s.nextInt();
              System.out.print("����° ���� �Է�:");
              int su3 = s.nextInt();
              
              if(su2>su1&&su2>su3) { //213
            	  int imsi = su1;
                    su1 = su2;
                    su2 = imsi;
              }else if(su3>su1&&su3>su2) { // 312
            	   int imsi = su1;
            	   su1 = su3;
            	   su3 = imsi;
              }if(su2<su3){
                 int imsi = su2;
                  su2 = su3;
                  su3 = imsi;
              }s.close();
              
              
              
              System.out.printf("%d>=%d>=%d",su1,su2,su3);
	}

}
