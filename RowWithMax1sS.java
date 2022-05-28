class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int r=n-1;
        int c=m-1;
        int maxRow=-1;
        outer: for(int j=0;j<=c;j++){
            for(int i=0;i<=r;i++){
                if(arr[i][j]==1){
                    maxRow=i;
                    break outer;
                }
                
            }
        }
        return maxRow;
    }
}
