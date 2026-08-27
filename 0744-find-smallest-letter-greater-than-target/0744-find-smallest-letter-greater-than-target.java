class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e= letters.length-1;
        int ans=0;
        if( letters[letters.length-1]<=target){
            return letters[0];
        }
        while(s<=e){
            int middle= s + (e-s)/2;
            if(letters[middle]>target){
                e=middle-1;
                ans=middle;
            }
            if(letters[middle]<=target){
                s=middle+1;
            }

        }
        return letters[ans];
    }
}