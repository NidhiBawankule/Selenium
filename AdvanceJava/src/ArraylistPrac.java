import java.util.ArrayList;

public class ArraylistPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> sr=new ArrayList<String>();
     sr.add("nidhi");
     sr.add("knows");
     sr.add("core");
     sr.add("java");
     System.out.println(sr);
     sr.add(2,"and" );
     sr.add(3,"practice" );
     System.out.println(sr);
    System.out.println(sr.indexOf("core"));
    System.out.println(sr.size());
    System.out.println(sr.subList(3,6));
    System.out.println(sr.isEmpty());
     sr.remove(0);
     System.out.println(sr);
     sr.sort(null);
     System.out.println(sr);
	}

}
