package model.dao; /*DB에서 저장된내용을 갖고와서 저장하는 클래스*/

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.vo.Coffee;

public class CoffeeDao {/*Dao : 저장된 데이터를 가져온 클래스를 모아놓은것*/
	
	
	
	
	public ArrayList<Coffee> openList(){//주문리스트 불러오기      /*반환타입이ArrayList<Coffee>인 메소드*/
		// 불러온 주문 리스트를 담을 수 있는 객체 선언
		ArrayList<Coffee> list= new ArrayList<Coffee>();
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("coffee.dat"))){
		  while(in.available() != -1) {/*가져올데이터가없을때 (!=-1 이기때문에 true 있을때)*/
			  list.add((Coffee) in.readObject());
		  }
			
		}catch(EOFException e) {     /*다중catch문 (내림)*/
			System.out.println("불러오기 성공하였습니다.");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		return list;
		
	}
	
	
	
	
	public int saveList(ArrayList<Coffee> list) { // 주문 리스트 저장 용도
		int result=-1;                   /*ObjcetOutputStream : 객체직렬화 (객체를2진파일로 바꿔서 저장) , 보통2진파일의 확장자는 .dat*/
		   /*객체를 파일로 저장하기위해서 ObjectOutputStream이 필요함 ObjectOutputStream도 FileOutputStream의 도움이필요함*/
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("coffee.dat"));){ /*coffee.dat파일에 고객의리스트를 저장을 해라*/
			for(Coffee co:list) {     /*try(......){ : 객체 직렬화 문법 */
				out.writeObject(co);/*()안의 객체를 저장*/
			}
			
			result = 1 ;
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		return result;
	}
	
	public void outStream(ObjectOutputStream out,Coffee co) {
		try {
			out.writeObject(co);			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
