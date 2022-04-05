package day04_05_3;
 
import java.util.Scanner;
 
public class Java_3 {

	public static void main(String[] args) {
		//구구단
		Scanner sc = new Scanner(System.in);
		int a;
		int b=0;
	
		
		System.out.println("1~9사이 숫자를 입력해주세요");
		a = sc.nextInt();
		
		if(a>0 && a<=9) {
			
			while (b<9) {
				b++;
				System.out.println(a+" X "+b+" = "+ a*b);
				
			}

		}else {
			System.out.println("1~9사이 숫자를 입력해주세요");
		}
		
		
		

	}

}
