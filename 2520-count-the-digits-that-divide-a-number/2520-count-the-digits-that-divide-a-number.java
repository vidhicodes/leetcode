class Solution {
    public int countDigits(int num) {

        int temp=num;
        int ans=0;
        int factor;

        while(num>0){
            factor=num%10;
            if(temp%factor==0){
                ans++;
            }
            num=num/10;
        }
        

        return ans;
    }
}