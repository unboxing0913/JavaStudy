package part01.sec01.exam01;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable{
	
	String name;
	int kor;
	int eng;
	int rank;
	
	Student(String name,int kor , int eng){
		this.name = name;
		this.kor=kor;
		this.eng=eng;
	}

	public int getTotal() {		    
			return kor+eng;				
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}


	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}



	@Override
	public int compareTo(Object o) {
		return this.name.compareTo(o.name);
	}

}
	
	
	



public class ArrayListExameple {
	
public static void main(String[] args) {
	        
	      	
	        ArrayList<Student> members = new ArrayList<Student>();
	        Student student1 = new Student("홍길동",60,75);
	        members.add(student1);
	        Student student2 = new Student("강호동",70,80);
	        members.add(student2);
	        Student student3 = new Student("유재석",80,55);
	        members.add(student3);
	        Student student4 = new Student("박명수",90,100);
	        members.add(student4);  
	        
	        
	        
	        
	        for(int i=0;i<members.size();i++) {
	        	  int rank=1;
	        	  for(int j=0;j<members.size();j++) {
	        		 if(members.get(i).getTotal() < members.get(j).getTotal()) 
	        			  members.get(i).setRank(++rank);		  	        	    	       
	        	 }
	        		 members.get(i).setRank(rank);			  	        	 
	         }	    
	        
	        Collections.sort(members);
	        
	        for (Student n : members) {
                System.out.println(n.getName()+"님의 총점은"+n.getTotal()+"이고 순위는"+n.rank+"입니다.");                                                 
	    	}         
	}
}
 
