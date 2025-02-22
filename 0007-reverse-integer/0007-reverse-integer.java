class Solution {
    public int reverse(int x) {
        int temp=x;
        if(x<0){
            x=x*-1;
        }

        int rev=0,last;
        
        while(x>0){
		  last=x%10;
          if (rev > (Integer.MAX_VALUE - last) / 10) {
              return 0; 
         }
		  rev=rev*10+last;
		  x=x/10;
		}

        return (temp<0)?(-rev):rev;
        
    }
}