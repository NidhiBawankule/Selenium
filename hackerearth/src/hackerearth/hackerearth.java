package hackerearth;

import java.math.BigInteger;
import java.util.*;
public class hackerearth {
public static void main(String ar[]){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int count=0;
long res=1000000000000L;
if(a>=1 && b<=res) {
for(int i=1;i<=a;i++){
if(a%i==0 && b%i==0)
count=count+1;
}
}
System.out.println(count);
}
}
