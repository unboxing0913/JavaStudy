package part01.sec02.exam03;
/*
abstract class PersonalNumberStorage{
	
	public abstract void addPersonalInfo(String name,String perNum);
	public abstract String searchName(String perNum);
	
}
*/

interface PersonalNumberStorage{ //�������̽��ι����� class ������
	//interface => ���(inplements)�̸���
	//�������̽� ���� ����� ������ ������ public static final ����
	//�������̽� ���� ����� �޼���� ������ public abstract ����
	/*public abstract*/ void addPersonalInfo(String name,String perNum);
	/*public abstract*/ String searchName(String perNum);
	//���ǰ��ִ°���
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
class PersonalNumberStorageImpl implements PersonalNumberStorage{ //�������̽��� ���implements�� ����
	PersonalNumInfo[] perArr; //Ŭ�����迭����
	int numOfPerInfo;
	
	public PersonalNumberStorageImpl(int sz) {                       //=>��ü�� ��ü ����
		perArr=new PersonalNumInfo[sz];//������ ���ؼ� ��ü����(����)
		numOfPerInfo=0;
		
	}

	@Override
	public void addPersonalInfo(String name, String perNum) {
		perArr[numOfPerInfo]=new PersonalNumInfo(name,perNum); // (�ּҰ�����)
	       numOfPerInfo++;
	    }
	

	@Override
	public String searchName(String perNum) {
		 for(int i=0;i<numOfPerInfo;i++){//numOfPerInfo���� �����ؾ� ���������� �����Ҽ�����
		if(perArr[i].number.equals(perNum)) {  
//		if(perNum.compareTo(perArr[i].getNumber())==0) { // �ΰ������
			return perArr[i].getName();
		} 	   
		 
		    
		
	}
		 return null;
}
}
public class Abstractinterface_1{
	

	public static void main(String[] args) {
		PersonalNumberStorage storage=new PersonalNumberStorageImpl(100);
		storage.addPersonalInfo("��⵿", "950000-1122333");
		storage.addPersonalInfo("����", "970000-1122334");
		
		System.out.println(storage.searchName("950000-1122333"));
		System.out.println(storage.searchName("970000-1122334"));
	}

}
