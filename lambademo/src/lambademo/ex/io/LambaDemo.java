package lambademo.ex.io;

public class LambaDemo {

	public static void main(String[] args) {
		IStatement s = () -> {return "hello world";};
		System.out.println(s.show());
	}

}
