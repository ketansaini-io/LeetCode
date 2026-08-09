class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==1){
            return intervals;
        }
        int[][] arr=split(intervals);
        int [][]ans=new int[intervals.length][2];
        int i=1;
        int k=0;
        int j=0;
        while(i<arr.length){
            int currentstart=arr[k][0];
            int currentend=arr[k][1];
            if(currentend>=arr[i][0]){
               while(i<arr.length&&currentend>=arr[i][0]){
                currentend=Math.max(arr[i][1],currentend);
                i++;
               }
            }
            k=i;
            ans[j][0]=currentstart;
            ans[j][1]=currentend;
            j++;

            
        }
        int [][]ans1=new int[j][2];
        for(i=0;i<j;i++){
            ans1[i][0]=ans[i][0];
            ans1[i][1]=ans[i][1];

        }
        
        return ans1;
    }
    public int[][] split(int[][] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[][] left = Arrays.copyOfRange(arr,0,mid);
        int[][] right = Arrays.copyOfRange(arr,mid,arr.length);
        return sort(split(left),split(right));
    }
    public int[][] sort(int[][] left, int[][] right){
        int [][] ans=new int[left.length+right.length][2];
        int i=0;
        int j=0;
        while(i<left.length&&j<right.length){
            if(left[i][0]>right[j][0]){
                ans[i+j][0]=right[j][0];
                ans[i+j][1]=right[j][1];
                j++;
            }
            else{
              ans[i+j][0]=left[i][0];
                ans[i+j][1]=left[i][1];
                i++;
            }
        }
        if(i>=left.length){
            while(j<right.length){
                ans[i+j][0]=right[j][0];
                ans[i+j][1]=right[j][1];
                j++;
            }
        }
        if(j>=right.length){
            while(i<left.length){
               ans[i+j][0]=left[i][0];
                ans[i+j][1]=left[i][1];
                i++;
            }
        }
        return ans;
    }
}