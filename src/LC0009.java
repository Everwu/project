package src;

public class LC0009 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        // store the reverse of the number
        int reverse = 0;

        // store the number in a variable
        int number = x;

                //121 > 0
                // 12 > 0
                // 1 > 0
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            //reverse = 0 * 10 + 121 % 10 = 1
            //reverse = 1 * 10 + 12 % 10 = 12
            //reverse = 12 * 10 + 1 % 10 = 121

            number /= 10;
            //number = 121 / 10 = 12
            //number = 12 / 10 = 1
            //number = 1 / 10 = 0
        }
        return x == reverse; // 121 == 121 return true;
    }
}
