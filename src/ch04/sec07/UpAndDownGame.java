package ch04.sec07;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int)(Math.random() * 100.0) + 1; // 1~100 사이 랜덤값
        System.out.println("answer: " + answer); // 32가 나왔다고 보자.

        while (answer < 32) {
            System.out.println("Up!");

            if (answer > 32) {
                System.out.print("Down!");
            } else if (answer == 32) {
                System.out.print("정답");
                break;
            }
        }






        /*
        1-100 사이 숫자를 입력해주세요 > 50
        Down!
        1-100 사이 숫자를 입력해주세요 > 25
        Up!

        맞출때까지 반복한다.

        정답!



         */
    }
}
