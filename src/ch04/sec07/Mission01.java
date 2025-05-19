package ch04.sec07;

import java.util.Scanner;

public class Mission01 {
    /*
    (프린트 반복실행)
    ------------------------------------
    1. 예금 / 2.출금 / 3.잔고 / 4.종료
    ------------------------------------
    선택 >

    (실행 예시)
    선택 > 1 (엔터
    예금액 > 10000 (엔터)

    [[ 프린트 ]]
    선택 > 2
    출금액 > 2000 (엔터)

    [[ 프린트 ]]

   선택 > 3 (엔터)
   잔고 > 8000원

   [[ 프린트 ]]

   선택 > 4 (엔터)
   프로그램 종료
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int money = 0;

        while (run) {
            System.out.println("------------");
            System.out.println("1.예금 | 2.출금 | 3.잔액 | 4.종료");
            System.out.println("------------");
            System.out.print("선택 : ");

            int bnum = scanner.nextInt();

            if(bnum == 1) {
                System.out.print("예금: ");
                int num1 = scanner.nextInt();
                money = money + num1;
                System.out.println("잔고: " + money);
            } else if (bnum == 2) {
                System.out.print("출금: ");
                int num2 = scanner.nextInt();
                if(money >= num2) {
                    money = money - num2;
                    System.out.println("잔고: " + money);
                } else {
                    System.out.println("잔고가 부족합니다. ");
                }

            } else if (bnum == 3) {
                System.out.println("잔액 " + money );
            } else if (bnum == 4) {
                System.out.println("종료");
                break;
            } else {
                System.out.println("제대로된 번호를 눌러주세요.");
            }
        }





    }
}
