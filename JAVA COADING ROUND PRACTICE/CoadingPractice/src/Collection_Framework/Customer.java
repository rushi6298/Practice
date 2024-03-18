package Collection_Framework;

public class Customer implements Comparable<Customer>
{
	private int custid;
	private  String city;
	private  String name;
	private  String email;
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", city=" + city + ", name=" + name + ", email=" + email + "]";
	}
	public Customer(int custid, String city, String name, String email) {
		super();
		this.custid = custid;
		this.city = city;
		this.name = name;
		this.email = email;
	}
	public Customer() {
		super();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		int citycode=0;
		{
			
			if(city=="Pune")
				citycode=10;
			else if(city=="nashik")
				citycode=20;
			else if(city=="mumbai")
				citycode=30;
			else
				citycode=40;
		}
		return citycode;
		
	}
	@Override
	public boolean equals(Object obj)
	{
		// TODO Auto-generated method stub
		//return super.equals(obj);
		Customer c=null;
		if(obj instanceof Customer)
			c=(Customer)obj;
		boolean flag=false;
		if(this.custid==c.custid && this.name.equals(c.name))
		{
			flag=true;
		}
		return flag;
		
		
		
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		//return difference between two customrs
		
		return this.custid-o.custid;
	}
	
	

}
