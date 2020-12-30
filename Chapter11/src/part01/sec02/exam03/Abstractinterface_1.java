package part01.sec02.exam03;
/*
abstract class PersonalNumberStorage{
	
	public abstract void addPersonalInfo(String name,String perNum);
	public abstract String searchName(String perNum);
	
}
*/

interface PersonalNumberStorage{ //인터페이스로받을땐 class 안적고
	//interface => 상속(inplements)이목적
	//인터페이스 내에 선언된 변수는 무조건 public static final 선언
	//인터페이스 내에 선언된 메서드는 무조건 public abstract 선언
	/*public abstract*/ void addPersonalInfo(String name,String perNum);
	/*public abstract*/ String searchName(String perNum);
	//사용되고있는것임
}

class PersonalNumInfo{
	String name;
	String number;
	
	PersonalNumInfo(String name,String number){
		this.name=name;
		this.number=number;
		
	}

	String getName() {
		return name;
	}

	String getNumber() {
		return number;
	}
		
}
/*class PersonalNumberStorageImpl extends PersonalNumberStorage{*/
class PersonalNumberStorageImpl implements PersonalNumberStorage{ //인터페이스시 상속implements로 받음
	PersonalNumInfo[] perArr; //클래스배열선언
	int numOfPerInfo;
	
	public PersonalNumberStorageImpl(int sz) {                       //=>객체와 객체 연결
		perArr=new PersonalNumInfo[sz];//생성자 통해서 객체생성(번지)
		numOfPerInfo=0;
		
	}

	@Override
	public void addPersonalInfo(String name, String perNum) {
		perArr[numOfPerInfo]=new PersonalNumInfo(name,perNum); // (주소값생성)
	       numOfPerInfo++;
	    }
	

	@Override
	public String searchName(String perNum) {
		 for(int i=0;i<numOfPerInfo;i++){//numOfPerInfo까지 증가해야 딱떨어지게 설계할수있음
		if(perArr[i].number.equals(perNum)) {  
//		if(perNum.compareTo(perArr[i].getNumber())==0) { // 두가지방법
			return perArr[i].getName();
		} 	   
		 
		    
		
	}
		 return null;
}
}
public class Abstractinterface_1{
	

	public static void main(String[] args) {
		PersonalNumberStorage storage=new PersonalNumberStorageImpl(100);
		storage.addPersonalInfo("김기동", "950000-1122333");
		storage.addPersonalInfo("장산길", "970000-1122334");
		
		System.out.println(storage.searchName("950000-1122333"));
		System.out.println(storage.searchName("970000-1122334"));
	}

}
