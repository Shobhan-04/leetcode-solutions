class Solution {
    public String licenseKeyFormatting(String s, int k) {
        /*
            Time complexity = O(n), 
            Space complexity = O(n) -> Auxilliary space for the StringBuilder. 
        */
        
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        String reformattedLicenseKey = "";
        int count = 0;

        for(int i = n - 1; i >= 0; i -= 1){ // Iterating backwards for forming the groups
            char sCh = s.charAt(i);

            if(sCh == '-') continue;

            if(count == k){
                sb.append('-');
                count = 0;
            }

            sb.append(Character.toUpperCase(sCh));
            count++;
        }

        // Reverse the reformatted string as we iterated backwards.
        reformattedLicenseKey = sb.reverse().toString();
        return(reformattedLicenseKey); // Return the reformatted license key.
    }
}