class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb= new StringBuilder();
        StringBuilder asb= new StringBuilder(a);
        StringBuilder bsb= new StringBuilder(b);
        int c=0;
        if(asb.length()>bsb.length()){
            while(bsb.length()!=asb.length()){
                bsb.insert(0,'0');
            }
        }
        else if(b.length()>a.length()){
            while(bsb.length()!=asb.length()){
                asb.insert(0,'0');
            }
        }
        int i=asb.length()-1;
        while(i>=0){
            if(c+(asb.charAt(i)-'0')+(bsb.charAt(i)-'0')>2){
                sb.append(1);
                c=1;
            }
            else if(c+(asb.charAt(i)-'0')+(bsb.charAt(i)-'0')==2){
                sb.append(0);
                c=1;
            }
            else if(c+(asb.charAt(i)-'0')+(bsb.charAt(i)-'0')==1){
                sb.append(1);
                c=0;
            }
            else{
                sb.append(0);
                c=0;
            }
            i--;
        }
        if(c==1){
            sb.append(1);
        }
        for(i=0;i<sb.length()/2;i++){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(sb.length()-1-i));
            sb.setCharAt(sb.length()-1-i,temp);
        }
        return sb.toString();
    }
}