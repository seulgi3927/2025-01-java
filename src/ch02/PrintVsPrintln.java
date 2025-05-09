package ch02;

public class PrintVsPrintln {
    public static void main(String[] args) {
        // print
        System.out.print("안녕");
        System.out.print("안녕");
        System.out.print("안녕");

        System.out.println();
        System.out.println("---------------------");

        // println
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        System.out.println("---------------------");

        // print + 개행(이스케이프 문자 \n)
        System.out.print("안녕\n");
        System.out.print("안녕\n");
        System.out.print("안녕\n");

        System.out.print("안녕\\n");
        System.out.print(" '안녕' \n");
        System.out.print("\"안녕\" \n");

        // 여러분 생각에
        System.out.print("안녕하세요.\n반갑습니다.\n");
        System.out.println("안녕하세요.\n반갑습니다.");
        System.out.println(";;;;;;");

        // printf
        int age = 22;
        String name = "홍길동"; // String 문자를 담을 수 있음
        float height = 172.554156f; // float 실수, 소수를 담을 수 있음
        // age, name, height 변수를 활영하여 아래처럼 출력시켜주세요.
        // 제 이름은 홍길동이고 나이는 22살이며 키는 172.5cm입니다.
        System.out.println("제 이름은 " + name + "이고 나이는 " + age + "살이며 키는 " + height + "cm입니다.");
        System.out.printf("제 이름은 %s이고 나이는 %d살이며 키는 %.2fcm입니다.\n", name, age, height);
        // .1은 소수 첫째자리까지만 표시하겠다는 것, .숫자 는 실무에서도 많이 사용됨
    }
}
