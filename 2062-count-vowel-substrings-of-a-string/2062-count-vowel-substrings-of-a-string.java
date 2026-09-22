class Solution {
    public boolean isVowel(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) return false;
        }

        return true;
    }

    public int countVowelSubstrings(String word) {
        /*
            Time complexity = O(n^2) 
            Space complexity = O(5) = O(1)
        */
        
        int n = word.length();
        int[] vowels = new int[5]; // stores the vowels.

        int vowelSubStringCount = 0;

        for(int i = 0; i < n; i++){
            Arrays.fill(vowels, 0);
            
            for(int j = i; j < n; j++){
                char ch = word.charAt(j);

                if(ch == 'a') vowels[0]++;
                else if(ch == 'e') vowels[1]++;
                else if(ch == 'i') vowels[2]++;
                else if(ch == 'o') vowels[3]++;
                else if(ch == 'u') vowels[4]++;
                else break;

                if(isVowel(vowels)) vowelSubStringCount++;
            }
        }

        return vowelSubStringCount;
    }
}