class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int i=0;
        Map<String, String> map = new HashMap<>();
        for (i=0;i<knowledge.size();i++) {
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        i=0;
        StringBuilder sb= new StringBuilder();
        while(i<s.length()){
            if(s.charAt(i)=='('){
                int j=i;
                while(s.charAt(j)!=')'){
                    j++;
                }
                
            
                int l=0;
                int v=0;
                sb.append(map.getOrDefault(s.substring(i+1,j),"?"));
                
                i=j+1;
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}