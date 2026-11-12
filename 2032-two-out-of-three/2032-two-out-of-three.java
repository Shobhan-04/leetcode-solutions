class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        HashMap<Integer, Integer> map = new HashMap<>();

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1) set.add(num);
        for (int num : set) map.put(num, 1);

        set.clear();

        for (int num : nums2) set.add(num);
        for (int num : set) map.put(num, map.getOrDefault(num, 0) + 1);

        set.clear();

        for (int num : nums3) set.add(num);
        for (int num : set) map.put(num, map.getOrDefault(num, 0) + 1);

        List<Integer> result = new ArrayList<>();

        for (int num : map.keySet()) {
            if (map.get(num) >= 2) {
                result.add(num);
            }
        }

        return result;
    }
}