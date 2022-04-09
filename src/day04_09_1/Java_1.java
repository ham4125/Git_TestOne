package day04_09_1;

import java.util.Scanner;

public class Java_1 {

	public static void main(String[] args) {
		//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		/*별 다이아. https://www.acmicpc.net/problem/2446 */
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		if(a>=1 && a<=100) {
			for(int i=0; i<a; i++) {
				
				for(int num=a; num>i; num--) {
					System.out.print(" ");
				}
				
				for(int num=0; num<=i; num++) {
					System.out.print("*");
				}
				
				for(int num=0; num<i; num++) {
					System.out.print("*");
				}
				System.out.println("");

			}
			
			for(int i=0; i<a; i++) {
				
				for(int num=0; num<=i; num++) {
					System.out.print(" ");
					if(num==0) {
						System.out.print(" ");
					}
					
				}
				for(int num=a; num>i; num--) {
					if(num==a) {
						
					}else {
						System.out.print("*");
					}
					
				}
				for(int num=a-1; num>i; num--) {
					if(num==a-1) {
						
					}else {
						System.out.print("*");
					}
				}
				
				System.out.println("");
					
				}

		}else {
			System.out.println("잘못입력했습니다.");
		}
		
		
		

	}

}
