class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int distinctElemSum = 0;

        int i = 0;

        while(i < n){
            HashSet<Integer> set = new HashSet<>();
            int j = i;

            while(j < n){
                set.add(nums.get(j));
                distinctElemSum += (int) Math.pow(set.size(), 2);
                j++;
            }

            i++;
        }

        return distinctElemSum;
    }
}