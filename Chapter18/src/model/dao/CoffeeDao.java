package model.dao; /*DB���� ����ȳ����� ����ͼ� �����ϴ� Ŭ����*/

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.vo.Coffee;

public class CoffeeDao {/*Dao : ����� �����͸� ������ Ŭ������ ��Ƴ�����*/
	
	
	
	
	public ArrayList<Coffee> openList(){//�ֹ�����Ʈ �ҷ�����      /*��ȯŸ����ArrayList<Coffee>�� �޼ҵ�*/
		// �ҷ��� �ֹ� ����Ʈ�� ���� �� �ִ� ��ü ����
		ArrayList<Coffee> list= new ArrayList<Coffee>();
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("coffee.dat"))){
		  while(in.available() != -1) {/*�����õ����Ͱ������� (!=-1 �̱⶧���� true ������)*/
			  list.add((Coffee) in.readObject());
		  }
			
		}catch(EOFException e) {     /*����catch�� (����)*/
			System.out.println("�ҷ����� �����Ͽ����ϴ�.");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		return list;
		
	}
	
	
	
	
	public int saveList(ArrayList<Coffee> list) { // �ֹ� ����Ʈ ���� �뵵
		int result=-1;                   /*ObjcetOutputStream : ��ü����ȭ (��ü��2�����Ϸ� �ٲ㼭 ����) , ����2�������� Ȯ���ڴ� .dat*/
		   /*��ü�� ���Ϸ� �����ϱ����ؼ� ObjectOutputStream�� �ʿ��� ObjectOutputStream�� FileOutputStream�� �������ʿ���*/
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("coffee.dat"));){ /*coffee.dat���Ͽ� ���Ǹ���Ʈ�� ������ �ض�*/
			for(Coffee co:list) {     /*try(......){ : ��ü ����ȭ ���� */
				out.writeObject(co);/*()���� ��ü�� ����*/
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
