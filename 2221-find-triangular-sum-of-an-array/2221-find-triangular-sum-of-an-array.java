    class Solution {
        public int triangularSum(int[] nums) {
            /*
                Time complexity = O(n), 
                Space complexity = O(1) -> In-place calculation of the triangular sum of nums. 
            */
            
            int n = nums.length;

            if(n == 1) return nums[0];

            while(n > 1){
                for(int i = 0; i < n-1; i++){
                    nums[i] = (nums[i] + nums[i+1]) % 10; // In-place.
                }

                n--;
            }

            return nums[0]; // After performing all the operations as done above the oth index of the nums contains the traingular sum of nums.
        }
    }