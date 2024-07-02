package generics.ex.io;

public class P implements Comparable<P>{

	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	public P(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
public P() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(P o) {
		return this.city.compareTo(o.city);
	}	
}