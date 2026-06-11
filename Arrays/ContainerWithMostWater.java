/*
Problem: Two Sum
Platform: LeetCode 11
Difficulty: Medium
Topic: Container With Most Water
*/

class Solution {
    public int maxArea(int[] height) {
        int s=0,e=height.length-1,max=0;
        while(s<e){ 
            int temp=e-s;
            if(height[e]>height[s]){
                max=Math.max(max,temp*height[s]);
                s++;
            }
            else{
                max=Math.max(max,temp*height[e]);
                e--;
            }
        }
        return max;
    }
}