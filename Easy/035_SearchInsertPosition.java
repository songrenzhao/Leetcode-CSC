/*
35. Search Insert Position
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.
*/

//Solution in Java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right)
        {
            int mid = (right + left) / 2;
            if(nums[mid] == target)
                return mid;
            else if(target < nums[mid])
            {
                right = mid-1;
            }
            else if(target > nums[mid])
            {
                left = mid+1;
            }
        }
        return left;
    }
}
