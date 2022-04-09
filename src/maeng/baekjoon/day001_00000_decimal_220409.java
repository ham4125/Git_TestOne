package maeng.baekjoon;

import java.util.Scanner;

public class day001_00000_decimal_220409 {

    public static int insertInt(int numberCount){

        System.out.print(numberCount+"번째 정수 입력: ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(numberCount == 1){
            while(0 >= number){
                System.out.println("(0 < A)");
                number = sc.nextInt();
            }
        }else{
            while(number >= 10){
                System.out.println("(B < 10)");
                number = sc.nextInt();
            }
        }

        return number;
    }
}
