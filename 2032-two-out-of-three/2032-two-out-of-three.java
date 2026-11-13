class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        /*
            Time complexity = O(n1 + n2 + n3), 
            Space complexity = O(n1 + n2 + n3) + O(n)
        */
        
        int n1 = nums1.length, n2 = nums2.length, n3 = nums3.length;
        
        HashMap<Integer, Integer> map1 = new HashMap<>();
        for(int i = 0; i < n1; i++){
            int num1 = nums1[i];
            map1.put(num1, map1.getOrDefault(num1, 0) + 1);
        }

        HashMap<Integer, Integer> map2 = new HashMap<>(); 
        for(int i = 0; i < n2; i++){
            int num2 = nums2[i];
            map2.put(num2, map2.getOrDefault(num2, 0) + 1);
        }

        HashMap<Integer, Integer> map3 = new HashMap<>(); 
        for(int i = 0; i < n3; i++){
            int num3 = nums3[i];
            map3.put(num3, map3.getOrDefault(num3, 0) + 1);
        }

        HashSet<Integer> commonSet = new HashSet<>();
        
        for(int i = 0; i < n1; i++){
            int num1 = nums1[i];

            if(map2.containsKey(num1) || map3.containsKey(num1)){
                commonSet.add(num1);
            }
        }

        for(int i = 0; i < n2; i++){
            int num2 = nums2[i];

            if(map1.containsKey(num2) || map3.containsKey(num2)){
                commonSet.add(num2);
            }
        }

        for(int i = 0; i < n3; i++){
            int num3 = nums3[i];

            if(map1.containsKey(num3) || map2.containsKey(num3)){
                commonSet.add(num3);
            }
        }

        int m = commonSet.size();
        
        List<Integer> answerLst = new ArrayList<>();

        for(int value : commonSet){
            answerLst.add(value);
        }

        return(answerLst);
    }
}