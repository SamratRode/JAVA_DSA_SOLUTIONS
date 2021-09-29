import java.util.*;

class Main{
    
    
    public static void main(String[] args){
        int n;
        ArrayList<Integer> entries=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        n=sc.nextInt();
        

        
        int count=1;
        for(int l=0;l<(n*n);l=l+1){
            entries.add(0);
        }
        
        for(int j=0;j<(n*n);j=j+2){
            entries.set(j,count);
            count++;
        }
        for(int k=1;k<(n*n);k=k+2){
            entries.set(k,count);
            count++;
        }
        System.out.println(entries);
        System.out.println("Enter number of queries");
        int q=sc.nextInt();
        ArrayList<Integer> results=new ArrayList<Integer>();
        while(q>0){
            System.out.println("Enter row");
            int ent1=sc.nextInt();
            System.out.println("Enter column");
            int ent2=sc.nextInt();
            int element_to_find=(ent1-1)*n+(ent2-1);
            results.add(entries.get(element_to_find));
            q=q-1;




    }
    System.out.println(results);

}
}
