public class StringInString {
    // 문자열 안에 문자열
    public static void Solution(String str1, String str2){

            if (str1.contains(str2)){
                System.out.println("1");
            }else{
                System.out.println("2");
            }
    }
    public static void main(String[] args) {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        Solution(str1,str2);
    }
}
