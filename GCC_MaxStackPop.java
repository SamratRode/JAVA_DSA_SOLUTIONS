import java.util.*;
class GCC_MaxStackPop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int maxSum=sc.nextInt();
        Stack<Integer> s1=new Stack<Integer>();
        Stack<Integer> s2=new Stack<Integer>();
        for(int i=0;i<n1;i++){
            s1.push(sc.nextInt());
        }
        for(int i=0;i<n2;i++){
            s2.push(sc.nextInt());
        }
        
        int sum=0;
        int count=0;
        while(true){
            if(s1.lastElement()<=s2.lastElement && sum<=maxSum && !(s1.isEmpty()) ){
                sum=sum+s1.pop()
                
                count=count+1;
            }
            else if(s1.lastElement()>s2.lastElement() && sum<=maxSum && !(s2.isEmpty())){
                sum=sum+s2.pop()
               
                count=count+1;
            }
            else{
                System.out.println(count);
            }
            

        }

    }
}
