package ch05.sec06;

import java.util.Arrays;

public class Mission03 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 30, 50};
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------");
        // 여기 아래는 여러분의 놀이터.
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.printf("%d", arr[i]);
            } else {
                System.out.printf(", %d", arr[i]);
                {

                }
            }



        }
        System.out.print("]");
    }


    }
