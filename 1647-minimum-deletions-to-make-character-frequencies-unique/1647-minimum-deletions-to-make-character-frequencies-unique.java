class Solution {
    public int minDeletions(String s) {
        int [] ans=new int [26];
        for(int i=0;i<s.length();i++){
          ans[s.charAt(i)-'a']++;
        }
        Arrays.sort(ans);
        int min=0;
        int i=0;
        while(i<26){
            boolean same=false;
            if(ans[i]!=0){
                int j=0;
                while(j<26){
                    if(i!=j&&ans[i]==ans[j]){
                        System.out.println(j);
                        min++;
                        ans[i]--;
                        same=true;
                        break;
                    }
                    j++;
                }
            }
            if(!same){
                i++;
            }
        }
        return min;
    }
}