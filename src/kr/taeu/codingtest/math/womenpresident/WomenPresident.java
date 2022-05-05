package kr.taeu.codingtest.math.womenpresident;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WomenPresident {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {

            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());

            // 0층 초기화
            int[] peopleCnt = new int[room];
            for (int j = 0; j < peopleCnt.length; j++) {
                peopleCnt[j] = j + 1;
            }

            // 1층 1호실부터 계산함
            for (int j = 0; j < floor; j++) {
                for (int k = 1; k < room; k++) {
                    peopleCnt[k] += peopleCnt[k - 1];
                }
            }
            System.out.println(peopleCnt[room - 1]);
        }
    }
}
