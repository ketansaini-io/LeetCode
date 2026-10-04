class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int []mag=new int[26];
        for(int i=0;i<26;i++){
            mag[i]=0;
        }
        for(int i=0;i<magazine.length();i++){
            mag[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(mag[ransomNote.charAt(i)-'a']==0){
                return false;
            }
            else{
                mag[ransomNote.charAt(i)-'a']--;
            }
        }
        return true;
    }
}