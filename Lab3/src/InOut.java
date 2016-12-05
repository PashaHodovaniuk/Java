import java.util.Scanner;

public class InOut {

	private static Scanner in = new Scanner(System.in);

	public static String In() {
		return in.next();
	}

	public static void Out(String text) {
		System.out.print(text);
	}

	public static void Outln(String text) {
		System.out.println(text);
	}
}