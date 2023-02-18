import java.util.ArrayList;
import java.util.Arrays;

public class OX {

    public static void solution(String[] quiz) {

        ArrayList<String> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" "); // [-3,-,-3,=,-6]
            String a = arr[0]; // -3
            String b = arr[2]; // -3
            sum = arr[1].equals("+") ? Integer.parseInt(a) + Integer.parseInt(b) : Integer.parseInt(a) - Integer.parseInt(b);
            String result = sum == Integer.parseInt(arr[4]) ? "O" : "X";
            list.add(result);
        }
        String[] answer = new String[list.size()];
        list.toArray(answer);
        System.out.println(Arrays.toString(answer));
    }
    public static void main(String[] args) {

        String[] answer = {"3 - 4 = -3", "50 + 6 = 56"};

        //System.out.println(Arrays.toString(answer));
        solution(answer);
    }
}
