package codetraining.leetcode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                for(int j=i;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
                count++;
                nums[nums.length-1]=-1;
                i--;
            }
        }
        return nums.length-count;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(nums, val));
    }
}
