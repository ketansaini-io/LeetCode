class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int[] arr= new int[score.length];
        for(int i=0;i<score.length;i++){
            arr[i]=score[i][k];
        }
         Arrays.sort(arr);
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        int[][] ans= new int[score.length][score[0].length];
        for(int i=0;i<score.length;i++){
            int j=0;
            for( j=0;j<score.length;j++){
                if(arr[i]==score[j][k]){
                    break;
                }
            }
            for(int l=0;l<score[0].length;l++){
                ans[i][l]=score[j][l];
            }
        }
        return ans;
    }
}