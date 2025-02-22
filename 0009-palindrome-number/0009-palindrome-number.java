class Solution {
    public boolean isPalindrome(int x) {
        
        int last;
        int temp=x;
        int rev=0;
        while(x>0){
            last = x%10;
            rev=rev*10+last;
            x=x/10;
        }
        if(temp<0){
            return false;
        }
        return (rev==temp)? true:false;
        
    }
}