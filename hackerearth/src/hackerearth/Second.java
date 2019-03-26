package hackerearth;

import java.util.Scanner;

public class Second {
	    public static void main(String args[]){
	Scanner s = new Scanner(System.in);
			    long n = s.nextLong();   
			    long m=s.nextLong();
			    int small=0;
			    int count=0;
			    double res=Math.pow(10,12);
			    if(n==0 || m==0){
			        return;
			    }
			    if(n<=1 && m>=res){
			        return;
			    }
			    if(n>=1 && m<=res) {
			    if(n<m) 
			       small=(int)n/2;
			   else
			    small=(int)m/2;

			     for(int i=1;i<=n;i++){
	if(n%i==0 && m%i==0)
	count=count+1;
	}
	}
	System.out.println(count);
	}
	}
