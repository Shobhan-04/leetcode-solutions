class Solution {
    public void backtrack(String s, int start, List<String> currentPath, List<List<String>> result)
    {
        int n = s.length();
        if(start == n){
            result.add(new ArrayList<>(currentPath));
            return;
        }

        for(int end = start; end < n; end++){ // O(n)
            if(isPalindrome(s, start, end)){
                currentPath.add(s.substring(start, end + 1));
                backtrack(s, end + 1, currentPath, result);
                int m = currentPath.size();
                currentPath.remove(m - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int left, int right){
        while(left < right){
            char leftCh = s.charAt(left);
            char rightCh = s.charAt(right);

            if(leftCh != rightCh) return false;
            
            left++;
            right--;
        }

        return true;
    }

    public List<List<String>> partition(String s) {
        /*
            Time complexity = O(n * (2 ^ n)), 
            Space complexity = O(n) -> Auxilliary space for the ArrayList.
        */
        
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }
}