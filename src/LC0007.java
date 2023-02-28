package src;
/*
Be careful :  integer will overflow; Check before Overflow
-231 <= x <= 231 - 1

1. x/10 to get the digit and put into sum
2. check the integer overflow, the max & min boundery

Time complexity : O(log10n)
Space complexity : O(1)
*/

public class LC0007 {
    public int reverse(int x) {
        long sum = 0;   // better to use long than int
        while (x != 0) {
            sum = sum * 10 + x % 10;
            x /= 10;

            if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) sum;

    }
}
