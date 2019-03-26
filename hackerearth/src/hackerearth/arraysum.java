package hackerearth;
import java.util.*;
public class arraysum {
	public static void main(String args[] ) throws Exception {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();
	sum=sum+arr[i];
	}
	System.out.println((sum/n)+1);
	}
	}


