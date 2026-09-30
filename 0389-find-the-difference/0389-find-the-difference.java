class Solution {
    public char findTheDifference(String s, String t) {
        int tb=0;
        int sb=0;
        for(int i=0;i<t.length();i++){
            tb+=(t.charAt(i)-'a');
        }
        for(int i=0;i<s.length();i++){
            sb+=(s.charAt(i)-'a');
        }
        return (char)(tb-sb+'a');
    }
}