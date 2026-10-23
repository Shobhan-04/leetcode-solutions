class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int duplicateNum = -1, missingNum = -1;

        for(int i = 0; i < n; i++){ //Loop for finding the duplicate element in the array.
            int num = Math.abs(nums[i]);
            
            if(nums[num - 1] < 0){ // duplicate element found
                duplicateNum = num;
            }else{
                nums[num - 1] *= (-1);
            }
        }

        for(int i = 0; i < n; i++){ // Loop for finding the missing number in the array.
            int num = nums[i];

            if(num > 0){
                missingNum = (i + 1);
                break;
            }
        }

        result = new int[]{duplicateNum, missingNum}; 

        return(result);
    }
}