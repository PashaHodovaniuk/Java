public class Outstr {
	private Outstr() {
	};

	public static void printstr(String s) {
		int offSet_a = Character.getNumericValue('a');
		String err = "";
		for (int line = 0; line < LetStorage.GetLinghtStrLine(); line++) {
			for (int column = 0; column < s.length(); column++) {
				try {
					InOut.Out(LetStorage.GetStr(line, Character.getNumericValue(s.charAt(column)) - offSet_a));
				} catch (IndexOutOfBoundsException e) {
					if (line == 0)
						err += s.charAt(column);
				}
			}

			InOut.Outln("");
		}
		InOut.Outln("Missing character: " + err);
	}
}