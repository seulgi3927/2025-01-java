package ch02.sec01;

public class VariableInitializationExample {
    public static void main(String[] args) {
        int value; // 변수 선언, 선을 할 때 데이터 타입을 지정! (int 는 정수 타입)
        // 변수 사용 방법 2가지: 읽기(read). 쓰기(write)
        value = 10; // 읽기 / 쓰기

        int value2 = 20; // 읽기 / 쓰기
        /*
        에러(예외) 종류 크게 2가지
        - 컴파일 에러: 실행을 할 수 없음. 컴파일 자체가 불가능. 문법적 문제가 있거나 명확한 문제가 보이면...
        - 런타임 에러: 실행을 하는 도중에 에러가 발생
         */
        int result = value + 10; // value 아래 빨간색 언더라인, 컴파일 에러
        System.out.println(result);
    }
}
