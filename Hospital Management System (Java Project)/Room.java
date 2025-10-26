 import java.util.*;
 public class Room{
	private int rNum;
	private int stay;
	private String rType;
	private double rPrice;
	private boolean isEmpty;
	private Person person;
	
	public Room(int rNum, String rType,int stay, double rPrice, boolean isEmpty,String name,int id,String address,int contact,String password){
		this.rNum=rNum;
		this.stay=stay;
		this.rType=rType;
		this.rPrice=rPrice;
		this.isEmpty=isEmpty;
		this.person=new Person(name,id,address,contact,password);
		}
		public Room(int rNum, String rType, double rPrice,boolean isEmpty){
		this.rNum=rNum;
		this.stay=0;
		this.rType=rType;
		this.rPrice=rPrice;
		this.isEmpty=isEmpty;
		this.person=new Person();
		}
		public Room(int stay,boolean isEmpty,String name,int id,String address,int contact,String password){
		this.stay=stay;
		this.isEmpty=isEmpty;
		this.person=new Person(name,id,address,contact,password);
		}
	public void setNum(int rNum){
		this.rNum=rNum;
	}
	public int getID(){
		return person.getID();
	}
	public String getPassword(){
		return person.getPassword();
	}
	public void setType(String rType){
			this.rType=rType;
	}
	public void setPrice(double rPrice){
		this.rPrice=rPrice;
	}
	public void setAvailbility(boolean isEmpty){
		this.isEmpty=isEmpty;
	}
	public int getNum(){
		return rNum;
	}
	public void setStay(int stay){
		this.stay=stay;
	}
	public int getStay(){
		return stay;
	}
	public String getType(){
			return rType;
	}
	public double getPrice(){
		return rPrice*stay;
	}
	public boolean getAvailbility(){
		return isEmpty;
	}
	public void display(){
		System.out.println("Room ID: "+getNum());
		System.out.println("Room is empty:"+getAvailbility());
		System.out.println("Single Or double bed: "+getType());
		person.display();
		System.out.println("Number of Day stay: "+getStay());
		System.out.println("Room Price: "+getPrice());
	}
	public void print(){
		System.out.println("Room ID: "+getNum());
		System.out.println("Room Price: "+getPrice());
		person.display();
		
	}
}