public class MajorElement169{
  //solution1-brute force T.C(O(n^2)) S.C(O(1))
  class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int half = n / 2;

        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count > half) {
                return nums[i];
            }
        }

        return -1;
    }
  }
}