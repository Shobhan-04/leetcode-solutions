    class Solution {
        public int triangularSum(int[] nums) {
            /*
                Time complexity = O(n), 
                Space complexity = O(n) -> Auxilliary space for newNums. 
            */
            
            int n = nums.length;
            int triangularSumOfNums = nums[0];

            if(n == 1) return nums[0];
            int[] newNums = new int[n-1];

            while(n > 1){
                for(int i = 0; i < n-1; i++){
                    newNums[i] = (nums[i] + nums[i+1]) % 10;
                }

                nums = newNums;

                n--;
            }

            return nums[0]; // After performing all the operations as done above the oth index of the nums contains the traingular sum o nums.
        }
    }