package part01.sec02.exam01;

import java.io.IOException;
import java.util.Scanner;

class Member2{
	protected String name; //상속받은 자식 클래스에서만 접근 허용
	protected String tel;
	
	Member2(String name,String tel){
		this.name=name;
		this.tel=tel;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	void disp() {
		System.out.println(name+"님의 전화번호는 "+tel+"번 입니다.");
	}

}

class Member3 extends Member2{
    
	private String addr;
	
	Member3(String name, String tel,String addr) {
		super(name, tel);
		this.addr=addr;
		
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public void disp() {
		System.out.println(name+"님의 전화번호는 "+tel+"번이고, 주소는"+addr+"입니다.");
		
	}

}

class MemberPro{
	private Member3 mb[];
	//private int increment=3; 배열의 크기를 증가시키려는 용도
	private int po; //인덱스용
	Scanner s=new Scanner(System.in);
	
	public MemberPro() {
		mb=new Member3[5];
		po=0;
	}
	
	public void input() { // 자기할일 다하면 사라짐
		System.out.print("이름을 입력 : ");
		String name=s.next();
		System.out.print("전화번호를 입력:");
		String tel=s.next();
		System.out.print("주소를 입력: ");
		String addr=s.next();	
		mb[po]=new Member3(name, tel, addr); //
		po++; //0에서 값을증가시켜줘야 배열값이증가하게
		
		/*if(po==mb.length) { // po가 배열의 길이와 같아지면 if문실행         // mb2는 if문안에서 실행됬기때문에 끝나면 사라짐
			Member3 mb2[]=new Member3[mb.length+increment]; //배열 mb2 생성
			for(int i=0;i<mb.length;i++) {
				mb2[i]=mb[i];
			}	
			                                     //배열을 증가시키지않으려면 필요가없음
			 mb=mb2;//
		  }	 */
	}
	
	public void view() { //출력
		for(int i=0;i<po;i++) {
			mb[i].disp();
		}	
	}
	
	public void delete() {//옆의주소를 이용해서 덮어씌워서 삭제처리해야함
		System.out.print("삭제할 회원의 이름 : ");
		String name = s.next();
		
		for(int i=0;i<po;i++) { //입력된 수만큼만 반복   //po값은 5증가되어서 내려옴
			if(mb[i].name.equals(name)) {//이름 비교		equals		
				for(int j=i;j<po-1;j++) { // 이름이같으면   // 위치중요함 i를 위치로잡고
					mb[j]=mb[j+1]; // 옆의것을 당겨오는 의미    /?:마지막5는 똑같은값을 중복해서같는건가?
				}
				    po--;//for문으로 한칸씩 땡겨오고 중복된 마지막것을 빼주기위해
				    System.out.println(name+"회원님을 삭제하였습니다.");
				    return; //밑으로 내려가기전 종료
			}
		}
		System.out.println(name+"님은 저희 회원이 아닙니다.");
		
	}
	
	public void edit() {
		
		System.out.println("수정할 회원의 이름을 입력: ");
		String name=s.next();
		
		for(int i=0;i<po;i++) {
			if(mb[i].name.equals(name)) {				
				System.out.println("현재"+name+"님의 전화번호는"+mb[i].getTel()+"번 입니다.");
				System.out.print("수정할 전화번호 : ");
				String tel=s.next();
				mb[i].setTel(tel);				
			    System.out.println(name+"님의 전화번호를 수정하였습니다.");
			    return;
			}
		}
		System.out.println(name+"님은 저희 회원이 아닙니다.");
	}
	  
	public void exit() {
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
	}
 
}


public class Exam_12 {

	public static void main(String[] args) throws IOException {
		MemberPro pro=new MemberPro();
		
		while(true) {
			System.out.print("1.입력 2.출력 3.삭제 4.수정 5.종료 :");
			int select = System.in.read()-48;
			System.in.skip(2);
			
			switch(select) {
			case 1:
				pro.input();
				break;
			case 2:
				pro.view();
				break;
			case 3:
				pro.delete();
				break;
			case 4:
				pro.edit();
				break;
			case 5:
				pro.exit();
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
	}

}
