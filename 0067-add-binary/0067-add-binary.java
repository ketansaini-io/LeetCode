class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb= new StringBuilder();
        StringBuilder asb= new StringBuilder(a);
        StringBuilder bsb= new StringBuilder(b);
        int c=0;
        if(asb.length()>bsb.length()){
            bsb.reverse();
            while(bsb.length()!=asb.length()){
                bsb.append('0');
            }
            bsb.reverse();
        }
        else if(b.length()>a.length()){
            asb.reverse();
            while(bsb.length()!=asb.length()){
                asb.append('0');
            }
            asb.reverse();
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
        sb.reverse();
        return sb.toString();
    }
}