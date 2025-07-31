// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.



public class TwoSum{
    public static int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){ 
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target - nums[i]){ // target - one element = other element : checks if the other element is in the array.
                    return new int[]{i,j}; //returns the indices of the resulting pair of numbers.
                }
            }
        }
        return new int[] {}; // if not found, returns an empty array.
    }

    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15,3,9}; // sample input

        int[] result =twoSum(nums,14);
        for(int n : result){
            System.out.print(n+" ");
        }
    }

}