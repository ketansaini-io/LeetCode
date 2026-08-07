class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int [][]ans=new int[k][2];
        int [][]arr=new int[points.length][2];
        for(int i=0;i<points.length;i++){
            arr[i][0]=dis(points,i);
            arr[i][1]=i;
        }
        
    int sorted[][]=merge(arr);
    for(int i=0;i<k;i++){
        ans[i][0]=points[sorted[i][1]][0];
        ans[i][1]=points[sorted[i][1]][1];

    }
    return ans;

    }
    public int dis(int [][] points,int i){
         int ans=(int)((points[i][0])*(points[i][0]))+(int)((points[i][1])*(points[i][1]));
         return ans;
    }
    public static int[][] merge(int [][] arr){
            if(arr.length==1){
                return arr;
            }
            int mid=arr.length/2;
            int[][] left=Arrays.copyOfRange(arr,0,mid);
            int[][]right= Arrays.copyOfRange(arr, mid, arr.length);
          return sort(merge(left),merge(right));
        }
    public static int[][] sort(int [][] left,int[][] right){
            int[][] ans=new int[left.length+right.length][2];
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