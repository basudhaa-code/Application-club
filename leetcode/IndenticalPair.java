class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i =0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i] == nums[j]) 
                    count++;
            }
        }
        return count;
    }
}

public class IndenticalPair {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example array
        int[] nums = {1, 2, 3, 1, 1, 3, 2};

        // Call the method
        int result = solution.numIdenticalPairs(nums);

        // Print the result
        System.out.println("Number of good pairs: " + result);
    }
}
