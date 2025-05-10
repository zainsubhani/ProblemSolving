package com.leetcode.arrays;

public class AssignCookies {
    // https://leetcode.com/problems/assign-cookies/?envType=problem-list-v2&envId=array

    public int findContentChildren(int[] g, int[] s) {
        int child = 0;
        int cookies = 0;
        int result = 0;
        while (child < g.length && cookies < s.length) {
            if (g[child] <= s[cookies]) {
                child++;
            }
            cookies++;

        }
        return child;
    }
    public static void main(String[] args) {
        AssignCookies obj = new AssignCookies();
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(obj.findContentChildren(g, s));
    }
}
