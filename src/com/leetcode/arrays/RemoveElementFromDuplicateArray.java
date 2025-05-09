package com.leetcode.arrays;

public class RemoveElementFromDuplicateArray {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=problem-list-v2&envId=array
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        RemoveElementFromDuplicateArray obj = new RemoveElementFromDuplicateArray();
        int[] nums = {1,1,2};
        System.out.println(obj.removeDuplicates(nums));
    }
}
