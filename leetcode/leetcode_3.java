public class leetcode_3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();

        char c = s.charAt(i);
        int res = 0;
        int j = 0;

        for (int i = 0; i < s.length(); i++) { //i = 3
            if (map.containsKey(c)) {
                j = Math.max(map.get(c) + 1, j) //map.get(c) => a; j => 0
                // j = Math.max(0 + 1, 0) => j = 1
            }
            map.put(c, i);
            res = Math.max(res, i - j + 1);
            //	res =	Math.max(0, 2 - 0 + 1)	=> 3
        }
        return res;
    }
}
