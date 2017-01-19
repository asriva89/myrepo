package basic;
import java.util.*;
public class SortMountains {
	
	LinkedList<Mountain> mtn = new LinkedList<Mountain>();
	class NameCompare implements Comparator<Mountain>
	{
		public int compare(Mountain one,Mountain two)
		{
			return one.getMountainName().compareTo(two.getMountainName());
			
		}
		
	}
	class HeightCompare implements Comparator<Mountain>
	{
		public int compare(Mountain one,Mountain two)
		{
			Integer x=one.getMountainHeight();
			Integer y=two.getMountainHeight();
			return x.compareTo(y);
					
		}
		
	}
	public static void main(String [] args){
		new SortMountains().go();
	}
	public void go()
	{
		mtn.add(new Mountain("Ankur",14));
		mtn.add(new Mountain("Ankur", 15));
		mtn.add(new Mountain("UElbert", 146));
		System.out.println("as entered :\n" + mtn);
		NameCompare nc = new NameCompare();
		Collections.sort(mtn, nc);
		System.out.println("by name:\n" + mtn);
		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn, hc);
		System.out.println("by name:\n" + mtn);
		//HashSet<Mountain> MountainSet = new HashSet<Mountain>();
		
		//Below Code would use toCompare() method for comparing any element before adding
		//TreeSet<Mountain> MountainSet = new TreeSet<Mountain>();
		
		//Below Code use name comparator for adding any new element in Mountain Set
		TreeSet<Mountain> MountainSet = new TreeSet<Mountain>(nc);
		//MountainSet.add(new Mountain("AAA",15));
		MountainSet.addAll(mtn);
		System.out.println("by name:\n" + MountainSet); 
		
	}

}
class Mountain implements Comparable<Mountain>{
	String name;
	Integer height;
	
	Mountain(String n,int h)
	{
		name=n;
		height=h;
		
		}
	public String getMountainName()
	{
		return name;
	}
	public Integer getMountainHeight()
	{
		return height;
	}
	public String toString( ) {
		return name ;
		}
	/*public boolean equals(Object aMountain){
		Mountain s=(Mountain)aMountain;
		//return getMountainHeight().equals(s.getMountainHeight());
		return getMountainName().equals(s.getMountainName());
		}
	/*public int hashCode(){
		System.out.println(name.hashCode());
		return name.hashCode();
	}*/
	@Override
	public int compareTo(Mountain arg0) {
		// TODO Auto-generated method stub		
		return name.compareTo(arg0.getMountainName());
	}
	
	}
	
	

