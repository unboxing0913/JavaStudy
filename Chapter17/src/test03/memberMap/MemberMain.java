package test03.memberMap;

import java.io.IOException;

import test02.sungList.SungPro;
import test02.sungList.SungProImpl;

public class MemberMain {

	public static void main(String[] args) throws IOException {
		
		      MemberPro pro=new MemberProImpl();
	     
		while(true) {
			System.out.println("1.입력 2.출력 3.삭제 4.수정 5.종료");
			int select=System.in.read()-48;
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
		    default:
		    	System.out.println("잘못 입력하셨습니다.");
			    
			}
		}

	}

}
