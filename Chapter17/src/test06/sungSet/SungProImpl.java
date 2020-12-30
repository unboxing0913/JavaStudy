package test06.sungSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SungProImpl implements SungPro{
   private HashSet<SungJuk> set;
   private Scanner in;
   
   SungProImpl(){
      set = new HashSet<SungJuk>();
      in = new Scanner(System.in);
      
   }

   public int inputSub(String str) {
        int sub;
        
        while(true) {
           System.out.print(str+"������ ������ �Է� :");
           sub=in.nextInt();
           if(sub<0 || sub>100) {
              System.out.println(str+"������ ������ 0������ 100�� �����Դϴ�.");
           }else {
              break;
           }
        }
           return sub;
        }
   
   @Override
   public void input() {
      System.out.println("�̸��� �Է� : ");
      String name=in.next();
      int kor=inputSub("����");
      int eng=inputSub("����");
      SungJuk input = new SungJuk(name,kor,eng);
      set.add(input);
      
   }
   
   public void rank() {
//      Iterator<SungJuk> it=set.iterator();
      for(Iterator<SungJuk> it1=set.iterator();it1.hasNext();) {
         SungJuk rank1= it1.next();
         rank1.clearRank();
         for(Iterator<SungJuk> it2=set.iterator();it2.hasNext();) {
            SungJuk rank2=it2.next();
            if(rank1.getTot()<rank2.getTot()) {
               rank1.plusRank();
            }
         }
      }
   }

   @Override
   public void view() {
      rank();
      Iterator<SungJuk> it = set.iterator();
      while(it.hasNext()) {
         SungJuk view = it.next();
         view.disp();
      }
      
   }

   @Override
   public void edit() {
      System.out.println("������ �л��� �̸� �Է�:");
      String name = in.next();
      Iterator<SungJuk> it = set.iterator();
      while(it.hasNext()) {
         SungJuk edit = it.next();
         if(name.equals(edit.getName())) {
            System.out.println(name+"���� ���� ���� ������"+edit.getKor()+"�� �Դϴ�.");
            int kor=inputSub("������ ��������");
            System.out.println(name+"���� ���� ���� ������"+edit.getEng()+"�� �Դϴ�.");
            int eng=inputSub("������ ��������");
            edit.setKor(kor);
            edit.setEng(eng);
            edit.setTot();
            System.out.println(name+"�л��� ������ �����Ͽ����ϴ�.");
         }       
      }
      System.out.println(name+"���� ���� 0�л��̾ƴմϴ�.");
      
   }

   @Override
   public void delete() {
      System.out.println("������ �л��� �̸� �Է�:");
      String name = in.next();
      Iterator<SungJuk> it=set.iterator();
      while(it.hasNext()) {
        SungJuk delete = it.next();
        if(name.contains(delete.getName())) {
           set.remove(delete);
           System.out.println(name+"�л��� �����Ͽ����ϴ�.");
           return;
        }
      }
      System.out.println(name+"���� ���� �л��� �ƴմϴ�.");
      
   }

   @Override
   public void exit() {
      System.out.println("���α׷� ����.");
      System.exit(0);
      
   }

}