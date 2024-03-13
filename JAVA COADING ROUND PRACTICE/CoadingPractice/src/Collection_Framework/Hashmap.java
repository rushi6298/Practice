package Collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Hashmap {

	public static void main(String[] args)
	{
		/*//Set<Integer> numbers=new HashSet<Integer>();
		//default hashcode() criteria added 
		//Set<Integer> numbers=new LinkedHashSet<Integer>();
		Set<Integer> numbers=new TreeSet<Integer>();
		numbers.add(20);
		numbers.add(15);
		numbers.add(26);
		numbers.add(207);
		numbers.add(50);
		numbers.add(20);
		numbers.remove(20);
		for(int n : numbers)
		{
			System.out.println(n);
		}*/
		Set<Customer> customer = new HashSet<>();
		customer.add(new Customer(101,"Pune","Ruhsikesh","rwaikar4@gmail.com"));
		customer.add(new Customer(102,"Pune","sanklap","sanklp@gmail.com"));
		customer.add(new Customer(103,"mumbai","dyaneshwar","dyaneshwar@gmail.com"));
		customer.add(new Customer(104,"nashik","tejas","tejas@gmail.com"));
		customer.add(new Customer(105,"kolhpaur","shivani","shivani@gmail.com"));
		customer.add(new Customer(105,"Pune","mrunal","mrunal@gmail.com"));
		for(Customer c : customer)
		{
			System.out.println(c);
		}

	}

}
