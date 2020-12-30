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
           System.out.print(str+"과목의 점수를 입력 :");
           sub=in.nextInt();
           if(sub<0 || sub>100) {
              System.out.println(str+"과목의 점수는 0점에서 100점 사이입니다.");
           }else {
              break;
           }
        }
           return sub;
        }
   
   @Override
   public void input() {
      System.out.println("이름을 입력 : ");
      String name=in.next();
      int kor=inputSub("국어");
      int eng=inputSub("영어");
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
      System.out.println("수정할 학생의 이름 입력:");
      String name = in.next();
      Iterator<SungJuk> it = set.iterator();
      while(it.hasNext()) {
         SungJuk edit = it.next();
         if(name.equals(edit.getName())) {
            System.out.println(name+"님의 현재 국어 점수는"+edit.getKor()+"점 입니다.");
            int kor=inputSub("수정할 국어점수");
            System.out.println(name+"님의 현재 영어 점수는"+edit.getEng()+"점 입니다.");
            int eng=inputSub("수정할 영어점수");
            edit.setKor(kor);
            edit.setEng(eng);
            edit.setTot();
            System.out.println(name+"학생의 성적을 수정하였습니다.");
         }       
      }
      System.out.println(name+"님은 저희 0학생이아닙니다.");
      
   }

   @Override
   public void delete() {
      System.out.println("삭제할 학생의 이름 입력:");
      String name = in.next();
      Iterator<SungJuk> it=set.iterator();
      while(it.hasNext()) {
        SungJuk delete = it.next();
        if(name.contains(delete.getName())) {
           set.remove(delete);
           System.out.println(name+"학생을 삭제하였습니다.");
           return;
        }
      }
      System.out.println(name+"님은 저희 학생이 아닙니다.");
      
   }

   @Override
   public void exit() {
      System.out.println("프로그램 종료.");
      System.exit(0);
      
   }

}