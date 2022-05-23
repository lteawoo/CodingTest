package kr.taeu.codingtest.list.sugarcandy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SugarCandy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());

        boolean[][] grid = new boolean[w][h];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;

            for (int j = 0; j < l; j++) {
                if (d == 0) {
                    grid[x][y + j] = true;
                } else {
                    grid[x + j][y] = true;
                }
            }
        }

        for (boolean[] b1 : grid) {
            for (int i = 0; i < b1.length; i++) {
                System.out.print(b1[i] ? 1 : 0);
                if (i < b1.length - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
