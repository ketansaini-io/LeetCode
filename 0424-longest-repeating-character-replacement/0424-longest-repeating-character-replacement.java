class Solution {
    public int characterReplacement(String s, int k) {
        
 int max=1;
        int i=0;
        int j=1;
        int[] arr=new int[26];
        for( i=0;i<arr.length;i++){
            arr[i]=0;
        }
        arr[s.charAt(0)-'A']=1;
        int maxFreq=1;
        i=0;
        while(j<s.length()){
           arr[s.charAt(j)-'A']++;
           if(maxFreq<arr[s.charAt(j)-'A']){
            maxFreq=arr[s.charAt(j)-'A'];
           }
           if(j-i+1-maxFreq>k){
            arr[s.charAt(i)-'A']--;
            i++;
           }
           else{
            if(j-i+1>max){
                max=j-i+1;
            }
           }
           
           j++;
           
        }
        return max;

        
    }
}