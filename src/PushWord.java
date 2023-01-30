import java.util.Scanner;

public class PushWord {

    public static void solution(String A, String B) {
        int answer = 0;

        for (int i = 0; i < A.length(); i++) {
            if (A.equals(B)) {
                System.out.println(answer);
                break;
            }
            String a = A.substring(A.length() - 1);
            A = a + A.substring(0, A.length() - 1);
            answer++;
        }
        if (!A.equals(B)){
            System.out.println("-1");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();   //hello
        String B = sc.next();   //ohell

        solution(A, B);

    }
}
