import com.sun.jdi.FloatValue;

import java.util.Arrays;
//문자열 자르기
import static java.lang.Math.ceil;

public class SplitString {
    public static void solution(String my_str, int n){

        Double nx = (double)Math.ceil((double)my_str.length() / n);

        System.out.println(nx);

        String[] answer = new String[nx.intValue()];
        int j = 0;

        for (int i = 0; i < nx.intValue(); i++){ //0,1,2
            if (my_str.length()%n == 0){
                answer[i] = my_str.substring(j, j+n);
            }
            else{
                if(i == nx - 1) {
                    answer[i] = my_str.substring(j);
                }else {
                    answer[i] = my_str.substring(j, j+n);
                }
            }
            j = j+n;
        }
        System.out.println(Arrays.toString(answer));


    }

    public static void main(String[] args) {
        String my_str = "abcdef123";
        int n = 3;
        solution(my_str, n);

    }
}
