class Solution {
    public int eraseOverlapIntervals(int[][] in) {
        Arrays.sort(in, (a,b) -> a[1]-b[1]);
        int ans=0;
        int end=in[0][1];
        for(int i=1;i<in.length;i++){
            if(in[i][0]>= end)
                end=in[i][1];
            else
                ans++;    
        }
        return ans;

        
    }
}