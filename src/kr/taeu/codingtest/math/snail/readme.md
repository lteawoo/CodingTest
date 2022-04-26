# 달팽이는 올라가고 싶다 - 수학
https://www.acmicpc.net/problem/2869

## 풀이
좀 더 깔끔한게 있지 싶다.

1. 높이에 낮 높이를 뺀다 (낮,밤에 걸쳐 올라가야할 높이를 구하기 위해)
2. 결과를 낮높이-밤높이로 나눈다, 그럼 낮,밤에 걸쳐 며칠이 걸리는지 산출된다. 단 올림처리(무조건 올라야하기 때문)
3. 결과에 낮만 올라가는 일 수를 더 해준다.

```java
public class Snail {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        if (v == a) {
            System.out.print(1);
        } else {
            double calc = Math.ceil((v - a) / (double)(a - b));
            System.out.print((int)calc + 1);
        }
    }
}
```