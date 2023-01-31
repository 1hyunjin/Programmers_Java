public class number7 {

    static void solution(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String x = String.valueOf(arr[i]);
            for (int j = 0; j < x.length(); j++) {
                if (x.charAt(j) == '7'){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = {7, 17, 10,29};

        solution(arr);
    }
}
