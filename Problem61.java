/* 485. Max Consecutive Ones
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 

Constraints:

1 <= nums.length <= 10^5
nums[i] is either 0 or 1. */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count_curr = 0;
        int count_prev = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count_curr++;
            }
            else if (nums[i] != 1) {
                if (count_curr >= count_prev) {
                    count_prev = count_curr;
                }
                count_curr = 0;
            }
        }
        if(count_curr>count_prev){
            return count_curr;
        }else{
            return count_prev;
        }
    }
}