package part01.sec03.exam01;

import java.util.Scanner;

public class Exam_00 {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("���� ������ �Է� : ");
      int roomsu = in.nextInt();

      boolean room[] = new boolean[roomsu]; // ���:false �����:true

      while (true) {
         System.out.print("1.�Խ� 2.��� 3.���� 4.���� : ");
         int select = in.nextInt();
         if (select == 4)
            break;
         int roomNum;
         boolean check = true;

         switch (select) {
         case 1:
            do {
               System.out.print("�Խ��Ͻ� ���� ��ȣ�� �Է� : ");
               roomNum = in.nextInt();
               if (roomNum < 1 || roomNum > roomsu)
                  System.out.println(roomNum + "ȣ���� �����ϴ�.");
               else {
                  check = false;//
               }
            } while (check);

            if (room[roomNum - 1]) {
               System.out.println(roomNum + "ȣ���� ���� ����� �Դϴ�.");
            } else {
               room[roomNum - 1] = true;//
               System.out.println(roomNum + "ȣ�ǿ� �Խ��ϼ̽��ϴ�.");
            }
            break;
         case 2:
            do {
               System.out.print("����Ͻ� ���� ��ȣ�� �Է� : ");
               roomNum = in.nextInt();
               if (roomNum < 1 || roomNum > roomsu)
                  System.out.println(roomNum + "ȣ���� �����ϴ�.");
               else {
                  check = false;//
               }
            } while (check);
            if (room[roomNum - 1]) {
               room[roomNum - 1] = false;
               System.out.println(roomNum + "ȣ�ǿ��� ����ϼ̽��ϴ�.");
            } else {
               System.out.println(roomNum + "ȣ���� ����Դϴ�.");
            }

            break;
         case 3:
            for(int i=0;i<room.length;i++) {
               if(room[i]) {
                  System.out.println(i+1 + "���� ����� �Դϴ�.");
               }else {
                  System.out.println(i+1 + "���� ��� �Դϴ�.");
               }         
            }
            break;
         default:
            System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
         }
         
      }
      System.out.println("���α׷��� �����մϴ�.");
   }

}