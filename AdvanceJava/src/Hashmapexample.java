import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "hello");
		hm.put(2, "I");
		hm.put(3, "am");
		hm.put(4, "john");
		System.out.println(hm);
		System.out.println(hm.replace(4,"Tom"));
		System.out.println(hm);
		System.out.println(hm.size());
		Set sn=hm.entrySet();
		Iterator it=sn.iterator();
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
