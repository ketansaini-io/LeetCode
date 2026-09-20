class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int product=(-1)*(i+1)*(s.charAt(i)-'z'-1);
            sum+=product;
        }
        return sum;
    }
}