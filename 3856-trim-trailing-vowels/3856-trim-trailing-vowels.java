class Solution {
    public String trimTrailingVowels(String s) {
     StringBuilder sb= new StringBuilder();
     int leave=0;
     for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            leave++;
        }
        else{
            break;
        }
     } 
     for(int i=0;i<s.length()-leave;i++){
        sb.append(s.charAt(i));
     }
     return sb.toString();  
    }
}