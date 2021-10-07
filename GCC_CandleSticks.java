import java.net.SocketImpl;
import java.util.*;
public class GCC_CandleSticks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        // System.out.println(s);
        
        
        ArrayList<Integer> a=new ArrayList<Integer>();
        //1.
        // String[] s1=new String[n];
        // s1=s.split(" ");
        // for(int i=0;i<n;i++){
        // a.add(s1);
        // }
        // }

        //2.
        // String[] arr_s=s.split(" ");
        // for(String a1:arr_s){
        //     a.add(Integer.parseInt(a1));

        // }
        //3.
        for(int i=0;i<n;i++){
              
                // a = Integer.parseInt(str);
                // System.out.println(Integer.parseInt(s.split(" ")[i]));
                a.add(Integer.parseInt(s.split(" ")[i]));
             
            
        }
        // System.out.println(a);

        int count=n-1;
        int max=-1;
        for(int i=0;i<n-2;i++){
            LinkedList<Integer> b=new LinkedList<Integer>();
            int j=i+2;
            while(j<n){
                int min;
                
                if(a.get(j-1)>max)
                {
                    b.addFirst(a.get(j-1));
                    max=a.get(j-1);
                     
                }
                // else{
                //     continue;
                // }
                else{
                    b.add(a.get(j-1));
                    max=a.get(j-1);
                }
                // ArrayList<Integer> c=new ArrayList<Integer>();
                // c.add((a.get(i)));
                // c.add((a.get(j)));
                if(a.get(i)>=a.get(j)){
                    min=a.get(j);
                }
                else{
                    min=a.get(i);
                }
                System.out.println(b);
                if(b.get(0)<min){
                    System.out.println(b.get(0)+" < "+min);
                    count=count+1;
                    b.clear();
                    // c.remove(0);
                    // c.remove(1);
                }j++;

            }
        }
        System.out.println(count);
    }
}
