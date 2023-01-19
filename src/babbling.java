public class babbling {
    public static int solution(String[] babbling) {
        String[] bab = {"aya", "ye", "woo", "ma"};
        int count = 0;
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < bab.length; j++) {
                if (babbling[i].contains(bab[j])) {
                    babbling[i] = babbling[i].replaceAll(bab[j], "*".repeat(bab[j].length()));
                }
            }

            if (babbling[i].equals("*".repeat(babbling[i].length()))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        solution(babbling);
    }
}