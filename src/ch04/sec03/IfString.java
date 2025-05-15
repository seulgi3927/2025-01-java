package ch04.sec03;

import java.util.Scanner;

public class IfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // = 적고 alt + Enter 해줘야함
        System.out.print("성별을 입력해 주세요. (w/m) > ");
        String gender = scanner.next();
        System.out.println("gender: " + gender);

        if( "w".equals(gender) ) {
            System.out.println("당신은 여자입니다.");
        }else if ( "m".equals(gender))  { // 대소문자 구분없이 나오게 하려면 equalsIgnoreCase(gerner) 라고 적어주면 됨
            // 영문일 때만 사용하면 됨. 한글은 상관 없음
            // 한글로 여자, 여 로 하려면 "여".equals(gender || "여자".equals(gender) 하면 됨
            System.out.println("당신은 남자입니다.");
        } else {
            System.out.println("성별을 입력해주세요.");
        }

        System.out.println("-- 끝 --");

    }


        // w를 입력하면 "당신은 여자입니다."
        // m을 입력하면 "당신은 남자입니다."
        // w, m이 아니면 "성별을 입력해주세요." 출력



}
