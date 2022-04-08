package day04_08_2;

import java.util.Scanner;

public class Java_2 {

	public static void main(String[] args) {
		//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		/*첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제

		별은 가운데를 기준으로 대칭이어야 한다*/
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		if(a>=1 && a<=100) {
			
		for(int i=0; i<=a-1; i++) {
				
				for(int num=a; num>=i-1; num--) {
					System.out.print(" ");
				}
				
				for(int num=0; num<=i; num++) {
					System.out.print("*");
				}
				
				for(int num=0; num<=i-1; num++) {
					System.out.print("*");
				}
				
				System.out.println("");
				
			}
			
			

		}else {
			System.out.println("잘못입력했습니다.");
		}
		
		
		

	}

}
