public class Que3 {
    public static void main(String[] args) {
        String s1 = "ABD";
        String s2 = "AABCCAD";
        
        int cost = transform(s1, s2);
        System.out.println("Total cost: " + cost);
    }

    public static int transform(String s1, String s2) {
        StringBuilder sb = new StringBuilder(s1);
        int cost = 0;

        for (int i = 0; i < s2.length(); i++) {
            if (i < sb.length() && sb.charAt(i) == s2.charAt(i)) {
                continue; // already matches
            } else if (sb.indexOf(String.valueOf(s2.charAt(i)), i) != -1) {
                // character exists but is misplaced → swap it
                int pos = sb.indexOf(String.valueOf(s2.charAt(i)), i);
                while (pos > i) {
                    // swap leftwards
                    char temp = sb.charAt(pos);
                    sb.setCharAt(pos, sb.charAt(pos - 1));
                    sb.setCharAt(pos - 1, temp);
                    pos--;
                    cost++;
                }
            } else {
                // insert missing character
                sb.insert(i, s2.charAt(i));
                cost++;
            }
        }

        return cost;
    }
}
