package ch04.sec05;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean run = true;
        int sum = 0;
        while ( run ) {
            System.out.print(">> ");
            int num = scanner.nextInt();
            if( num == 0 ) {
                run = false;
            } else {
                sum = sum + num;
            }
        }
        System.out.println("합계 : " + sum);

        /*
        합계를 구할 숫하를 입력하세요. (종료: 0)
        >> 100
        >> 200
        >> 300
        >> 400
        >> 0
        합계 1000
         */
    }
}
