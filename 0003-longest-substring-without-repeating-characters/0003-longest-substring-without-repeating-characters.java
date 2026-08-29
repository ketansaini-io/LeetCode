class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        List<Integer> list=new ArrayList<>(Collections.nCopies(1000, 0));
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        while(i<s.length()&&j<s.length()){
            list.set((int)s.charAt(i),list.get((int)s.charAt(i))+1);
            while(list.get((int)s.charAt(i))>1){
                list.set((int)s.charAt(j),list.get((int)s.charAt(j))-1);
                j++;
            }
            if(max<i-j+1){
                max=i-j+1;
            }
            i++;
        }
        return max;
    }
}