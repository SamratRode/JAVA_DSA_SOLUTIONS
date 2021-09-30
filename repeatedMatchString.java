import java.util.*;
public class Main{
    public static void main(String[] args){
        int i=1;
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        
        String check=a;
        while(true){
            if(check.contains(b)){
                break;
            }
            check=a+check;
            i++;
        }
        System.out.println(i);
    }
}
