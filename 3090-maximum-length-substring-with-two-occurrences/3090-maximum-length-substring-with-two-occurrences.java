class Solution {
    public int maximumLengthSubstring(String s) {
        int i=0;
        int j=0;
        int maxi=0;
        int[] arr=new int[26];
        Arrays.fill(arr,0);
        while(i<s.length()){
            arr[(int)(s.charAt(i)-'a')]++;
           while(arr[(int)(s.charAt(i)-'a')]>2){
            arr[(int)(s.charAt(j)-'a')]--;
            j++;
           } 
           maxi=Math.max(maxi,i-j+1);
           i++;
        }
        return maxi;
    }
}