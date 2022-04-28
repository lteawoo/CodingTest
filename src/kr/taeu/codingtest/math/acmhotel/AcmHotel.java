package kr.taeu.codingtest.math.acmhotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AcmHotel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int room, floor;
            if (n % h == 0) {
                floor = h;
                room = n / h;
            } else {
                floor = n % h;
                room = n / h + 1;
            }

            System.out.printf("%d%02d%n", floor, room);
        }
    }
}
