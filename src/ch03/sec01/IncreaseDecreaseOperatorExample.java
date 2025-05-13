package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int i1 = 5;
        i1++; // 쓰기
        System.out.printf("i1: %d\n", i1);

        int i2 = 5;
        ++i2; // 쓰기
        System.out.printf("i2: %d\n", i2);
    }
// 단독으로 사용할때는 ++이 앞에 있으나 뒤에 있으나 상관없음
}