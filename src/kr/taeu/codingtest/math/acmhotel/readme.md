# ACM호텔 - 수학
https://www.acmicpc.net/problem/10250

## 풀이
1. W는 필요없는 듯
2. n%h == 0 일때 와 아닐때로 구분하여 산식을 세움 (최고층일때)
3. 방은 최고층에 도달 후 다음 호수로 변경되며 다시 1층부터 배정받음
4. 방 호수는 배정순서를 높이로 나눈 몫이며(단, n % h != 0이면 + 1)(ex (10번째 / 6층높이) == 1) + 1 -> 2호 배정, 6번째 / 6층높이 == 1 -> 1호 배정)
5. 층수는 나머지가 된다(단, n % h == 0 이면 h)
```java
if (n % h == 0) {
    floor = h;
    room = n / h;
} else {
    floor = n % h;
    room = n / h + 1;
}
```
3. 그 후 YXX포맷에 따라(호수는 0이 붙는다) `%02d`로 호수를 맞춰서 출력

```java
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

```