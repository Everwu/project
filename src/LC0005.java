package src;

public class LC0005 {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int odd = expandFromMiddle(s, i, i);
            int even = expandFromMiddle(s, i, i + 1);
            int len = Math.max(odd, even);

            if (len > end - start) {
                //odd len(5) -> 2 start i - 2, end -> i + 2
                //Even len(6) -> 2 start --> i - 2, end -> i + 3
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandFromMiddle(String s, int left, int right) {
        if (s == null || left > right) return 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
