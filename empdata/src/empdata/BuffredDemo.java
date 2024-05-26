package empdata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffredDemo {

	public static void main(String[] args) {
		try {
			BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter id: ");
			int id = Integer.parseInt(b.readLine());
			System.out.println("enter name: ");
			String name = b.readLine();
			System.out.println("enter salary: ");
			int salary = Integer.parseInt((b.readLine()));
			System.out.println(id + " " + name + " " + salary);
		} catch (IOException e) {

		}
	}

}
