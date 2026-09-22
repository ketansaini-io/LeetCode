class Solution {
    public String multiply(String num1, String num2){
        if(num1.charAt(0)=='0'||num2.charAt(0)=='0'){
            String s="0";
            return s;
        }
        char[] ans=new char[num1.length()+num2.length()];
        Arrays.fill(ans,'0');
        String max=num1;
        String min=num2;
        if(num1.length()<num2.length()){
            max=num2;
            min=num1;
        }
        int i=max.length()-1;
        
        while(i>=0){
            int j=min.length()-1;
            while(j>=0){
                int temp=(max.charAt(i)-'0')*(min.charAt(j)-'0');
                
            
                    ans[i+j+1]=(char)(temp+'0'+(int)(ans[i+j+1]-'0'));
                
                j--;
                
            }
            i--;
        }
        i=ans.length-1;
        while(i>0){
            if((int)(ans[i]-'0')>=10){
                char t=ans[i];
                ans[i]=(char)((t-'0')%10+'0');
                ans[i-1]=(char)((t-'0')/10+'0'+(ans[i-1]-'0'));
            }
            i--;
        }
        StringBuilder sb= new StringBuilder();
        if(ans[0]=='0'){
            for(i=1;i<ans.length;i++){
                   sb.append(ans[i]);
            }
            return sb.toString();
        }
        String s = new String(ans);
        return s;
        
    }

   
}