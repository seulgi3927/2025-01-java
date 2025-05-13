package ch04.sec04;

public class Mission08 {
    public static void main(String[] args) {
      int sum = 0;

     //    sum = sum + 1;
     //    sum = sum + 2;

     //    System.out.println("sum: " + sum); // 3


        //1~100 모두 더한값 출력하세요.



        for(int i = 1; i<= 100; i++) {
            sum = sum + i;
            System.out.println("sum: " + sum);
        }
    }
}