package test07.playMap;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class PlayProImpl implements PlayPro {
	
	private Hashtable<String,Hashtable<String,Player>> ht;
	private Scanner in;

	
    public PlayProImpl(){
		ht = new Hashtable<>(); //
		String data[]=new String[] {"한화","LG","두산","기아","롯데"};
		for(int i=0;i<data.length;i++) {
			ht.put(data[i],new Hashtable<String,Player>());			/*구단*/	
		}
		in = new Scanner(System.in);		
		
	}

	
	@Override
	public void input() {
		System.out.println("구단을 입력 : ");
		String club = in.next();
		Hashtable<String,Player> ht2=ht.get(club);/*구단이름으로 해쉬테이블객체를 가져온다 (선수소속테이블) */
		/*선수 정보 필요*/
		System.out.print("선수 이름을 입력 ");
		String name = in.next();
		System.out.println(name+"선수 연봉을 입력 ");
		int salary = in.nextInt();
		Player player=new Player(name,club,salary);
		ht2.put(name, player); //선수정보기때문에 name <String,Player>
		ht.put(club,ht2); // 구단 <String,Hashtable...>
		
	}

	@Override
	public void view() {
		System.out.println("구단을 입력"); 
		String club=in.next();
		Hashtable<String,Player> ht2=ht.get(club);
		Enumeration<String>enu = ht2.keys();
		while(enu.hasMoreElements()) {
			String key = enu.nextElement();
			Player view = ht2.get(key);
			view.disp();
		}
/*		Enumeration<String> enu=ht.keys();
		if(club.equals(enu)){	
		     while(enu.hasMoreElements()) {
		    	 String key = enu.nextElement();
			     Hashtable<String,Player> ht2=ht.get(club);   //위치
		    	 Player view = ht2.get(key);
		    	 view.disp();
		     }
		} */
	}

	@Override
	public void delete(){
	     System.out.print("구단을 입력 : ");
	     String club=in.next();
	 	 Hashtable<String,Player> ht2=ht.get(club); /*구단선수정보를 얻어옴*/
	     System.out.print("삭제할 선수의 이름을 입력");
	     String name=in.next();
	     Enumeration<String>enu = ht2.keys();
	     if(ht2.containsKey(name)) { /*ht2에 name이라는 Key가 존재하는가 t/f */
	    	 ht2.remove(name);
	    	 System.out.println(club+"구단의 "+name+"선수를 삭제하였습니다.");	    	 
	     }else {	     
	     System.out.println(club+"구단에는"+name+"선수가 없습니다.");
	     }		
	}

	@Override
	public void edit() {
		System.out.print("구단을 입력 : ");
		String club=in.next();
		Hashtable<String,Player> ht2=ht.get(club);
		System.out.print("타구단으로 이적할 선수 이름 : ");
		String name = in.next();
		if(ht2.contains(name)) {
			System.out.print("이적할 구단의 이름을 입력 : ");
			String club2=in.next();
			Hashtable<String,Player> ht3=ht.get(club2); // 자리마련
			ht3.put(name,ht2.get(name));/*기존에 만들어진사람이 옮겨지는것*/
			ht2.remove(name);/*이적이후 선수 지워주기*/
			System.out.println(name+"선수를 "+club+"구단에서 "+club2+"구단으로 옮겼습니다.");				
		}else {
			System.out.println(club+"구단에는 "+name+"선수가 없습니다.");
		}		
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
		
	}

}
