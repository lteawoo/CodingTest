# 수 찾기 - 이분탐색
https://www.acmicpc.net/problem/1920

## 풀이
재귀로 풀었으나 메모리 오버플로우 -> for 문으로 변환

1. 배열은 정렬되어 있어야 한다.
2. 중간 값보다 크냐 작냐로 좌우 배열로 쪼개서 탐색

```java
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
```