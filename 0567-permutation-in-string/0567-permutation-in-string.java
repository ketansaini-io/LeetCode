class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l=0;
        int r=s1.length();
        int [] s1a=new int[26];;
        for(int i=0;i<s1a.length;i++){
            s1a[i]=0;
        }
       for(int i=0;i<s1.length();i++){
            s1a[(int)s1.charAt(i)-97]++;
        }
        while(r<s2.length()+1){
            int [] s2a=new int[26];;
        for(int i=0;i<s2a.length;i++){
            s2a[i]=0;
        }
       for(int i=l;i<r;i++){
            s2a[(int)s2.charAt(i)-97]++;
        }
        if(Arrays.equals(s1a, s2a)){
            return true;
        }
        else{
            l++;
            r++;
        }
        }
        return false;
    }
   
}