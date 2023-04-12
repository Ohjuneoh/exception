package sample01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp4 {
	
	public static void test2(String str){
		test1(str);
		
	}
	
	public static void test1(String str) {
		int number = Integer.parseInt(str);
		System.out.println("number ->" + number);
		System.out.println();
		
	}
	
//	public static void test1() throws IOException{
//		System.out.println("예외처리 위임하기 연습");
//		test2();
//	}
//	public static void test2() throws IOException, ClassNotFoundException{
//		System.out.println("예외처리 위임하기 연습");
//		test3();
//	}
//	public static void test3() throws IOException, ClassNotFoundException{
//		System.out.println("예외처리 위임하기 연습");
//		test4();
//		
//		Class.forName("java.io.String");
//	}
//	public static void test4() throws IOException{
//		FileWriter writer = new FileWriter("src/sample01/sample04.txt");
//		writer.write("파일쓰기 연습");
//		writer.close();
//	}
	public static void main(String[] args) {
		try {
			test2("1234");
			test2("1234오");
		}catch (NumberFormatException ex) {
			System.out.println("유효한 숫자형식의 문자열이 아닙니다.");
		}
		//개별적인 try catch 없이 값을 제일 마지막으로 반환받는 메인 메소드에서 일괄처리 하는 형식
	}
}
