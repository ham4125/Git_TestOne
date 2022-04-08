package day04_07_3;

import java.util.Scanner;

public class Java_3 {

	public static void main(String[] args) {
		

		/*	첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제

		하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오
		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다. */
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		if(a>=1 && a<=100) {

			for(int i=0; i<=a-1; i++) {
				System.out.println(" ");
				for(int j=a-1; j>=i; j--) {
					System.out.print("*");
				}
				
			}
		 

		}else {
			System.out.println("잘못입력했습니다.");
		}
		
	}

}
