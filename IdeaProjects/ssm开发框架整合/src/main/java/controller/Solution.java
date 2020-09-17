package controller;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int ints[]=null;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
            throw new IllegalArgumentException("No two sum solution");

        }
        return ints;
    }
    public static void main(String args[]){
        int sum=9;
        int nums[]={3,7,2,9};
        int c[];
        c=twoSum(nums,sum);
        for(int x:c){
            System.out.println(x);
        }
    }

}