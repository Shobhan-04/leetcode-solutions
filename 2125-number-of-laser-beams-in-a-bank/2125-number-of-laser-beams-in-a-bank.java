class Solution {
    public int numberOfBeams(String[] bank) {
        /*
            Time complexxity = O(n * m), 
            Space complexity = O(n) 
        */
        
        int n = bank.length;
        int totalLaserBeamsCount = 0;
        int prevDeviceCount = 0;

        for(int i = 0; i < n; i++){
            String laser = bank[i];
            int currDeviceCount = 0;
            int m = laser.length();

            for(int j = 0; j < m; j++){
                char laserCh = laser.charAt(j);
                if(laserCh == '1') currDeviceCount++;
            }

            totalLaserBeamsCount += (prevDeviceCount * currDeviceCount);

            if(currDeviceCount != 0) prevDeviceCount = currDeviceCount;
        }

        return totalLaserBeamsCount;
    }
}