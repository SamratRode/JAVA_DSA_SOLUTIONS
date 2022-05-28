class Solution {
    int median(int matrix[][], int r, int c) {
        int median;
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                al.add(matrix[i][j]);
            }
        }
        Collections.sort(al);
        
        int med=0;
        if((r*c)%2==0){
            int e1=al.get(((r*c)-2)/2);
            int e2=al.get(((r*c)-2)/2+1);
            med=(e1+e2)/2;
        }
        else{
            med=al.get(((r*c)-1)/2);
        }
        return med;
    }
}
