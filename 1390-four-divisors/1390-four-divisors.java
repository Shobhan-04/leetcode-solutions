class Solution {
    public int sumFourDivisors(int[] nums) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n)
        */
        
        int n = nums.length;
        HashMap<Integer, List<Integer>> resultMap = new HashMap<>();
        int sumOfDivisors = 0;

        for(int num : nums){ // O(n)
            // calculate and store divisors only when the number is not already in the map.
            if(!resultMap.containsKey(num)){ // Check for a new number each time.
                int sqrt = (int) Math.sqrt(num);
                List<Integer> divisors = new ArrayList<>();

                for(int i = 1; i <= sqrt; i++){
                    if(num % i == 0){
                        divisors.add(i);

                        if(i != (num / i)){
                            divisors.add(num / i);
                        }
                    }
                }

                Collections.sort(divisors);
                resultMap.put(num, divisors);
            }
         
            List<Integer> divisors = resultMap.get(num);

            int divisorsCount = divisors.size();

            if(divisorsCount == 4){
                for(int i = 0; i < divisorsCount; i++){
                    sumOfDivisors += divisors.get(i);
                }
            }
        }

        return sumOfDivisors == 0 ? 0 : sumOfDivisors;
   }
}