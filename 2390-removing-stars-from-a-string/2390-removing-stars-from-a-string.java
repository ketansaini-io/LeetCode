class Solution {
    public String removeStars(String s) {
        int i=0;
        StringBuilder sb=new StringBuilder();
        if(s.charAt(0)=='*'){
            i++;
        }
        while(i<s.length()){
            if(s.charAt(i)=='*'){
                sb.deleteCharAt(sb.length() - 1);
                i++;
            }
            else if(i<s.length()-1&&s.charAt(i+1)=='*'){
                i=i+2;
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}