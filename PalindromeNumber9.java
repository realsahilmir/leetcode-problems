public class PalindromeNumber9 {
    //solution1 Mathematical Approach T.C O(d) S.C O(1)
 class Solution1 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int n = x;
        int reversed = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n /= 10;
        }

        return reversed == x;
    }
 }
 //solution2 String + Two Pointers T.C O(d) S.C O(d)
 
class Solution2 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String str = String.valueOf(x);
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}


    
}
