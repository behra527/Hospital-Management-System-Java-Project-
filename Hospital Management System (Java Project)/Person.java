public class Person{
	private String name;
	private int id;
	private String address;
	private int contact;
	private String password;
	public Person()
	{
		this.name="null";
		this.id=0;
		this.address="null";
		this.contact=0;
		this.password="null";
	}
	public Person(String name,int id,String address,int contact,String password)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.contact=contact;
		this.password=password;
	}
	public Person(Person p){
		this.name=p.name;
		this.id=p.id;
		this.address=p.address;
		this.contact=p.contact;
		this.password=p.password;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public int getID()
	{
		return id;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
	public void setContact(int contact)
	{
		this.contact=contact;
	}
	public int getContact()
	{
		return contact;
	}
	public void display()
	{
		System.out.println("ID :" +getID());
		System.out.println("Name :" +getName());
		System.out.println("Address :" +getAddress());
		System.out.println("Contact :" +getContact());
		System.out.println("Password:"+getPassword());
	}
	
}