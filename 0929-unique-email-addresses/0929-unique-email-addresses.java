class Solution {
    public int numUniqueEmails(String[] emails) {
        /*
            Time complexity = O(n * m), 
            Space complexity = O(n)
        */
        
        int n = emails.length;
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < n; i++){ // O(n)
            String email = emails[i];
            int m = email.length();

            String validEmail = "";
            boolean plus = false, atTheRate = false;

            for(int j = 0; j < m; j++){ // O(m)
                char emailCh = email.charAt(j);

                if(emailCh == '@'){
                    atTheRate = true;
                    validEmail += emailCh;
                    continue;
                }

                if(atTheRate == true){
                    validEmail += emailCh;
                    continue;
                }

                if(emailCh == '+'){
                    plus = true;
                    continue;
                }

                if(plus == true){ // If you add a plus '+' in the local name, everything after the first plus sign will be ignored.
                    continue;
                }

                if(emailCh >= 'a' && emailCh <= 'z'){
                    validEmail += emailCh;
                }

                if(emailCh == '.'){
                    continue;
                }

                validEmail += emailCh;
            }

            set.add(validEmail);
        }

        return(set.size());
    }
}