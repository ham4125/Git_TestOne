package day04_07_1;

import java.util.Scanner;

public class Java_1 {

	public static void main(String[] args) {
		//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		if(a>=1 && a<=100) {
			
			for(int i=0; i<=a; i++) {
				System.out.println(" ");
				for(int j=0; j<=i-1; j++) {
					System.out.print("*");
					
				}
			}
			
			
		}else {
			System.out.println("잘못입력했습니다.");
		}
		
		
		

	}

}
