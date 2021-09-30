import java.util.*;
class CoinCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=n%3;
        if(r==0){
            System.out.println(2*(n/3));

        }
        else if(r==1){
            System.out.println(2*(n/3)+1);
        }
        else{
            System.out.println(2*(n/3)+1);
        }
    }
}
