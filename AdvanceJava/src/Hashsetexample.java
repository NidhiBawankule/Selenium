
import java.util.*;
public class Hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> sr=new HashSet<String>();
		     sr.add("India");
		     sr.add("US");
		     sr.add("UK");
		     sr.add("Europe");
		     sr.add("Europe");
		     System.out.println(sr);
		     System.out.println(sr.size());
		     System.out.println(sr.isEmpty());
		     Iterator<String> i=sr.iterator();
		     while(i.hasNext())
		     {
		    	 System.out.println(i.next());
		     }
		   
			}

	}


