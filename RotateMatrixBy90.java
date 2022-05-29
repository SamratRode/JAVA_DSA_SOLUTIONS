/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] matrix=new int[r][c];
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        matrix[i][j]=sc.nextInt();
		    }
		}
		System.out.println("Original Matrix");
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        al.add(matrix[i][j]);
		        System.out.print(matrix[i][j]+" ");
		    }
		    System.out.println();
		}
// 		System.out.println("Matrix after rotating ninety degrees clockwise");
		int x=0;
		for(int j=c-1;j>=0;j--){
		    for(int i=0;i<r;i++){
		        matrix[i][j]=al.get(x++);
		    }
		}
		System.out.println("Matrix after rotating ninety degrees clockwise");
		
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		      
		        System.out.print(matrix[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
