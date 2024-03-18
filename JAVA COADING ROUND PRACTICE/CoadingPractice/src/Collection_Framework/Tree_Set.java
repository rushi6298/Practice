package Collection_Framework;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args)
	{
		//Set<>

		Set<Customer> cust= new TreeSet<Customer>();
		cust.add(new Customer(501,"pune","Ramesh","ramesh@yahoo.com"));
		cust.add(new Customer(402,"nashik","Mohan","mohan@yahoo.com"));
		cust.add(new Customer(903,"mumbai","Rupesh","rupesh@yahoo.com"));
		cust.add(new Customer(804,"satara","Shivani","shivani@yahoo.com"));
		cust.add(new Customer(545,"pune","Rushikesh","rushikesh@yahoo.com"));
		for(Customer c:cust)
		{
			System.out.println(c);
		}
		
		

	}

}
