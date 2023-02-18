public class SumAllDigit {

    public static int solution(int n) {
        int answer = 0;
        String a = Integer.toString(n);
        for (int i = 0; i < a.length(); i++) {
            answer += Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        return answer;
    }

    public static void main(String[] args) {
        int num = 1234;
        solution(num);

    }
}
