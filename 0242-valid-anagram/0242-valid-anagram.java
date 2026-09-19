class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] sa=new int[26];
        int[] ta=new int[26];
        for(int i=0;i<26;i++){
            sa[i]=0;
        }
        for(int i=0;i<26;i++){
            ta[i]=0;
        }
        for(int i=0;i<s.length();i++){
            sa[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            ta[t.charAt(i)-'a']++;
        }
        
        return Arrays.equals(ta, sa);
    }
}