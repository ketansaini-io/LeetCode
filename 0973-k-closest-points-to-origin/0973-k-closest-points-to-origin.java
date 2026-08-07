class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int [][]ans=new int[k][2];
        int []arr=new int[points.length];
        int []ind=new int[points.length];
        for(int i=0;i<points.length;i++){
            arr[i]=dis(points,i);
        }
        for(int i=0;i<points.length;i++){
            ind[i]=i;
        }
        for (int i = 0; i < points.length - 1; i++) {
        for (int j = 0; j < points.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
               int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                int tempt=ind[j];
                ind[j]=ind[j+1];
                ind[j+1]=tempt;
            }
        }
    }
    for(int i=0;i<k;i++){
        int x=ind[i];
        ans[i][0]=points[x][0];
        ans[i][1]=points[x][1];

    }
    return ans;

    }
    public int dis(int [][] points,int i){
         int ans=(int)Math.pow(points[i][0],2)+(int)Math.pow(points[i][1],2);
         return ans;
    }
}