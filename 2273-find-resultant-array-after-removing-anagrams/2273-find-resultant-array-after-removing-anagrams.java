class Solution {
    public boolean checkAnagram(String s1, String s2){
        int[] freq = new int[26];
        Arrays.fill(freq, 0); // Fill the entire freq array with 0.

        int m = s1.length(), n = s2.length();

        if(m != n) return false; // Return false, if the size of m and n doesn't match.

        for(int i = 0; i < m; i++){
            char s1Ch = s1.charAt(i);
            char s2Ch = s2.charAt(i);

            freq[s1Ch - 'a']++; // Increment if character encountered for the first time.
            freq[s2Ch - 'a']--; // Decrement if the character encountered for more than the second time.
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] != 0) return false;
        }

        return true;
    }

    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        List<String> result = new ArrayList<>();
        result.add(words[0]); // add the first word directly into the result.

        for(int i = 1; i < n; i++){
            String word = words[i];
            String wordPrev = result.get(result.size() - 1);

            /*
                In one operation, select any index i such that 0 < i < words.length and words[i - 1] and words[i] are anagrams, and delete words[i] from words. Keep performing this operation as long as you can select an index that satisfies the conditions.
            */
            if(!checkAnagram(word, wordPrev)){ 
                result.add(word); // Add into the resultant array ArrayList after removing the anagrams.
            }
        }

        return result; // Return words after performing all operations in form of ArrayList.
    }
}