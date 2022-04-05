package day04_05_2;
 
import java.util.Scanner; 

public class Java_2 {

	public static void main(String[] args) {
		//시험성적
		Scanner sc = new Scanner(System.in);
		int a;
		
		
		System.out.println("90~100 A, 80~89 B, 70~79 C, 60~69 D,나머지 F");
		System.out.println("성적을 입력해주세요");
		a = sc.nextInt();
		if(a>0 && a<=100) {
			
			if (a>89) {
				System.out.println("A");		
			}else if (a>79) {
				System.out.println("B");	
			}else if (a>69) {
				System.out.println("C");
			}else if (a>59) {
				System.out.println("D");
			}else if (a<=59) {
				System.out.println("F");
			}
			
		}else {
			System.out.println("0~100사이 성적을 입력해주세요");
		}
			
		
		
		
		
		

	}

}
