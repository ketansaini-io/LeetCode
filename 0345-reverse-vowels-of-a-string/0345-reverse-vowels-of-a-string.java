class Solution {
    public String reverseVowels(String s) {
        char []arr=new char[s.length()];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.charAt(i);
        }
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            while("aeiouAEIOU".indexOf(arr[i]) == -1&&i<arr.length-1){
                i++;
            }
            while("aeiouAEIOU".indexOf(arr[j]) == -1&&j>=1){
                j--;
            }
            if(i<=j&&"aeiouAEIOU".indexOf(arr[i]) != -1&&"aeiouAEIOU".indexOf(arr[j]) != -1){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
            i++;
                j--;
        }
        String ans="";
        for(i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        return ans;
    }
}