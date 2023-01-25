import java.util.Scanner;

//등비수열 & 등차수열
public class common {
    public static int solution(int[] common){

        int solution = 0;
        int a = common[1] - common[0];   // 등차
        int b = 0;
        if (common[0] != 0){
            b = common[1] / common[0];   // 등비
        }

        if(common[2] - common[1] == a){
            solution = common[common.length-1] + a;
            System.out.println(solution );
        }else {
            solution = common[common.length-1] * b;
            System.out.println(solution);
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {2,4,8};
        solution(a);
        solution(b);




    }
}
