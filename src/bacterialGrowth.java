public class bacterialGrowth {
    //세균 증식
    static void solution(int n, int t){
//        int answer = n;
//
//        for (int i = 0; i < t; i++) {
//            answer = answer * 2;
//        }
//        System.out.println(answer);

        // 비트 연산자 n<<i -> n^i
        // 2 >> 10 = 2^10 = 2048
        int answer = 0;
        answer = n << t;

        System.out.println(answer);
    }

    public static void main(String[] args) {
        int n = 7;
        int t = 15;

        solution(n, t);
    }
}
