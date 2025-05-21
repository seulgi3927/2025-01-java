package ch05.sec06;

public class MultiArrayStudy {

        /*
        int num = 10;


        int [] arr1 = { 10, 20, 30 };
        int [] arr2 = { 10, 20, 30 };

        int[][] parent = { arr1, arr2 }; 이차원 배열 (일차원 배열이 여러개 있다고 보면 된다)

        int[][][] parent2 = null; 이차원 배열 (일차원 배열이 여러개 있다고 보면 된다)
        int[][][][] parent3 = null; 사차원 배열 (삼차원 배열이 여러개 있다고 보면 된다)


         */
        public static void main(String[] args) {
            int[] arr1 = { 10, 20, 30 };
            int[] arr2 = { 40, 50, 60 };

            int[][] parent = { arr1, arr2};
            System.out.println(parent[0][1]); // 20
            System.out.println(parent[1][1]); // 50



    }
}
