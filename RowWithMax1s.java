import java.util.*;
class Main {
    public static void main(String[] args){
        int n=4;
        int m=4;
        int[][] arr = {{0, 1, 1, 1},{0, 0, 1, 1},{1, 1, 1, 1},{0, 0, 0, 0}};
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
            hm.put(i,count);
        }
        System.out.println(hm);
        int maxRow=-1;
        int max=0;
        for(Map.Entry mapping: hm.entrySet()){
            if((int)mapping.getValue()>max){
                maxRow=(int)mapping.getKey();
            }
        }
        System.out.println(maxRow);
    }
}
