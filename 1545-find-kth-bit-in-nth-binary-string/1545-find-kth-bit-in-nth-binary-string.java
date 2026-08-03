class Solution {
    public char findKthBit(int n, int k) {
        List<Character> word=s(n);
        return word.get(k-1);
    }
    public List<Character> revin(List<Character> str){
        List <Character> c= new ArrayList<>();
        for(int i=0;i<str.size();i++){
            c.add(str.get(i));
        }
        for(int i=0;i<c.size();i++){
            if(c.get(i).equals('0')){
                c.set(i, '1'); 
            }
            else{
                c.set(i, '0'); 
            }
        }
       for(int i=0;i<str.size()/2;i++){
        char temp=(char)c.get(i);
          c.set(i,c.get(c.size()-1-i));
          c.set(c.size()-i-1,temp);
       }
       return c;
    }
    public List<Character> s(int n){
        List <Character> st=new ArrayList<>();
        if(n==1){
           st.add('0');
           return st;
        }
        st=s(n-1);
        int l=st.size();
        st.addAll(revin(st));
        st.add(l,'1');
        return st;
    }
}