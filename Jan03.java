
// Problem 2270. Number of Ways to Split Array

public class Jan03 {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length ;
        long totalSum = 0;
        for(int i = 0 ; i<n; i++){
            totalSum += nums[i] ; 
        }
        int split = 0 ;
        long leftSum = 0 ; 
        for(int i = 0 ; i<n-1 ; i++){
            leftSum += nums[i] ; 
            long rightSum = totalSum - leftSum ;
            if(leftSum >= rightSum){
                split ++; 
            }
        }
        return split; 
    }
}