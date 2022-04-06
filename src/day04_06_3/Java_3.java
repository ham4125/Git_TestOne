package day04_06_3;

import java.util.Scanner;

public class Java_3 {

	public static void main(String[] args) {
		//정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오
	
		
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		a = sc.nextInt();
		
		for(int i=0; i<=a; i++) {
			
			b+=i;
		}
		System.out.println(b);
		

	}
	

}
