// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.

// APPROACH 1 : BRUTE FORCE

// run two nested loops to check for the element that appears only once in the array.
// outer loop to iterate through the elements and inner loop to check if the curr elt appears in the remaining array.A counter is initialized inside the outer loop that resets for every element of the outer loop.
// if the counter is 1, we return the element as the single one.
// time complexity : O(n^2) - due to the nested loop for checking pairs of numbers.
// space complexity : O(1) - no extra space used except for a few variables.


// APPROACH 2 : XOR GATE 

// PROPERTIES OF XOR :
// a^a=0; a^0=a;
// we xor all the elements of the array and get the single element as the result.
// time complexity : O(n) - we traverse the array only once.
// space complexity : O(1) - no extra space used except for a few variables.

public class Single {
    public static int bruteforce(int[]  nums){
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }

            if(count==1){
                return nums[i]; // returns the single element
            }
        }
        return -1; // returns -1 if no single element found
    }

    public static int xorSolution(int[] nums) {
        int result=0;
        for(int n:nums){
            result^=n;
        }
        return result; // returns the single element using XOR operation
    }

    public static void main(String[] args){
        int[] nums = {4,1,2,1,2}; // sample input

        // Using brute force approach
        int x = bruteforce(nums);
        System.out.println("Single element using brute force: " + x);

        // Using XOR solution
        int y = xorSolution(nums);
        System.out.println("Single element using XOR: " + y);
    }
}
