import java.util.ArrayList;
import java.util.Arrays;

public class MultipleN {
    public static int[] solution(int n, int[] numlist){

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0){
                list.add(numlist[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }
        System.out.println(Arrays.toString(answer));

        return answer;

    }

    public static void main(String[] args) {
        int num = 3;
        int[] nlist = {4,5,6,7,8,9,10,11,12,13};

        solution(num, nlist);
    }
}
