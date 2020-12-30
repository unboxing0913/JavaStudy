package part01.sec01.exam01;

//2020. 10. 6. ���� 12:29:17 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Inp implements Comparable<Inp>{

private String name;
private int kor;
private int eng;
private int result;
private int rank;

public Inp(String name, int kor, int eng, int rank) {
   this.name = name;
   this.kor = kor;
   this.eng = eng;
   this.rank = rank;
}

public String getName() {
   return name;
}
public int getResult() {
   return kor + eng;
}

public int getRank() {
   return rank;
}

public void setRank(int rank) {
   this.rank = rank;
}

@Override
public int compareTo(Inp o) {
   return this.name.compareTo(o.name);
}

}

public class ArrayListExample_{

 
	
	public static void main(String[] args) {

   Scanner s = new Scanner(System.in);

   ArrayList<Inp> aList = new ArrayList<Inp>();

   System.out.print("�̸� : ");
   String sName = s.nextLine();
   System.out.print("�������� : ");
   String sKor = s.nextLine();
   System.out.print("�������� : ");
   String sEng = s.nextLine();
   
   String[] ss1 = sName.split(",");
   String[] ss2 = sKor.split(",");
   String[] ss3 = sEng.split(",");

   for (int i = 0; i < ss1.length; i++) {   // ������ ���� �� �迭 �ۼ�
      Inp inputN = new Inp(ss1[i], Integer.parseInt(ss2[i]), Integer.parseInt(ss3[i]), 1);
      aList.add(inputN);
   }   // for(int i)

   for (int i = 0; i < aList.size(); i++) {   // �迭 �� ���� ����
      int rank = 1;
      for (int j = 0; j < aList.size(); j++) {
         if (aList.get(i).getResult() < aList.get(j).getResult())
            aList.get(i).setRank(++rank);

      } // for(int j)

   } // for (int i)
   Collections.sort(aList);
   
   for (int i = 0; i < aList.size(); i++) {   // �迭 �� ���
      System.out.println("�̸� : " + aList.get(i).getName() + ", ���� : " + aList.get(i).getResult() + ", ���� : "
            + aList.get(i).getRank());
   }

}

}