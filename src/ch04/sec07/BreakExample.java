package ch04.sec07;

public class BreakExample {
    public static void main(String[] args) {
        while (true) {
            int num = (int)(Math.random() * 6) + 1; // 1~6 사이 랜덤값
            System.out.println(num);
            if(num == 5) {
                break;
            }
        }
        System.out.println("--끝--");
    }
}
