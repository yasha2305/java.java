package basics;
class CharacterCount {
    public static void main(String[] args) {
        String s = "hello";

        for (char ch : s.toCharArray()) {
            int count = 0;

            for (char c : s.toCharArray()) {
                if (c == ch) {
                    count++;
                }
            }

            System.out.println(ch + " = " + count);
        }
    }
}