class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> mp = new HashMap<>() ;
	    char[] parr = p.toCharArray() ;
	    int k = p.length() ;
	    int r = 0 ;
	    int l = 0 ;
	    List<Integer> ans = new ArrayList<>() ;
	    
	    for(int i=0;i<parr.length;i++){
	        mp.put(parr[i],mp.getOrDefault(parr[i],0)+1);
	    }
	    
	    int count = mp.size();
	    
	    while(r<s.length()){
	        char c = s.charAt(r);
	        
	        if(mp.containsKey(c)){
	            mp.put(c,mp.get(c)-1);
	            if(mp.get(c)==0){
	                count--;
	            }
	        }
	        
	        if(r-l+1<k){
	            r++;
	        }else if(r-l+1==k){
	            if(count==0){
	                ans.add(l);
	            }
	            
	            char lchar = s.charAt(l);
	            if(mp.containsKey(lchar)){
	                if(mp.get(lchar)==0){
	                count++;
	                }
	                mp.put(lchar,mp.get(lchar)+1);
	            }
	            
	            l++;
	            r++;
	            
	        }
	        
	    }
	    
	    
	    return ans;
        
    }
}