public class Pow {
    public static void Solution(int n){

        double sqrt = Math.sqrt(n); //sqrt는 제곱근을 구하는 방법 n = 144 -> sqrt = 12;
        if (sqrt == (int)sqrt){
            System.out.println("1");
        }else {
            System.out.println("2");
        }
    }
    public static void main(String[] args) {
       int n = 144; // n = 976 result: 2,  // n = 144 -> result: 1

       Solution(n);
    }
}
