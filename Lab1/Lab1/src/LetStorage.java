public class LetStorage {
	private LetStorage() {
	}

	private static final int LINGHT_STR_LINE = 9;
	private static final String[][] str = {
			{ "      **        ", "   *********    ", "    ********    ", "    *****       ", "    ********    " },
			{ "     *  *       ", "   *        *   ", "    *           ", "    *    *      ", "    *           " },
			{ "    *    *      ", "   *         *  ", "    *           ", "    *     *     ", "    *           " },
			{ "   *      *     ", "   *        *   ", "    *           ", "    *      *    ", "    *           " },
			{ "   *      *     ", "   *********    ", "    *           ", "    *      *    ", "    ********    " },
			{ "   ********     ", "   *        *   ", "    *           ", "    *      *    ", "    *           " },
			{ "   *      *     ", "   *         *  ", "    *           ", "    *     *     ", "    *           " },
			{ "   *      *     ", "   *        *   ", "    *           ", "    *    *      ", "    *           " },
			{ "   *      *     ", "   *********    ", "    ********    ", "    *****       ", "    ********    " } };

	public static String GetStr(int line, int column) {
		return str[line][column];
	}

	public static int GetLinghtStrLine() {
		return LINGHT_STR_LINE;
	}
}
