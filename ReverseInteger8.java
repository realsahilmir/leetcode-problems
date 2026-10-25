public class ReverseInteger8{
//solution1 T.C O(d) S.C O(1)
class Solution {
    public int reverse(int x) {
        int n = x;
        long reversed = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n /= 10;
        }


        if (reversed < Integer.MIN_VALUE ||
            reversed > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) reversed;
    }
}
