import java.util.Scanner;
//종이 자르기
public class cutPaper {

    public  static int solution(int M, int N) {
        int answer = (M*N) - 1;
        return answer;
    }


    public  static void main(String[] args) {
        int M = 0;
        int N = 0;
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();

        System.out.println(solution(M,N));

    }


}

