import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s1="samrat";
		String s2="rode";
		String s="rodesamrat";
		String s3=s1+s2;
		//To check whether s is made from shuffling s1 and s2
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		TreeMap<Character,Integer> tm1=new TreeMap<Character,Integer>();
		char[] c_s3=new char[s3.length()];
		for(int i=0;i<s3.length();i++){
		    c_s3[i]=s3.charAt(i);
		}
		char[] c_s=new char[s.length()];
		for(int i=0;i<s.length();i++){
		    c_s[i]=s.charAt(i);
		}
		for(int i=0;i<s.length();i++){
		    tm.put(c_s[i],tm.getOrDefault(c_s[i],0)+1);
		    
		}
		for(int i=0;i<s3.length();i++){
		    
		    tm1.put(c_s3[i],tm1.getOrDefault(c_s3[i],0)+1);
		}
		if(tm.equals(tm1)){
		    System.out.println("Shuffled");
		}
		else{
		    System.out.println("Not Shuffled");
		}
		System.out.println(tm);
		System.out.println(tm1);
	}
}
