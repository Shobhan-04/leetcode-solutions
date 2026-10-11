class Solution {
    public int leastUpperBound(int[] arr, int x){
        int n = arr.length;
        int left = 0, right = (n - 1);
        int ans = 0;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == x) return mid;
            else if(arr[mid] < x){
                ans = mid;
                left = (mid + 1);
            }else{
                right = (mid - 1);
            }
        }

        return ans;
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        /*
            Time: (O(log n + k(log k)) — binary search, selection of (k) elements, and sorting the result.
            Auxiliary space: (O(k)) for the result list, excluding the output itself.
        */
        
        int n = arr.length;
        List<Integer> result = new ArrayList<>();

        int i = leastUpperBound(arr, x);
        int j = (i + 1);
        
        while(k > 0 && i >= 0 && j < n){
            if(Math.abs(x - arr[i]) <= Math.abs(x - arr[j])){
                result.add(arr[i--]);
            }else{
                result.add(arr[j++]);
            }
            k--;
        }

        while(k > 0 && i >= 0){
            result.add(arr[i--]);
            k--;
        }

        while(k > 0 && j < n){
            result.add(arr[j++]);
            k--;
        }

        Collections.sort(result);

        return result;
    }
}