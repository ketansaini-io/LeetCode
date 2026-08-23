class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))&&(int)s.charAt(i)<96){
                sb.append( (char)((int)s.charAt(i)+32)+"" );
            }
            else{
                sb.append(s.charAt(i)+"");
            }
        }
        return sb.toString();
    }
}