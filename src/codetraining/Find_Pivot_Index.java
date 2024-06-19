package codetraining;

public class Find_Pivot_Index {
    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        System.out.println(pivot(nums));
    }
    public static int pivot(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            int sumLeft=0;
            int sumRight=0;
            for (int j = 0; j < i; j++) {
                sumLeft+=nums[j];
            }
            for (int j = nums.length-1; j > i; j--) {
                sumRight+=nums[j];
            }
            if (sumLeft==sumRight){
                return i;
            }
        }
        return -1;
    }
}
