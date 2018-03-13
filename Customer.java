
public class Customer {
	String email;
	String type;
	String location;
	String name;
	public Customer(String name,String email, String type,String location) {
		this.name = name;
		this.type = type;
		this.email = email;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString(){
		
		return (name + " " + location);
		
		
	}
	
	
	


}
