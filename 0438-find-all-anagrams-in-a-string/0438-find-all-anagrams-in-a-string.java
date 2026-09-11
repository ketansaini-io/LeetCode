class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
         if(p.length()>s.length()){
            return list;
        }
        int l=0;
        int r=p.length()-1;
        List<Integer>l1=new ArrayList<>(26);
        List<Integer>l2=new ArrayList<>(26);
        for(int i=0;i<26;i++){
            l1.add(0);
        }
        for(int i=0;i<26;i++){
            l2.add(0);
        }
        for(int i=0;i<p.length();i++){
            l1.set(p.charAt(i)-'a',l1.get(p.charAt(i)-'a')+1);
        }
        for(int i=0;i<p.length();i++){
            l2.set(s.charAt(i)-'a',l2.get(s.charAt(i)-'a')+1);
        }
        while(r<s.length()){
          if(l1.equals(l2)){
            list.add(l);
          }
          r++;
          if(r==s.length()){
            break;
          }
          l2.set(s.charAt(l)-'a',l2.get(s.charAt(l)-'a')-1);
          l2.set(s.charAt(r)-'a',l2.get(s.charAt(r)-'a')+1);
          
          l++; 
          
          
        }
        return list;
    }
    }

