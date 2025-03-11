class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l=0;
        int r=0;
        int mn=Integer.MAX_VALUE;
        int ct=0;
        int size=blocks.length()-1;
        while(r<size){
            if(r-l+1<k){
                r++;
            }
            else if(r-l+1==k){
                ct=0;
                int i;
                for(i=l;i<=r;i++){
                    if(blocks.charAt(i)=='W'){
                        ct++;
                    }
                }
                mn=Math.min(mn,ct);
                l++;
                r++;
            }

        }

        return mn;
        
    }
}