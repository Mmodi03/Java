package empdata;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default d = new Default();
		System.out.println("id: " + d.id);
		System.out.println("name: " + d.name);
		System.out.println("salary: " + d.salary);

		Default d1 = new Default(1, "mahir", 900000);
		System.out.println("id: " + d1.id);
		System.out.println("name: " + d1.name);
		System.out.println("salary: " + d1.salary);
	}

}
