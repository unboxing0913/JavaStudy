package test07.playMap;

import java.io.IOException;

public class PlayMain {

	public static void main(String[] args) throws IOException {
		PlayPro pro = new PlayProImpl();
		
		while(true) {
			System.out.print("1.�Է� 2.��� 3.���� 4.���� 5.����");
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
		    	System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}

	}

}
