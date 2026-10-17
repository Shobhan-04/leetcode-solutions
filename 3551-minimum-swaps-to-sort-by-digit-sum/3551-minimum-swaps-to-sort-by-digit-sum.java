class Solution {
    public int digitSum(int num){
        int sumOfDigits = 0;

        while(num > 0){
            int rem = (num % 10);
            sumOfDigits += rem;
            num /= 10; 
        }

        return(sumOfDigits);
    }

    public int minSwaps(int[] nums) {
        /*
            Time complexity = O(n log(n)), 
            Space complexity = O(n)
        */
        
        int n = nums.length;

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++){ // O(n)
            arr[i][0] = digitSum(nums[i]);
            arr[i][1] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> { // O(log(n))
            if(a[0] != b[0]){
                return Integer.compare(a[0], b[0]);
            }

            return Integer.compare(a[1], b[1]);
        });

        HashMap<Integer, Integer> targetIndex = new HashMap<>(); // O(n) -> Space

        for(int i = 0; i < n; i++){ // O(n)
            targetIndex.put(arr[i][1], i);
        }

        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);

        int minSwapsCount = 0;

        int i = 0;

        while(i < n){ // O(n)
            if(visited[i]){
                i++;
                continue;
            }

            int j = i;
            int cycleSize = 0;

            while(!visited[j]){
                visited[j] = true;
                j = targetIndex.get(nums[j]);
                cycleSize++;
            }

            if(cycleSize > 1){
                minSwapsCount += (cycleSize - 1);
            }
        }

        return minSwapsCount;
    }
}