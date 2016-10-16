import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		CopyFile file;
		try {
			file = new CopyFile(args);
			file.working();
			file.Close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		NormalType.infoType();
	}

}
