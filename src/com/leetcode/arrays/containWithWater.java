package com.leetcode.arrays;

public class containWithWater {
    // https://leetcode.com/problems/container-with-most-water/description/?envType=problem-list-v2&envId=array

    public int maxArea(int[] height) {
        int start =0;
        int end = height.length-1;
        int maxArea = 0;
        while(start<end){
            maxArea = Math.max(maxArea, Math.min(height[start], height[end])*(end-start));
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxArea;
    }
public static void main(String[] args) {
        containWithWater obj = new containWithWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(obj.maxArea(height));

}
}
