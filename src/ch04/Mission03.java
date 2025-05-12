package ch04;

public class Mission03 {
    public static void main(String[] args) {
       int value = (int) (Math.random() * 100.0) + 1; // 1~100 사이의 랜던값 나오게 해주시고

        // 랜던값이 value = 5; 라면
        // 출력은: 5는(은) 홀수입니다.

        // 랜덤값이 value = 97; 라면
        // 출력: 97는(은) 홀수입니다.

        // 랜덤값이 value = 54; 라면
        // 출력 54는(은) 짝수입니다.

       if ( value % 2 == 0 ) {
       System.out.printf("%d 는 짝수입니다." , value);
        } else {
           // System.out.printf("%d 는 홀수입니다.", value);
        } // println 을 사용해도 됨
          // println(value + "는 홀수입니다.");
          // println(value + "는 짝수입니다.");
          // 이런식으로도 가능

        String oddEven = "홀";
        if(value % 2 == 0) {
            oddEven = "짝";
        }
        System.out.printf("%d는(은) %s수입니다. \n", value, oddEven);


    }
}
