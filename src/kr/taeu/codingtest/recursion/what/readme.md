# 재귀함수가 뭔가요? - 재귀
https://www.acmicpc.net/problem/17478

## 풀이
놓치기 쉬운 부분은 입력 변수가 `재귀횟수`인 것

즉 1이상을 받게되는데 이는 1번은 재귀 된다는 것이니 주의하자

## 처리 순서
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class What {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");

        recursivePrint(n, "");
    }

    private static void recursivePrint(int n, String prefix) {
        System.out.println(prefix + "\"재귀함수가 뭔가요?\"");

        if (n > 0) {
            System.out.println(prefix + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n" +
                    prefix + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n" +
                    prefix + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
            recursivePrint(n - 1, prefix + "____");
        } else {
            System.out.println(prefix + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
        }

        System.out.println(prefix + "라고 답변하였지.");
    }
}
```