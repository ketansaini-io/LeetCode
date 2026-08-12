class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int s=0;
        int e=height.length-1;
        while(s<e){
            int mh=height[s];
            if(height[s]>height[e]){
                mh=height[e];
            }
            if(mh*(e-s)>max){
                max=mh*(e-s);
            }
            if(height[s]>height[e]){
                e--;
            }
            else{
                s++;
            }
        }
        return max;
    }
}