import java.util.*;

class Emp
{
	String names;
	
	public Emp(String names)
	{
	this.names=names;	
	}

public String toString()
{
	return this.names;
}
}
public class SetExample 
{
	public static void main(String[] args)
	{
		HashSet<Emp> n1=new HashSet<Emp>();
		HashSet<Emp> n2=new HashSet<Emp>();
		n1.add(new Emp("Ram"));
		n1.add(new Emp("Shyam"));
		n1.add(new Emp("Rohan"));
		System.out.println("The first string is: "+n1);
		n2.add(new Emp("Sita"));
		n2.add(new Emp("Radhika"));
		n2.add(new Emp("Gita"));
		System.out.println("The second string is: "+n2);
		n1.addAll(n2);
		System.out.println("The resultant string is: "+n1);
	}

}
