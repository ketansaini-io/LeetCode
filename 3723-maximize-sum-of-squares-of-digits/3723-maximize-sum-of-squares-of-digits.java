class Solution {
    public String maxSumOfSquares(int num, int sum) {
     StringBuilder ans= new StringBuilder();
     if(num*9<sum){
        return ans.toString();
     }
     if(sum<=9){
        ans.append(sum);
        num--;
        while(num>0){
         ans.append(0);
         num--;
        }
     }
     else{
        while(sum>9){
            ans.append(9);
            sum-=9;
            num--;
        }
        ans.append(sum);
        num--;
        while(num>0){
         ans.append(0);
         num--;
        }
     }
     return ans.toString();
    }
}