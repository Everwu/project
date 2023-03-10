package src;
/*
1. use StringBuilder to append

Time complexity -> 0(n);
Space complexity -> 0(n);

*/
public class LC0006 {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }

        int index = 0;
        while (index < len) {
            for (int i = 0; i < numRows && index < len; i++) {
                sb[i].append(c[index++]);
            }
            for (int i = numRows - 2; i >= 1 && index < len; i--) {
                sb[i].append(c[index++]);
            }
        }

        for (int i = 1; i < sb.length; i++) {
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }
}
