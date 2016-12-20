import java.util.*;
class vectortest{
	public static void main(String args[]){
		Vector<String> v=new Vector<>();
		v.add("1");
		v.add("2");
		Iterator i=v.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
