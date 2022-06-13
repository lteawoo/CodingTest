package kr.taeu.codingtest.traverse.binarysearch.findnumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            int start = 0;
            int end = A.length - 1;
            int middle = 0;
            int result = 0;

            while (start <= end) {
                middle = start + (end - start) / 2;

                if (A[middle] > target) {
                    end = middle - 1;
                } else if (A[middle] < target) {
                    start = middle + 1;
                } else {
                    result = 1;
                    break;
                }
            }

            System.out.println(result);
        }
    }

//    private static int binarySearch(int number, int[] arr) {
//        if (arr.length == 1) {
//            if (arr[0] == number) {
//                return 1;
//            } else{
//                return 0;
//            }
//        }
//
//        int middle = arr.length / 2;
//
//        if (arr[middle] > number) {
//            return binarySearch(number, Arrays.copyOfRange(arr, 0, middle));
//        } else {
//            return binarySearch(number, Arrays.copyOfRange(arr, middle, arr.length));
//        }
//    }
}
