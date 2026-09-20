class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a=coordinates.charAt(0)-(int)'a'+1;
        int b=coordinates.charAt(1)-'1'+1;
        if((a%2==0&&b%2==0)||(a%2!=0&&b%2!=0)){
            return false;
        }
        return true;
    }
}