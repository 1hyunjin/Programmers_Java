import java.util.Arrays;

public class SimilarArray {
    public static void solution(String[] str1, String[] str2){
        int answer = 0;
        for (int i = 0; i < str1.length; i++) {
            for (int j = 0; j < str2.length; j++) {
                if (str2[j].equals(str1[i])){
                    ++answer;;
                }
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        solution(s1, s2);

    }
}
