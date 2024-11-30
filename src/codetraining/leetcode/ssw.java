package codetraining.leetcode;

class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                for(int j=i;j<nums.length-i-1;j++){
                    nums[j]=nums[j+1];
                    nums[nums.length-1]=0;
                    count++;
                }
                i--;
            }
        }
        return nums.length-count;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        Solution solution = new Solution();
        System.out.println(solution.removeElement(nums, val));
    }
}