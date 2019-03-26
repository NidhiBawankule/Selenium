import java.util.ArrayList;

public class Mylogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,5,5,5,4,6,9,6,4};
	      ArrayList<Integer> al=new ArrayList<Integer>();
	      
	      for(int i=0;i<a.length;i++)
	      {
	    	  al.add(a[i]);
	      }
	      al.sort(null);
	      
	     System.out.println(al);
	}

}