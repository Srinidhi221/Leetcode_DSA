// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.


// The logic of this question is based on Moore's Voting Algorithm.
// - A counter is maintained to keep track of the majority element : if the counter is zero, candidate is assigned the value of the current element. Then, for each element the counter is incremented if it matches the candidate element, else the counter is decremented.
// - The candidate element is the MAJORITY ELEMENT if its no of occurences is more than half the size of the given array.

public class MajorityElement {
    public static int solution(int[] nums){

        int count=0;
        int candidate=0;
        for(int i=0;i<nums.length;i++){

            // Logic to find the majority element using ALGO
            if(count==0){
                candidate=nums[i];
                count=1; // starts counting from 1 ( considering the NOW ASSIGNED value)
            }
            else if(candidate==nums[i]){
                count++; // increment 
            }else{
                count--; // decrement
            }

            // Counts the number of occurences of the candidate element
            int s=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==candidate){
                    s++; 
                }
            }

            //Verifies if the candidate element is the majority element
            if(s>nums.length/2){
                return candidate;
            }
        }
        return -1; // returns -1 if no majority element found

    }
    public static void main(String[] args) {
        int[] votes = { 3,3,3,4,4,4,4,4,3};
        int majority_element = solution(votes);

        System.out.println("Majority element : "+majority_element);
    }
}
