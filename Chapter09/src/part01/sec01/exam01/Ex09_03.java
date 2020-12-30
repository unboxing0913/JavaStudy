package part01.sec01.exam01;

import java.util.Scanner;

public class Ex09_03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		
        System.out.print("문자열 입력==>");
        str=s.nextLine();
        System.out.print("출력 문자열==>");
        
        // 문자열의 처음 또는 끝이 특정 문자열인지 확인하는 startswith(),endswith()
        if(!str.startsWith("(")) { //시작되는첫번째 문자열이 "(" 가 아니면
            System.out.printf("(");
        } 
        
        for(int i=0;i<str.length();i++) {
        	System.out.printf("%c",str.charAt(i));
        }
        	if(!str.endsWith(")")){        		
        		 System.out.printf(")");
        	} s.close();
        }  
           
	}

//string 의 startsWith(),endsWith() 메소드의 사용법
//
//boolean 타입으로 리턴
//
//startsWith(String)는
// String 타입을 인자로 받으며, 
//해당 String 객체가 인자로 전달된 String으로 시작한다면
// true를 리턴하고 그렇지 않다면 false를 리턴합니다
//
//endsWith(String)
//endsWith(String)는 String 타입을 인자로 받으며, 
//해당 String 객체가 인자로 전달된 String으로 끝난다면
// true를 리턴하고 그렇지 않다면 false를 리턴합니다.
