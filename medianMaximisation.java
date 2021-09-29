import java.util.*;


class medianMaximisation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases");
        int t=sc.nextInt();
        while(t>0){
            System.out.println("Enter sum");
            int s=sc.nextInt();
            System.out.println("Enter number of elements in set");
            int n=sc.nextInt();
            ArrayList<Integer> ans=new ArrayList<Integer>();
            int a=s/n;
            // System.out.println("a " + a);
            for(int i=0;i<n;i++){
                ans.add(a);
            }
            int r=s%n;

            int last=n-1;
            while(r>0){
                ans.set(last,(ans.get(last)+1));
                last=last-1;





                r=r-1;

            }
            System.out.println("Set which contains maximum median is here "+ ans);
            if(n%2==0){
                System.out.println((ans.get(n/2)+ans.get(n/2+1))/2);
            }
            else{
                System.out.println(ans.get(n/2+1));
            }





            t=t-1;
        }
    
    }
    
}
