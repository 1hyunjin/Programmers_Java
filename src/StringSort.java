import java.util.Arrays;

public class StringSort {
    //소문자로 변경 후 sort
    static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }
    static void solution(String my_string){

        char[] str = my_string.toLowerCase().toCharArray();

        Arrays.sort(str);

        String answer = new String(str);

        System.out.println(answer);
    }

    public static void main(String[] args) {
        String my_string = "heLLo";

        solution(my_string);

    }
}
