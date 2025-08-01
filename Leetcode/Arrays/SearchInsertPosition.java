// Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.

// Solution : USE BINARY SEARCH - the time complexity of the solution should be O(log n) and also the array is sorted.
// So, binary search fulfills these conditions. To return the index of the elements that are not present in the array, we return the Left.

// Time complexity:O(log n)


public class SearchInsertPosition {

    public static int binarySearch(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid = left + (right - left)/2;

            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                left=mid+1;
            }else if(target<nums[mid]){
                right=mid-1;
            }
        }
        return left;
    }


    public static int searchInsert(int[] nums, int target){

        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }else{
                return binarySearch(nums,target);    
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr={1,2,4,5,6};

        int target=2;

        int result = searchInsert(arr, target);
        System.out.println("The target " + target + " should be inserted at index: " + result);
    }
}
