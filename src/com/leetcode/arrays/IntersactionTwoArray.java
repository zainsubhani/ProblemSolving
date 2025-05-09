package com.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersactionTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int k : nums1) {
            set.add(k);
        }
        HashSet<Integer> result = new HashSet<>();
        int i = 0;
        for (int k : nums2) {
            if (set.contains(k)) {
                result.add(k);
                i++;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        IntersactionTwoArray obj = new IntersactionTwoArray();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = obj.intersection(nums1, nums2);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
