package day04_05_1;
 
import java.util.Scanner;

public class Java_1 {  

	public static void main(String[] args) {
		//사칙연산
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("A랑 B를 입력하세요");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		

	}

}
