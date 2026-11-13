class Solution {
    public String destCity(List<List<String>> paths) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n)
        */
        
        String destinationCity = "";
        int n = paths.size();
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < n; i++){ // O(n)
            set.add(paths.get(i).get(0));
        }

        for(List<String> path : paths){
            if(!set.contains(path.get(1))) destinationCity = path.get(1);
        }

        return destinationCity;
    }
}