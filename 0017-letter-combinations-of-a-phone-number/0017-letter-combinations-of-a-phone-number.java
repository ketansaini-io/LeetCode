class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        String one=mapping(digits.charAt(0));
        for(int i=0;i<one.length();i++){
            ans.add(""+one.charAt(i));
        }
        
        return subs(digits,1,ans);
    }
   public List<String> subs(String digits,int i,List<String> ans){
    if(i==digits.length()){
        return ans;
    }
    String curr=mapping(digits.charAt(i));
    List<String> future=new ArrayList<>();
    for(int j=0;j<curr.length();j++){
         for(int l=0;l<ans.size();l++){
            future.add(ans.get(l)+""+curr.charAt(j));
         }
    }
    return subs(digits,i+1,future);
   }
   public String mapping(char i){
    if(i=='2'){
        return "abc";
    }
    else if(i=='3'){
        return "def";
    }
    else if(i=='4'){
        return "ghi";
    }
    else if(i=='5'){
        return "jkl";
    }
    else if(i=='6'){
        return "mno";
    }
    else if(i=='7'){
        return "pqrs";
    }
    else if(i=='8'){
        return "tuv";
    }
    
        return "wxyz";
    
   }
}