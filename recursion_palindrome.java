import java.util.*;
public class Main{
    public static String reverse(String s){
        if(s.equals("")){
            return "";
        }
        else{
            return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        if(reverse(s1).equals(s1)){
            System.out.println("Palindrome");
        }
        else{
             System.out.println("Not Palindrome");
        }
    }
}
