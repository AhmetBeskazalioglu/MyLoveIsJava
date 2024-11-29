package codetraining.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.mergeArraySorted(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public void mergeArraySorted(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for (int i=0;i<m+n;i++){
            if(nums1[i]==0&&j<n){
                nums1[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
    }
}
