package codetraining.leetcode;

public class Dominant_Index {
    public int dominantIndex(int[] nums) {
        int max=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(j==index||nums[j]==0) {
                count++;
                continue;
            }
            else if((nums[index]/nums[j])>=2)
                count++;
        }
        if(count==nums.length)
            return index;
        else
            return -1;
    }

    public static void main(String[] args) {
        Dominant_Index s = new Dominant_Index();
        int[] nums = {3, 6, 1, 0};
        System.out.println("Index of largest number: " + s.dominantIndex(nums));
    }
}
